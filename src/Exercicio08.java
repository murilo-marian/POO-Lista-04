import java.util.Random;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String[] letras = {"a", "e", "i", "o", "u", "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};

        String senha = new String();
        System.out.print("Digite o tamanho da senha: ");
        int tamanho = entrada.nextInt();
        Random teste = new Random();

        for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0) {
            senha += letras[teste.nextInt(6,26)];
            } else {
                senha += letras[teste.nextInt(0,5)];
            }
        }
        System.out.println(senha);
        
    }
}
