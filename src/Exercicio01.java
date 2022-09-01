import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int comp = 5;
        int[] vetor = new int[comp];

        for (int i = 0; i < comp; i++) {
            vetor[i] = entrada.nextInt();
        }
        for (int i = 0; i < comp; i++) {
            System.out.print(vetor[i]);
        }


        entrada.close();
    }
}
