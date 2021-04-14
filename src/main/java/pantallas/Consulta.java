package pantallas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Consulta {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    public Consulta(){

        try{

            Class.forName("com.mysql.jdbc.Driver");
            con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/robles_db", "root","");
            st =(Statement) con.createStatement();

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void getDatos(String nombreIngresado){

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
        }finally{

            try{
                con.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
}