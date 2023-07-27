package mylibrary;

import java.sql.Connection;
import java.sql.SQLException;


public class main {
    public static void main(String[] args) {
        Menu m = new Menu();
        m.menuApp();
        Conexion conectDB = new Conexion();

        try (Connection conect = conectDB.getConexion()){

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}

