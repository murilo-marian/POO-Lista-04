import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palavras = entrada.nextLine();
        String[] separadas = palavras.split(";");
        for (int i = 0; i < separadas.length; i++) {
            System.out.println(separadas[i]);
        }
    }
}
