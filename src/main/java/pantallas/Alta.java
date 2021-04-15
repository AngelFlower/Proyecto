package pantallas;

import modelos.Cliente;
import modelos.Pantalla;
import modelos.Producto;
import modelos.Servicio;

public class Alta extends Pantalla{

    Cliente cliente = new Cliente();
    Producto producto = new Producto();
    Servicio servicio = new Servicio();

    private void ui(){
        inicioPantalla();
        imprimir("Escriba el número correspondiente a lo que desea dar de alta\n");
        imprimir("1) Cliente");
        imprimir("2) Producto");
        imprimir("3) Servicio");
        imprimir("4) Regresar al menú");
        imprimirSinSalto("");
        menu(leerEntero());
    }

    public Alta (){
        ui();
    }

    private void menu (int opcion){
        switch (opcion){
            case 1:
                cliente.ingresarDatos();
                cliente.mostrarDatos();
                altaCliente();
                break;
            case 2:
                producto.ingresarDatos();
                producto.mostrarDatos();
                altaProducto();
                break;
            case 3:
                servicio.ingresarDatos();
                break;
            case 4:
                ui();
                break;
            default:
                imprimir("Opción inválida");
        }
    }

    public void altaProducto(){
        Menu.getBd().ejecutarSentenciaSQL(
                "INSERT INTO `producto` (`id_producto`, `nombre`, `descripcion`, `id_categoria`, `precio`) " +
                        "VALUES (NULL,'" +  producto.getNombre() + "','" + producto.getDescripcion() + "','"
                        + producto.getCategoria() + "','" + producto.getPrecio() + "')");
    }
    public void altaServicio(){
        Menu.getBd().ejecutarSentenciaSQL(
                "INSERT INTO `servicio` (`id_servicio`, `nombre`, `descripcion`, `precio`) " +
                        "VALUES (NULL,'" +  servicio.getNombre() + "','" + servicio.getDescripcion() + "','" + servicio.getPrecio() + "')");
    }
    public void altaCliente(){
        Menu.getBd().ejecutarSentenciaSQL(
                "INSERT INTO `cliente` (`id_cliente`, `correo`, `nombre`, `apellidos`) " +
                        "VALUES (NULL,'" +  cliente.getCorreo()+ "','" + cliente.getNombre()+ "','"
                        + cliente.getApellidos() + "')");
    }

    private void secuenciaSQL(){
        System.out.println("Simulación de SQL");
    }

}
