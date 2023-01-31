package Unidad3;

import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {

        String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "Duvan";
        passwords[0] = "123";

        usernames[1] = "Admin";
        passwords[1] = "123";



        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.nextLine();

        System.out.println("Ingrese el password");
        String p = scanner.nextLine();

        boolean esAutenticado = false;
        for (int i = 0; i < usernames.length;i++) {
            if (usernames[i].equals(u) && passwords[i].equals(p)) {
                esAutenticado = true;
                break;
            }
        }
        if(esAutenticado){
            System.out.println("Bienvenido Usuario ".concat(u).concat(" Su contraseña es: ").concat(p.substring(0)));
        }else{
            System.out.println("Usuario o Password incorrectos!");
            System.out.println("Lo siento, requiere autenticación");
        }




       }
    }

