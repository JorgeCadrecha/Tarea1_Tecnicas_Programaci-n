//¿Qué algoritmos usas en tu vida cotidiana? ¿Piensas que podrías escribir un programa para hacerlos más eficientes?

import java.util.Scanner;

public class pregunta1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué algoritmos usas en tu vida cotidiana? ¿Piensas que podrías escribir un programa para hacerlos más eficientes?");
        // Algunos algoritmos que uso en la vida cotidiana son por ejemplo lavarme los dientes y conducir hasta la universidad
        String respuesta = sc.nextLine();
        System.out.println("Tu respuesta es: " + respuesta);
    }
}

