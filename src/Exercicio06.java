import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int comp = 10;
        float[] media = new float[comp];
        float nota = 0;
        int alunos = 0;

        for (int j = 0; j < comp; j++) {
            nota = 0;
            System.out.println("Aluno " + (j+1) + ": ");
            for (int i = 0; i < 4; i++) {
                System.out.print("Nota " + (i+1) + ": ");
                nota += entrada.nextInt();
            }
            media[j] += nota/4;
            if (media[j] >= 7f) {
                alunos++;
            }
        }
        System.out.println("Alunos que tiraram nota maior ou igual a 7: " + alunos);
    }
}
