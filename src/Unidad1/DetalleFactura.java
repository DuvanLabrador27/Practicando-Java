package Unidad1;

import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        System.out.println("-------------------------DETALLE FACTURA-------------------------------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura: ");
        String nombreFactura = sc.nextLine();

        System.out.println("Ingrese el precio del producto #1: ");
        double productoUno = sc.nextDouble();

        System.out.println("Ingrese el precio del producto #2: ");
        double productoDos = sc.nextDouble();

        System.out.println(nombreFactura);

        System.out.println(
                "Lista de los productos comprados: \n " +
                "1. PLAY STATION \n" +
                " 2. APPLE WATCH");

        double totalAPagar = (productoUno+productoDos);
        System.out.println("El total del producto a pagar sin impuesto es: " + totalAPagar);

        double impuesto = 0.19;
        double calcularImpuesto = (totalAPagar*impuesto);
        System.out.println("El impuesto es: " + calcularImpuesto);

        double totalFactura = (totalAPagar+calcularImpuesto);
        System.out.println("El total del producto a pagar con impuesto es: " + totalFactura);



        System.out.println("---------------------------FIN FACTURA---------------------------------");
    }
}
