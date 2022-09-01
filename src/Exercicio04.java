import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int comp = 10;
        String[] letras = new String[comp];
        String[] consoantes = new String[comp];

        for (int i = 0; i < comp; i++) {
            letras[i] = entrada.nextLine().toLowerCase();
            if (!letras[i].equals("a") && !letras[i].equals("e") && !letras[i].equals("i") && !letras[i].equals("o") && !letras[i].equals("u")) {
                consoantes[i] = letras[i];
            }

        }
        for (int i = 0; i < comp; i++) {
            if (consoantes[i] != null) {
                System.out.println(consoantes[i]);
            }
        }
    }
}
