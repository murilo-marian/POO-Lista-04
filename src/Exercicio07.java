import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int multi = 1;
        int soma = 0;
        int comp = 5;
        int[] num = new int[comp];

        for (int i = 0; i < comp; i++) {
            num[i] = entrada.nextInt();
            soma += num[i];
            multi *= num[i];
        }
        System.out.print("Números: ");
        for (int i = 0; i < comp; i++) {
            System.out.print(num[i]);
        }
        System.out.println("");
        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + multi);
    }
}
