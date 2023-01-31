package Unidad4;

import java.util.ArrayList;
import java.util.Scanner;

public class OpcionesProductos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        * MENU DE OPCIONES:
        * 1. Agregar producto
        * 2. Actualizar Producto
        * 3. Listar Producto
        * 4. Eliminar Producto
        * 5. Salir!!
        * */

        ArrayList<String> producto = new ArrayList<>();

        boolean salir = false;

        //Inicio while

        while(salir == false){

            System.out.println("MENU DE OPCIONES:\n" +
                    "        1. Agregar producto\n" +
                    "        2. Actualizar Producto\n" +
                    "        3. Listar Producto\n" +
                    "        4. Eliminar Producto\n" +
                    "        5. Salir!!");

            System.out.println("Ingrese la opción que desea realizar: ");
            int opcion = sc.nextInt();
            String nombreProducto = "";

            //Inicio Switch
            switch (opcion){
                case 1 :
                    System.out.println("Agrega un producto: ");
                    nombreProducto = sc.next();
                    producto.add(nombreProducto);
                    System.out.println("Producto agregado con éxito!!");
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del producto a actualizar: ");
                    nombreProducto = sc.next();
                    int indice;
                    indice = producto.indexOf(nombreProducto);
                    if(indice!=-1){
                        System.out.println("Ingrese el nuevo nombre del producto: ");
                        String productoActualizar = sc.next();
                        producto.set(indice,productoActualizar);
                        System.out.println("Producto actualizado Correctamente!!");
                    }else{
                        System.out.println("El producto no existe!!");
                    }
                    break;

                case 3:

                    if(!producto.isEmpty()){
                        System.out.println("Lista de productos: ");
                        for (int i = 0; i < producto.size(); i++) {
                            System.out.println(producto.get(i));
                        }
                    }else{
                        System.out.println("No hay productos que listar");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el nombre del producto que desea eliminar: ");
                   String nombreProductoEliminar = sc.next();
                   int indiceDos = producto.indexOf(nombreProductoEliminar);

                    if(indiceDos!=-1){
                        producto.remove(indiceDos);
                        System.out.println("Producto eliminado!!");
                    }else {
                        System.out.println("El producto no existe!!");
                    }
                    break;

                case 5:
                    System.out.println("Gracias por usar nuestra app!!");
                    salir = true;
                    break;

                default:
                    System.out.println("La opción no existe,intentalo de nuevo!!");

            }
            //Fin Switch

        }
        // Fin while
    }
}
