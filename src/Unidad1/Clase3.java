package Unidad1;

import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {

        //Clase que me permite ingresar datos por consola
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numeroDos: ");
        String numeroDos = sc.nextLine();
        int numeroDosNew = Integer.parseInt(numeroDos);
        System.out.println("El numeroDos STR convertido a INT es: " + numeroDosNew);

        System.out.println("Ingrese un nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese un numero: ");
        int numeroUno = sc.nextInt();

      System.out.println("Ingrese un numero Real: ");
        double numeroReal = sc.nextDouble();

        System.out.println("El nombre es: " + nombre);
        System.out.println("El numeroUno es: " + numeroUno);
        System.out.println("El numeroReal es: " + numeroReal);

    }
}
