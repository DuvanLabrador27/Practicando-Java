package Unidad3;

import java.util.Scanner;

public class NumMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese otro numero: ");
        int num2 = sc.nextInt();

        String compara = num1>num2 ? "Es mayor num1" : "Es mayor num2";
        System.out.println("compara = " + compara);

    }
}
