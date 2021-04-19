package pantallas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import modelos.Pantalla;


public class Consulta extends Pantalla {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    public Consulta(){
      Consulta20();
        try{

            Class.forName("com.mysql.jdbc.Driver");
            con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/robles_db", "root","");
            st =(Statement) con.createStatement();

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    //CATEGORIA
    public void getDatosCategoria(String nombreIngresado){

        try{
            String query= "SELECT * FROM categoria WHERE id_categoria LIKE"+ "'%"+ nombreIngresado + "%'";
            rs = st.executeQuery(query);

            while(rs.next()){
                String id_categoria =rs.getString("id_categoria");
                String nombre =rs.getString("nombre");

                System.out.println("Id categoria: " +id_categoria + "\nNombre: " +nombre);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    //CLIENTE
    public void getDatosCliente(String nombreIngresado){

        try{
            String query= "SELECT * FROM cliente WHERE id_cliente LIKE"+ "'%"+ nombreIngresado + "%'";
            rs = st.executeQuery(query);

            while(rs.next()){
                String id_cliente =rs.getString("id_cliente");
                String correo =rs.getString("correo");
                String nombre =rs.getString("nombre");
                String apellidos =rs.getString("apellidos");

                System.out.println("Id cliente: " +id_cliente + "\nCorreo: " +correo + "\nNombre: "+nombre + "\nApellidos: "+apellidos);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    //PRODUCTO
   public void getDatosProducto(String nombreIngresado){

        try{
            String query= "SELECT * FROM producto WHERE id_producto LIKE"+ "'%"+ nombreIngresado + "%'";
            rs = st.executeQuery(query);

            while(rs.next()){
                String id_producto =rs.getString("id_producto");
                String nombre =rs.getString("nombre");
                   String descripcion =rs.getString("descripcion");
                      String id_categoria =rs.getString("id_categoria");
                         String precio =rs.getString("precio");

                System.out.println("Id producto: " +id_producto + "\nNombre: " +nombre + "\nDescripcion: "+descripcion +"\nId categoria: "+id_categoria + "\nPrecio: "+precio);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    //SERVICIO
    public void getDatosServicio(String nombreIngresado){

        try{
            String query= "SELECT * FROM servicio WHERE id_servicio LIKE"+ "'%"+ nombreIngresado + "%'";
            rs = st.executeQuery(query);

            while(rs.next()){
                String id_servicio =rs.getString("id_servicio");
                String nombre =rs.getString("nombre");
                String descripcion =rs.getString("descripcion");
                String precio =rs.getString("precio");

                System.out.println("Id categoria: " +id_servicio + "\nNombre: " +nombre + "\nDescripción: "+descripcion + "\nPrecio: "+precio);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }    
    }
    
    public void Consulta20() {
        
        imprimir("Estas en consultas");
          
//CATEGORIA
        Scanner entrada = new Scanner(System.in);
        imprimir("Ingresa el numero de la categoria");
        String nombre = entrada.nextLine();
        Consulta con = new Consulta ();
        con.getDatosCategoria(nombre);
//CLIENTE
   imprimir("Ingresa el numero del cliente");
         String nombre1 = entrada.nextLine();
         con.getDatosCliente(nombre1);

//PRODUCTO
  imprimir("Ingresa el numero del producto");
         String nombre2 = entrada.nextLine();
         con.getDatosProducto(nombre2);
    
//SERVICIO
  imprimir("Ingresa el numero del servicio");
         String nombre3 = entrada.nextLine();
         con.getDatosServicio(nombre3);
        
    }
    
    
    
    
  
    
}
