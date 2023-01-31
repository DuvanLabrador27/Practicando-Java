package Unidad4;

import java.util.Scanner;

public class numeroMayor {
    public static void main(String[] args) {
//Determinar el numero mayor
        Scanner sc = new Scanner(System.in);

        int i = 0;

        boolean isTrue = false;
        int cantidadNumeros = 0;
        int mayor=0;

        while(isTrue==false){
            System.out.println("Ingresa la cantidad de numeros: ");
            cantidadNumeros = sc.nextInt();

            if(cantidadNumeros>=5){
                isTrue=true;
                for (int j = 0; j < cantidadNumeros; j++) {
                    System.out.println("Ingresa el  numero " + (j+1) + ": ");
                    int numeroIngresar = sc.nextInt();
                    if(j==0){
                        mayor=numeroIngresar;
                    }else if(numeroIngresar>mayor){
                        mayor=numeroIngresar;
                    }
                }
                System.out.println("El numero mayor es " + mayor);
            }
            else{
                System.out.println("Lo sentimos numero incorrecto debe ser mayor o igual a 5, intentalo de nuevo!!");
            }
            i++;
        }






    }
}
