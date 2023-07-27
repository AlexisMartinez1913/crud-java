package mylibrary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface CostumerDAD {
    public static void CreateCostumerDB(CostumerModel cm){
        Conexion dbConect = new Conexion();

        try (Connection conect = dbConect.getConexion()){
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO costumer (document_id, doc_type, name, last_name, email, program) VALUES (?,?,?,?,?,?)";
                ps = conect.prepareStatement(query);
                ps.setInt(1, cm.getDocument_id());
                ps.setString(2, cm.getDoc_type());
                ps.setString(3, cm.getName());
                ps.setString(4, cm.getLast_name());
                ps.setString(5, cm.getEmail());
                ps.setString(6, cm.getProgram());
                ps.executeUpdate();
                System.out.println("Registro Exitoso");

            }catch (SQLException exception){
                System.out.println(exception);

            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void ReadCostumerDB(){

    }
    public static void UpdateCostumerDB(){

    }
    public static void DeleteCostumerDB(){

    }
}
