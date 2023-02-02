//¿Qué algoritmos usas en tu vida cotidiana? ¿Piensas que podrías escribir un programa para hacerlos más eficientes?

import java.util.Scanner;

public class pregunta1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué algoritmos usas en tu vida cotidiana? ¿Piensas que podrías escribir un programa para hacerlos más eficientes?");
        String respuesta = sc.nextLine();
        System.out.println("Tu respuesta es: " + respuesta);
    }
}

