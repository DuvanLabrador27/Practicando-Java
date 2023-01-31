package Unidad4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class numDescendente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese n numeros: ");
        int n = sc.nextInt();
        List<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los numeros que desee: ");
            int num = sc.nextInt();
            lista.add(num);
        }
        Collections.reverse(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }


    }
}
