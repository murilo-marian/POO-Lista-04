import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int comp = 5;
        int[] num = new int[comp];
        int[] par = new int[comp];
        int[] impar = new int[comp];

        for (int i = 0; i < comp; i++) {
            System.out.println("Escreva um número");
            num[i] = entrada.nextInt();
            if (num[i] % 2 == 0) {
                par[i] = num[i];
            } else {
                impar[i] = num[i];
            }
        }

        System.out.print("Números: ");
        for (int i = 0; i < comp; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.print("Pares: ");
        for (int i = 0; i < comp; i++) {
            if (impar[i] == 0) {
                System.out.print(par[i] + " ");
            }
        }
        System.out.print("Impares: ");
        for (int i = 0; i < comp; i++) {
            if (impar[i] != 0) {
                System.out.print(impar[i] + " ");
            }
        }
    }
}
