import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma data (dd/mm/aaaa)");
        String data = entrada.nextLine();

        int[] vetorData = new int[3];

        String dia = data.substring(0, 2);
        String mes = data.substring(3, 5);
        String ano = data.substring(6, 10);

        int diaInt = Integer.parseInt(dia);
        int mesInt = Integer.parseInt(mes);
        int anoInt = Integer.parseInt(ano);

        if (diaInt > 31 || diaInt < 1) {
            System.out.println("Dia inválido");
        } else if (mesInt > 12 || mesInt < 1) {
            System.out.println("Mês inválido");
        } else if (anoInt < 1) {
            System.out.println("Ano inválido");
        } else if (mesInt == 2 && diaInt > 29) {
            System.out.println("Dia inválido");
        } else if (mesInt == 2 && diaInt == 29 && anoInt % 4 != 0 && anoInt % 100 != 0 && anoInt % 400 != 0) {
            System.out.println("Dia inválido");
        } else {
            System.out.println("Data válida");
            vetorData[0] = diaInt;
            vetorData[1] = mesInt;
            vetorData[2] = anoInt;
            for (int i = 0; i < 3; i++) {
                System.out.print(vetorData[i]);
                if (i < 2) {
                    System.out.print("/");
                }
            }

        }


    }

}