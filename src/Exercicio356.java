
import java.util.Scanner;

public class Exercicio356 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numAlunos = 15;

            String[] nomes = new String[numAlunos];
            double[] pr1 = new double[numAlunos];
            double[] pr2 = new double[numAlunos];
            double[] media = new double[numAlunos];
            String[] situacao = new String[numAlunos];

            for (int i = 0; i < numAlunos; i++) {
                System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                nomes[i] = scanner.nextLine();

                System.out.print("Digite a nota da PR1: ");
                pr1[i] = scanner.nextDouble();

                System.out.print("Digite a nota da PR2: ");
                pr2[i] = scanner.nextDouble();

                media[i] = Math.round((pr1[i] + pr2[i]) / 2.0);
                situacao[i] = (media[i] >= 60) ? "AP" : "RP";

                scanner.nextLine();
            }

            System.out.println("\nListagem de Alunos:");
            System.out.println("------------------------------------------------------");
            System.out.printf("%-20s%-10s%-10s%-10s%n", "Nome", "PR1", "PR2", "Média");
            System.out.println("------------------------------------------------------");

            for (int i = 0; i < numAlunos; i++) {
                System.out.printf("%-20s%-10.2f%-10.2f%-10.2f%-10s%n", nomes[i], pr1[i], pr2[i], media[i], situacao[i]);
            }

            System.out.println("------------------------------------------------------");

            scanner.close();
        }
    }


