package Unidad4;

import java.util.Scanner;

public class NotasEstudiantes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de notas: ");
        int cantidadDeNotas = sc.nextInt();

        double[] notasAlumnos = new double[cantidadDeNotas];
        double promedioUno = 0.0;
        double sumaUno = 0.0;

        double promedioDos = 0.0;
        double sumaDos = 0.0;

        int contadorUno = 0;
        int contadorDos = 0;
        int contadorTres =0;

        double promedioTotal = 0.0;
        double sumaTotal = 0.0;

        for (int i = 0; i < notasAlumnos.length; i++) {
            System.out.println("Escala 1 a 7 ");
            System.out.println("Ingrese la nota " + (i+1) + ": ");
            notasAlumnos[i] = sc.nextDouble();
            sumaTotal = sumaTotal + notasAlumnos[i];
            promedioTotal = sumaTotal / cantidadDeNotas;
            if(notasAlumnos[i]>=5){
                contadorUno++;
                sumaUno = sumaUno + notasAlumnos[i];
                promedioUno = (sumaUno / contadorUno);
                System.out.println("El promedio es: " + promedioUno);

            }
            else if( notasAlumnos[i] >=2 && notasAlumnos[i]<=4){
                contadorDos++;
                sumaDos = sumaDos + notasAlumnos[i];
                promedioDos = sumaDos/contadorDos;
                System.out.println("El promedio es: " + promedioDos);

            }
            else if(notasAlumnos[i]==1){
                contadorTres++;
                System.out.println("Hay " + contadorTres + " notas en 1");


            }
            else if(notasAlumnos[i]==0 || notasAlumnos[i] > 7){
                System.out.println("Lo sentimos error!! la nota debe ser de 1 a 7");
                break;
            }

        }
        System.out.println("------------------------------------------");
        System.out.println("El promedio total es: "+  promedioTotal);

    }
}
