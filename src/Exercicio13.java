import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int comp = 10;
        int[] vetor1 = new int[comp];
        int[] vetor2 = new int[comp];
        int[] vetorCompleto = new int[20];
        int controle1 = 0;
        int controle2 = 0;

        for (int i = 0; i < comp; i++) {
            vetor1[i] = entrada.nextInt();
        }
        for (int i = 0; i < comp; i++) {
            vetor2[i] = entrada.nextInt();
        }
        for (int i = 0; i < comp * 2; i++) {
            if (i % 2 == 0) {
                vetorCompleto[i] = vetor1[controle1];
                controle1++;
            } else {
                vetorCompleto[i] = vetor2[controle2];
                controle2++;
            }
        }
        for (int i = 0; i < comp*2; i++) {
            System.out.println(vetorCompleto[i]);
        }
    }
}
