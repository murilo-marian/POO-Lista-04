import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int comp = 5;
        int[] idade = new int[comp];
        float[] altura = new float[comp];
        boolean primeiro = true;
        int idadeVelho = 0;
        float alturaVelho = 0;
        int idadeNovo = 0;
        float alturaNovo = 0;
        int idadeBaixo = 0;
        float alturaBaixo = 0;
        int idadeAlto = 0;
        float alturaAlto = 0;


        for (int i = 0; i < comp; i++) {
            System.out.print("Idade: ");
            idade[i] = entrada.nextInt();
            System.out.print("Altura: ");
            altura[i] = entrada.nextFloat();
            if (primeiro) {
                idadeVelho = idade[i];
                alturaVelho = altura[i];

                idadeNovo = idade[i];
                alturaNovo = altura[i];

                idadeBaixo = idade[i];
                alturaBaixo = altura[i];

                idadeAlto = idade[i];
                alturaAlto = altura[i];

                primeiro = false;
            } else {
                if (idade[i] > idadeVelho) {
                    idadeVelho = idade[i];
                    alturaVelho = altura[i];
                }
                if (idade[i] < idadeNovo) {
                    idadeNovo = idade[i];
                    alturaNovo = altura[i];
                }
                if (altura[i] < alturaBaixo) {
                    idadeBaixo = idade[i];
                    alturaBaixo = altura[i];
                }
                if (altura[i] > alturaAlto) {
                    idadeAlto = idade[i];
                    alturaAlto = altura[i];
                }
            }
        }

        for (int i = comp; i > 0; i--) {
            System.out.println(idade[i-1]);
            System.out.println(altura[i-1]);
        }

        System.out.println("Mais alto:");
        System.out.print("Altura: " + alturaAlto + "  ");
        System.out.println("Idade: " + idadeAlto);
        System.out.println("Mais baixa:");
        System.out.print("Altura: " + alturaBaixo + "  ");
        System.out.println("Idade: " + idadeBaixo);
        System.out.println("Mais velho:");
        System.out.print("Altura: " + alturaVelho + "  ");
        System.out.println("Idade: " + idadeVelho);
        System.out.println("Mais novo:");
        System.out.print("Altura: " + alturaNovo + "  ");
        System.out.println("Idade: " + idadeNovo);
    }
}
