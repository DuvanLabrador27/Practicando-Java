package Unidad3;

import java.util.Scanner;

public class ProbandoSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = sc.nextLine();
        String[] fragmento = nombre.split(" ");
        for (int i = 0; i < fragmento.length; i++) {
            System.out.print(fragmento[i].concat(" "));
        }

    }
}
