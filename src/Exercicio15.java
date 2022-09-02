import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos valores devem ser inseridos?");
        final int comp = entrada.nextInt();

        int[] valores = new int[comp];
        valores[comp-1] = -1;
        int valor = 0;
        int conta = 0;
        while (valores[comp-1] == -1) {
            System.out.print("Escreva um valor entre 0 e 20: ");
            valor = entrada.nextInt();
            if (valor >= 0 && valor <= 20) {
                valores[conta] = valor;
                conta++;
            }
        }

        for (int i = 0; i < comp; i++) {
            System.out.print(valores[i] + ": ");
            for (int j = 0; j < valores[i]; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
