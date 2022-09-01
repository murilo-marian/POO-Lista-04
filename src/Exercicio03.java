import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int comp = 4;
        float[] notas = new float[comp];
        float media = 0;
        for (int i = 0; i < 4; i++) {
            notas[i] = entrada.nextFloat();
        }
        for (int i = 0; i < comp; i++) {
        System.out.println("Nota " + i + ": " + notas[i]);
        media += notas[i];
        }
        media = media/comp;
        System.out.println("Media: " + media);

    }
}
