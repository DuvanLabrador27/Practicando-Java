package Unidad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas: ");
        String nombreSep="";
        String resultado = "";
        List<String> lista = new ArrayList<String>();
        int cantidadPersonas = sc.nextInt();
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingrese el nombre: " + i);
            String nombre =sc.next();
             nombreSep = (nombre.substring(1,2).toUpperCase()).concat(".").concat(nombre.substring(nombre.length()-2));
             lista.add(nombreSep);


        }
        System.out.println("resultado = " + lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i).concat("_"));
        }



       

    }
}
