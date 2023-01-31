package Unidad2;

import java.util.Locale;

public class Clase3 {
    public static void main(String[] args) {
        String name = "Duvan";
        boolean esIgual = name.equals("Duvan");

        System.out.println("name = " + esIgual);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        //Obtener ultimo caracter
        //Se pasa como argumento LENGTH y se le resta 1
        System.out.println(name.charAt(name.length()-1));
    }
}
