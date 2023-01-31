package Unidad4;

import java.util.Scanner;

public class ProbandoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];
        nombres[0]="Duvan";
        nombres[1]="Javier";
        nombres[2]="Valerie";
        nombres[3]="Messi";
        nombres[4]="Mbappe";

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(i + ". ".concat(nombres[i]));

        }
        System.out.println("Ingrese el nombre a buscar: ");
        String buscar = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < nombres.length; i++) {
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado=true;
                break;
            }
        }
        if (encontrado){
            System.out.println("El usuario ".concat(buscar).concat(" Fue encontrado!!"));
        }
        else{
            System.out.println("El usuario ".concat(buscar).concat(" No fue encontrado!!"));
        }


    }
}
