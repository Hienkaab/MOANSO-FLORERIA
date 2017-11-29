
package Conexion;

import java.sql.*;

public class Conexion {

    public static void main(String[] args) {
        getConexion();
    }

    public static Connection getConexion() {
     Connection cnx=null;
         try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         System.out.println("Driver activado...");
         cnx=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
         + "database=Floreria;user=sa;password=123456;");
         System.out.println("Conectado..");
         }catch(Exception e){
         System.out.println("Error: "+e);
         }
         return cnx;
    }   
}
