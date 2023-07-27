package mylibrary;

import java.util.Scanner;


public class CostumerServices {
    static Scanner sc = new Scanner(System.in);

    public static void CreateCostumer(){
        System.out.println("Identificacion: ");
        int id = sc.nextInt();
        System.out.println("Tipo de documento: ");
        String type = sc.next();
        System.out.println("Ingrese el nombre: ");
        String name = sc.next();
        System.out.println("Ingrese el apellido: ");
        String last_name = sc.next();
        System.out.println("Ingrese el email: ");
        String email = sc.next();
        System.out.println("Ingrese el programa: ");
        String program = sc.next();
        CostumerModel registro = new CostumerModel();
        registro.setDocument_id(id);
        registro.setDoc_type(type);
        registro.setName(name);
        registro.setLast_name(last_name);
        registro.setEmail(email);
        registro.setProgram(program);
        CostumerDAD.CreateCostumerDB(registro);



    }
    public static void ReadCostumer(){

    }
    public static void UpdateCostumer(){

    }
    public static void DeleteCostumer(){

    }
}
