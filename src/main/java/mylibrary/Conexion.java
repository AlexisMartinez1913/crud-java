package mylibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexion {

    public Connection getConexion(){
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/mylibrary", "root", "");
            if (conexion!=null){
                System.out.println("Conexion Exitosa");
            }
            //Statement comando=conexion.createStatement();
        }catch (SQLException e){
            System.out.println(e);

        }
        return conexion;
    }
}
