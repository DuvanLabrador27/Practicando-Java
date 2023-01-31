package Unidad3;

import java.util.Scanner;

public class NombreMasLargo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre #1: ");
        String nombreUno = sc.nextLine();
        System.out.println("Ingrese el nombre #2: ");
        String nombreDos = sc.nextLine();
        System.out.println("Ingrese el nombre #3: ");
        String nombreTres = sc.nextLine();

        if (nombreUno.length() > nombreDos.length() && nombreUno.length() > nombreTres.length()){
            System.out.println(nombreUno.concat(" Tiene el nombre más largo"));
        }
        else if (nombreDos.length() > nombreUno.length() && nombreDos.length() > nombreTres.length()){
            System.out.println(nombreDos.concat(" Tiene el nombre más largo"));
        }
        else if(nombreTres.length() > nombreUno.length() && nombreTres.length() > nombreDos.length()){
            System.out.println(nombreTres.concat(" Tiene el nombre más largo"));
        }

        System.out.println("nombreUno = " + nombreUno.length());
        System.out.println("nombreDos = " + nombreDos.length());
        System.out.println("nombreTres = " + nombreTres.length());
    }
}
