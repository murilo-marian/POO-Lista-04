import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String texto = new String();
        System.out.print("Digite o texto a ser separado: ");
        texto = entrada.nextLine();
        String[] separado = new String[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
            separado[i] = String.valueOf(texto.charAt(i));
        }
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(separado[i] + " ");
        }
    }
}
