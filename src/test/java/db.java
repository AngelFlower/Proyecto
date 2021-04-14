
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class db {
    // creacion de variables de tipo privadas para la conección
    private Connection con;
    private Statement st;
    private ResultSet rs;


    public db(){

        try{
            // coneccion a la base de datos
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda_db", "root","");
            //crear el objeto Statement
            st =con.createStatement();

            System.out.println("Conectado");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void getDatos(){

        try{
            //ejecutar el sql de consulta
            String query= "SELECT * FROM puesto";
            rs = st.executeQuery(query);

            while(rs.next()){
                String id_puesto =rs.getString("id_puesto");
                String nombre =rs.getString("nombre");

                System.out.println("Id puesto: " +id_puesto + "\nNombre: " +nombre);
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }finally{

            try{
                con.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }


    }

}
