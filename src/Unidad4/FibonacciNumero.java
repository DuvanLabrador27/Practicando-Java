package Unidad4;

import java.util.Scanner;

public class FibonacciNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anterior = 0;
        int actual = 1;
        int aux ;

        System.out.println("Ingrese el numero hasta donde desea calcular la serie: ");
        int numero = sc.nextInt();

        for (int i = 1; i < numero; i++) {
           aux= anterior;
           anterior = actual + anterior;
           actual= aux;
            System.out.println(anterior);
        }

    }
}
