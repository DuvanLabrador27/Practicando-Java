package Unidad4;

import java.util.Scanner;

public class PosicionesCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        boolean letra = false;
        int cont = 0;
        char letraB = 'l';
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == letraB) {
                letra = true;
                cont = cont + 1;
                System.out.println(frase.charAt(i));
                System.out.println(frase.indexOf(letraB));
            }
        }
        System.out.println("La letra " + letraB + " se ha encontrado " + cont + " veces");

    }
}
