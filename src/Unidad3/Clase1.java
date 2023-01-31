package Unidad3;

import java.util.Scanner;

public class Clase1 {
    public static void main(String[] args) {
        //Los operadores se clasifican por (ARITMETICOS,RELACIONALES,LOGICOS)

        String[] arregloss  = new String[30];
        String usernameCreate = "Duvan";
        String passwordCreate = "12345";

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un nombre de usuario: ");
        String username = sc.next();

        System.out.println("Ingrese una contraseña: ");
        String password = sc.next();

        boolean isTrue=false;

        if (usernameCreate.equals(username) && passwordCreate.equals(password)){
            isTrue=true;
        }
        else{
            System.out.println("Usuario Incorrecto");
            }

        if (isTrue){
            System.out.println("Bienvenido ".concat(username).concat("!"));
        }
        else{
            System.out.println("Lo siento requieres autenticación");
        }
        }


    }

