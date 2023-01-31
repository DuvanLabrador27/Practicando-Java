package Unidad4;

import java.util.Scanner;

public class InsertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese N elementos en el array: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Ingresar el nombre: " + (i+1));
            names[i] = sc.next();
        }

        for(String name : names ){
            System.out.println(name);
        }
    }
}
