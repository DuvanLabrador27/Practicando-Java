package Unidad4;

import java.util.Scanner;

public class NombresForEch {
    public static void main(String[] args) {
        //Hacer ejercicio que me almacene user and pass en un array con el ciclo forEach
        //1. Acceder al sistema
        //2. Buscar un usuario en el sistema
        Scanner sc = new Scanner(System.in);
        String[] usernamesCreate = new String[3];
        String[] passwordCreate = new String[3];

        usernamesCreate[0] = "duvan";
        usernamesCreate[1] = "javier";
        usernamesCreate[2] = "valerie";

        passwordCreate[0] = "123";
        passwordCreate[1] = "123";
        passwordCreate[2] = "123";

        for (String i: usernamesCreate){
            System.out.println(i);
        }

        System.out.println("Ingrese el nombre de usuario: ");
        String user = sc.nextLine();

        System.out.println("Ingrese la contraseña de usuario: ");
        String pass = sc.nextLine();

        boolean estadoLogin = false;
        boolean buscarUser = false;
        for (int i = 0; i < usernamesCreate.length; i++) {
            if (usernamesCreate[i].equals(user) && passwordCreate[i].equals(pass)){

                estadoLogin = true;
            }
        }
        if(estadoLogin){
            System.out.println("Bienvenido ".concat(user).concat(" usted puede realizar la accion de buscar otro usuario!!"));

            System.out.println("Ingrese un nombre a buscar: ");
            String nombreBuscar = sc.nextLine();
            for (int j = 0; j < usernamesCreate.length; j++) {
                if(usernamesCreate[j].equalsIgnoreCase(nombreBuscar)){
                    buscarUser = true;
                }

            }
            if(buscarUser){
                System.out.println("El usuario ".concat(nombreBuscar).concat("  existe!!"));
            }
            else {
                System.out.println("El usuario ".concat(nombreBuscar).concat(" no existe!!"));
            }


        }
        else {
            System.out.println("Lo sentimos el usuario  ".concat(user).concat(" tiene las credenciales incorrectas!!"));
        }


    }
}
