package Unidad2;

public class Clase4 {
    public static void main(String[] args) {
        String formato = "hola_esto_es_un.video.js";
        int extension = formato.lastIndexOf(".");

        System.out.println("formato.length() = " + formato.length());
        System.out.println(formato.substring(extension+1));
        System.out.println(formato.charAt(formato.length()-1));
        System.out.println(formato.lastIndexOf("s"));
        System.out.println(formato.substring(formato.length()-1));

    }
}
