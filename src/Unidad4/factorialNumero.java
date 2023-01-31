package Unidad4;

import java.util.Scanner;

public class factorialNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Ingrese el numero al que le desea sacar el factorial: ");
        int numero = sc.nextInt();

        for (int i = 1; i < numero+1; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
