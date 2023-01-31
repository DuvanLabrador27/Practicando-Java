package Unidad2;

public class Clase2 {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";

        String c="a";
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
         c = c + a + b + "\n";
        }
        long fin = System.currentTimeMillis();
        long res = (fin-inicio);
        System.out.println("res = " + res);
        System.out.println("c = " + c);
    }
}
