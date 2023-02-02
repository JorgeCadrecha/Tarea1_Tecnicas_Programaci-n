//¿Qué algoritmos crees que usan por tus juegos y aplicaciones favoritas?

import java.util.Scanner;

public class pregunta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué algoritmos crees que usan por tus juegos y aplicaciones favoritas?");
        String respuesta = sc.nextLine();
        System.out.println("Tu respuesta es: " + respuesta);
    }
}