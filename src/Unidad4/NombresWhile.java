package Unidad4;

import java.util.Scanner;

public class NombresWhile {
    public static void main(String[] args) {
        //Hacer ejercicio que me almacene nombres en un array con el ciclo while
        //Determinar si el nombre esta en el array
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        names[0] = "Duvan";
        names[1] = "Javier";
        names[2] = "Valerie";
        names[3] = "Maria";
        names[4] = "Mbappe";

        int i = 0;
        while(i < names.length){
            System.out.println(names[i]);
            i++;
        }

        System.out.println("Ingrese el nombre a buscar: ");
        String nombreBuscar = sc.nextLine();
        boolean encontrado = false;
        int j = 0;
        while(j < names.length){
            if(names[j].equalsIgnoreCase(nombreBuscar)){
                encontrado = true;
            }
            j++;
        }
        if (encontrado){
            System.out.println("El usuario ".concat(nombreBuscar).concat(" existe!!"));
        }
        else {
            System.out.println("El usuario ".concat(nombreBuscar).concat(" no existe!!"));
        }



    }
}
