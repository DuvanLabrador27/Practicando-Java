package Unidad1;

import java.util.Scanner;

public class Clase4 {
    public static void main(String[] args) {

        //CLASE SCANNER
        Scanner sc = new Scanner(System.in);

        //Convertir de STRING a ENTERO
        System.out.println("---------------------------------------- ");
        System.out.println("Ingrese un STR numero: ");
        String numero = sc.nextLine();
        int numeroEntero = Integer.parseInt(numero);
        System.out.println("numeroEntero = " + numeroEntero);

        //Convertir de ENTERO a STRING
        System.out.println("---------------------------------------- ");
        System.out.println("Ingrese un INT numero: ");
        int numeroEnteroDos = sc.nextInt();
        String numeroString = Integer.toString(numeroEntero);
        System.out.println("numeroString = " + numeroString);

        //Convertir de STRING a DOUBLE
        System.out.println("---------------------------------------- ");
        System.out.println("Ingrese un STR real numero: ");
        String numeroReal = sc.next();
        double numeroRealDos = Double.parseDouble(numeroReal);
        System.out.println("numeroRealDos = " + numeroRealDos);

        //Convertir de DOUBLE a STRING
        System.out.println("---------------------------------------- ");
        System.out.println("Ingrese un numero REAL: ");
        double numeroDouble = sc.nextDouble();
        String numeroStringReal = Double.toString(numeroDouble);
        System.out.println("numeroStringReal = " + numeroStringReal);

        //Convertir de INT a DOUBLE
        System.out.println("---------------------------------------- ");
        System.out.println("Ingrese un numero INT NEW: ");
        int n1 = sc.nextInt();
        double n1D = (double) n1;
        System.out.println("n1D = " + n1D);

        //Convertir de DOUBLE a INT
        System.out.println("---------------------------------------- ");
        System.out.println("Ingrese un numero REAL NEW: ");
        double n2 = sc.nextDouble();
        int n2I = (int) n2;
        System.out.println("n2I = " + n2I);



    }
}
