package Unidad4;

import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros: ");
        int cantNames = sc.nextInt();
        int[] numeros = new int[cantNames];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero: " + (i+1));
            numeros[i] = sc.nextInt();
        }
        for(int i:numeros){
            System.out.println(i);
        }
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]==0){
                menor = numeros[i];
            }else if (numeros[i] < menor){
                menor = numeros[i];
            }


        }
        System.out.println("------------------");
        System.out.println(menor);
    }
}
