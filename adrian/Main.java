import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int quantidade = input.nextInt();

        String[] nomes = new String[quantidade];
        int[] idades = new int[quantidade];
        int indiceMaisVelha = 0;
        int idadeMaisVelha = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            nomes[i] = input.next();
            System.out.print("Idade: ");
            idades[i] = input.nextInt();

            if (idades[i] > idadeMaisVelha) {
                idadeMaisVelha = idades[i];
                indiceMaisVelha = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomes[indiceMaisVelha]);

        input.close();
    }
}