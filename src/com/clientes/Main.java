package com.clientes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String menu =
                        "         * 1 Agregar cliente\n" +
                        "         * 2 Editar cliente\n" +
                        "         * 3 Eliminar cliente\n" +
                        "         * 4 Agregar productos\n" +
                        "         * 5 Consultar clientes con documento y tipo de documento \n" +
                        "         * 0 salir de la aplicacion";
        Scanner in = new Scanner(System.in);


        //Uso clico do while() para iniciar menu
        @Deprecated(since = "1.2", forRemoval = true)
        Integer opMenu = new Integer(0);
        /**
         * Segun el concepto de polimorfismo un objeto puede tener multiples formas
         * con la estructura de clase que se entrega por favor implementar el concepto de poliformismo
         */


        do {

            System.out.println(menu);
            System.out.println("\nDigite la opción a realizar:");
            opMenu = in.nextInt();
            switch (opMenu.toString()) {
                case "1":
                    System.out.println("*** Nuevo Cliente ***\n");
                    System.out.println("Cliente creado correctamente\n");
                    break;
                case "2":
                    System.out.println("*** Editar Cliente ***\n");
                    System.out.println("Cliente modificado correctamente\n");
                    break;
                case "3":
                    System.out.println("*** Eliminar Cliente ***\n");
                    System.out.println("Cliente eliminado correctamente\n");
                    break;
                case "4":
                    System.out.println("*** Agregar Productos ***\n");
                    System.out.println("Producto agregado correctamente\n");
                    break;
                case "5":
                    System.out.println("*** Consulta Cliente ***\n");
                    break;
                case "0":
                    System.out.println("Muchas gracias por usar nuestra app, hasta luego");
                    break;
                default:
                    System.out.println("El valor ingresado no es una opcion de menu\n");
                    break;
            }
        } while (!opMenu.toString().equals("0"));
        in.close();

    }
}
