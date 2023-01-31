package Unidad4;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBancoYProductos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //ArrayList usernamesCreate
        ArrayList<String> usernameCreate = new ArrayList<>();
        //ArrayList passwordCreate
        ArrayList<String> passwordCreate = new ArrayList<>();

        //ArrayList Productos
        ArrayList<String> productoLista = new ArrayList<>();

        //Creamos una var salirPrincipal la cual me evalúa el primer ciclo de salida de la app
        boolean salirPrincipal = false;
        boolean estadoLogin = false;

        String username = "";
        String password = "";

        //Inicio while
        while (salirPrincipal == false) {

            System.out.println("MENU DE OPCIONES:\n" +
                    "        1. Crear Perfil\n" +
                    "        2. Acceder a la app\n" +
                    "        3. listado de usuarios\n" +
                    "        4. Salir");

            System.out.println("Ingrese la opcion: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de usuario: ");
                    username = sc.next();

                    System.out.println("Ingrese la contraseña: ");
                    password = sc.next();

                    usernameCreate.add(username);
                    passwordCreate.add(password);
                    break;

                case 2:
                    System.out.println("Ingrese las credenciales!! ");

                    System.out.println("Ingrese el nombre de usuario: ");
                    username = sc.next();

                    System.out.println("Ingrese la contraseña: ");
                    password = sc.next();

                    for (int i = 0; i < usernameCreate.size(); i++) {
                        for (int j = 0; j < passwordCreate.size(); j++) {

                            if (usernameCreate.get(i).equals(username) && passwordCreate.get(j).equals(password)) {
                                estadoLogin = true;

                            }
                        }
                    }
                    if (estadoLogin == true) {
                        while (estadoLogin == true) {
                            System.out.println("Bienvenido, tiene disponible las siguientes opciones: ");
                            System.out.println("MENU DE OPCIONES:\n" +
                                    "        1. Modulo Banco\n" +
                                    "        2. Modulo Productos\n" +
                                    "        3. Salir");
                            int opcionLogin = sc.nextInt();
                            switch (opcionLogin) {
                                case 1:
                                    boolean moduloBanco = true;
                                    double saldoInicial = 100;
                                    double saldoActual = saldoInicial;

                                    System.out.println("-------------------------------------------");
                                    System.out.println("Modulo Banco ");
                                    System.out.println("-------------------------------------------");
                                    while (moduloBanco) {
                                        System.out.println("MENU DE OPCIONES:\n" +
                                                "        1. Agregar dinero\n" +
                                                "        2. Retirar dinero\n" +
                                                "        3. Consultar saldo\n" +
                                                "        4. Salir");
                                        System.out.println("Ingrese la opcion: ");
                                        int opcionTres = sc.nextInt();

                                        switch (opcionTres) {
                                            case 1:
                                                    System.out.println("Agregar Dinero: ");
                                                    double agregarDinero = sc.nextDouble();
                                                    saldoActual += agregarDinero;

                                                    System.out.println("Usted a agregado " + agregarDinero + " y su saldo actual es: ".concat(String.valueOf(saldoActual)));

                                                break;

                                            case 2:
                                                System.out.println("Retirar Dinero: ");
                                                double retirarDinero = sc.nextDouble();
                                                if(retirarDinero<=saldoActual){
                                                    saldoActual -= retirarDinero;
                                                    System.out.println("El saldo que retiro es: " + retirarDinero + " y el saldo actualizado es :" + saldoActual);
                                                }else{
                                                    System.out.println("Saldo Insuficiente");
                                                }


                                                break;

                                            case 3:
                                                System.out.println("Consultar Saldo ");
                                                double consultarSaldo = saldoActual;
                                                System.out.println("Su saldo es: " + consultarSaldo);
                                                break;

                                            case 4:
                                                System.out.println("Gracias por usar esta SECCION DEL BANCO!!");
                                                moduloBanco = false;
                                                break;

                                            default:
                                                System.out.println("No existe la opcion!!");
                                        }
                                    }
                                    break;

                                case 2:
                                    System.out.println("------------------------------");
                                    System.out.println("Modulo Productos ");
                                    System.out.println("------------------------------");
                                    boolean estadoProducto = true;

                                    while(estadoProducto){
                                        System.out.println("MENU DE OPCIONES:\n" +
                                                "        1. Agregar un producto\n" +
                                                "        2. Editar un producto\n" +
                                                "        3. Listar un producto\n" +
                                                "        4. Eliminar un producto\n" +
                                                "        5. Salir");
                                        System.out.println("Ingrese la opcion: ");
                                        int opcionProducto = sc.nextInt();
                                        String nombreProducto = "";
                                        switch (opcionProducto){
                                            case 1 :
                                                System.out.println("Ingrese un producto: ");
                                                nombreProducto = sc.next();
                                                productoLista.add(nombreProducto);

                                                break;

                                            case 2:
                                                System.out.println("Ingrese el nombre del producto que desea editar: ");
                                                nombreProducto = sc.next();
                                                int indiceProducto;
                                                indiceProducto = productoLista.indexOf(nombreProducto);
                                                if(indiceProducto!=-1){
                                                    System.out.println("Ingrese el nombre del nuevo producto: ");
                                                    String nombreProductoNuevo = sc.next();
                                                    productoLista.set(indiceProducto,nombreProductoNuevo);
                                                }else{
                                                    System.out.println("Lo siento, esta fuera del rango");
                                                }


                                                break;

                                            case 3:
                                                if(!productoLista.isEmpty()){
                                                    System.out.println("Lista de productos: ");
                                                    for (int i = 0; i < productoLista.size(); i++) {
                                                        System.out.println(productoLista.get(i));
                                                    }
                                                }else{
                                                    System.out.println("No existen productos!!");
                                                }


                                                break;

                                            case 4:
                                                System.out.println("Ingrese el nombre del producto a eliminar: ");
                                                String nombreProductoEliminar = sc.next();
                                                int indiceProductoDos = productoLista.indexOf(nombreProductoEliminar);
                                                if (indiceProductoDos!=-1){
                                                    productoLista.remove(indiceProductoDos);
                                                    System.out.println("Producto eliminado!!");
                                                }else{
                                                    System.out.println("No hay productos con ese nombre!!");
                                                }
                                                break;

                                            case 5:
                                                System.out.println("Muchas gracias por usar el modulo Productos!!");
                                                estadoProducto = false;
                                        }


                                    }

                                    break;

                                case 3:
                                    System.out.println("Gracias por usar el modulo banco: ");
                                    estadoLogin = false;
                                    break;

                                default:
                                    System.out.println("La opcion no existe!!");
                            }

                        }

                    } else {
                        System.out.println("EL USUARIO NO EXISTE O TIENE LAS CREDENCIALES INCORRECTAS!!");
                    }

                    break;


                case 3:
                    if (!usernameCreate.isEmpty() && !passwordCreate.isEmpty()) {
                        System.out.println("Lista de usuarios: ");
                        for (int i = 0; i < usernameCreate.size(); i++) {
                            System.out.println(usernameCreate.get(i));
                        }

                        System.out.println("Lista de contraseñas: ");
                        for (int i = 0; i < passwordCreate.size(); i++) {
                            System.out.println(passwordCreate.get(i));
                        }
                    } else {
                        System.out.println("Lista vacia!!");
                    }
                    break;

                case 4:
                    System.out.println("Gracias por usar nuestra app!!");
                    salirPrincipal = true;
                    break;

                default:
                    System.out.println("La opcion no existe!!");
            }


        }
        //Fin while


    }
}
