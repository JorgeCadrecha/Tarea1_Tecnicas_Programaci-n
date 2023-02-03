//¿Qué algoritmos crees que usan por tus juegos y aplicaciones favoritas?

import java.util.Scanner;

public class pregunta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué algoritmos crees que usan por tus juegos y aplicaciones favoritas?");
        //Creo que usan algoritmos de recomendación de multimedia o algoritmos de movimiento tanto en los juegos como en las aplicaciones, dependiendo de donde me mueva la pantalla o el personajes se mueve al lugar que yo he determinado.
        String respuesta = sc.nextLine();
        System.out.println("Tu respuesta es: " + respuesta);
    }
}