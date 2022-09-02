import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int comp = 30;
        int[] idade = new int[comp];
        float[] altura = new float[comp];
        int contador = 0;
        float media = 0f;

        for (int i = 0; i < comp; i++) {
            idade[i] = entrada.nextInt();
            altura[i] = entrada.nextFloat();
            media += altura[i];
        }
        System.out.println(media);
        media = media/comp;
        System.out.println(media);

        for (int i = 0; i < comp; i++) {
            if (idade[i] > 13 && altura[i] < media) {
                contador++;
            }
        }
        System.out.println("Alunos com mais de 13 anos e altura inferior a média: " + contador);
    }
}
