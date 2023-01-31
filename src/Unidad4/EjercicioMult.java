package Unidad4;

import java.util.Scanner;

public class EjercicioMult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el num1: ");
        int numUno = sc.nextInt();

        System.out.println("Ingrese el num2: ");
        int numDos = sc.nextInt();

        int suma = 0;



        for (int i = 1; i <= numDos; i++) {
            suma = suma + numUno;
        }
        System.out.println(suma);
    }
}
