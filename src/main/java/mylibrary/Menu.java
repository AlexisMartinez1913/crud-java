package mylibrary;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    CostumerServices cost = new CostumerServices();

    public void menuApp(){
        int opcion;
        do {
            System.out.println("1. Registrar Usuarios \n");
            System.out.println("2. Listar Usuarios \n");
            System.out.println("3. Actualizar Datos De Usuarios \n");
            System.out.println("4. Eliminar Datos De Usuarios \n");
            System.out.println("5. Salir \n");
            System.out.println("Seleccione una opcion del menu:");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Registrar Usuarios");
                    cost.CreateCostumer();

                    break;
                case 2:
                    System.out.println("Listar Usuarios");
                    break;
                case 3:
                    System.out.println("Actualizar Datos De Usuario");
                    break;
                case 4:
                    System.out.println("Eliminar datos de usuario");
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        }while (opcion!=5);
    }
}
