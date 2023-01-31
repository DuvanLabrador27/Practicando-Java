package Unidad2;

import java.util.Scanner;

public class Clase1 {
    public static void main(String[] args) {
        //String = Es una secuencia de caracteres de tipo objeto
        String name = "Duvan";
        String name2 = "Duvan";

        System.out.println( "Son iguales? " + name.equals(name2) );

        boolean esIgual = false;
        esIgual = name.equals(name2);
        System.out.println("esIgual = " + esIgual);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el num del fact: ");
        int n=sc.nextInt();
        int res=factorial(n);
        System.out.println(res);
    }
    public static int factorial(int n1){
        int fact=1;
        for(int i=1;i<n1+1;i++){
            fact=fact*i;
            System.out.println(fact);
        }
        return fact;
    }
}
