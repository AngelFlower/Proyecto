package bd;


import java.sql.*;

public class BD {

    private Connection conexion;

    public BD() {
        System.out.println(conectarBD());
    }

    public String conectarBD(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            //conexion = DriverManager.getConnection("jdbc:odbc:PRUEBA");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/robles_db","root","");
            return "Se ha conectado la base de datos satisfactoriamente";
        }catch (Exception e){
            return "error:"+e.getMessage();
        }
    }

    public String cerrarBD(){
        try{
            conexion.close();
            return "Se ha cerrado la base de datos satisfactoriamente";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    public ResultSet ejecutarSentenciaSQL(String sentencia){
        System.out.println("Ejecutando");
        try{
            Statement st;

            st = conexion.createStatement();
            System.out.println("Si");

            st.execute(sentencia);
            System.out.println(sentencia);
            //st.getResultSet().first();
            return st.getResultSet();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void finalize(){
        this.cerrarBD();
    }

}