package Unidad1;

import javax.swing.*;

public class Clase2 {
    public static void main(String[] args) {

        //Sentencias para mostrar por la SWING de Java

        //Declaro un numero en STR y pido un numero por panel
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero: ");

        //Declaro un entero y convierto de STR a INT el numero que le solicito al usuario
        int numeroUno = Integer.parseInt(numeroStr);

        //Imprimo por panel el numero
        JOptionPane.showMessageDialog(null,"Numero: " + numeroUno);
    }
}
