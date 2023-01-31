package Unidad4;

import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una opcion: ");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Opcion 1");
                break;
            case 2:
                System.out.println("Opcion 2");
                break;
            case 3:
                System.out.println("Opcion 3");
                break;
            default:
                System.out.println("No es ninguna opcion!!");
        }
    }
}
