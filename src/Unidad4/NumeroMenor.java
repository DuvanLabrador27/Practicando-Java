package Unidad4;

import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero >= 10");
        int numero = sc.nextInt();
        int numeroIngresado;
        int aux=0;
        if(numero>=10){
            for (int i = 0; i < numero; i++) {
                System.out.println("Ingrese el numero " +  (i+1) + ":");
                numeroIngresado = sc.nextInt();
                if(i==0){
                    aux=numeroIngresado;
                }else if(numeroIngresado<aux){
                    aux = numeroIngresado;
                }
            }


            if(aux<10){
                System.out.println("El numero es menor a 10 y es " +aux);
            }else {
                System.out.println("El numero es mayor a 10 y es " +aux);
            }
        }

        else{
            System.out.println("Lo siento debe se >=10");
        }






    }
}
