import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int comp = 10;
        int[] vetor = new int[comp];

        for (int i = 0; i < comp; i++) {
            vetor[i] = entrada.nextInt();
        }
        for (int i = comp; i > 0; i--) {
            System.out.print(vetor[i-1]);
        }


        entrada.close();
    }
}
