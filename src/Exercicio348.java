import java.util.Scanner;
public class Exercicio348 {
    public static void main(String[] args) {
        int numAlunos = 5;

        String[] nomes = new String[numAlunos];
        double[] notas1 = new double[numAlunos];
        double[] notas2 = new double[numAlunos];
        double[] medias = new double[numAlunos];

        try (Scanner scanner = new Scanner(System.in)) {

            int i = 0;
            while (i < numAlunos) {

                System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                nomes[i] = scanner.next();

                System.out.print("Digite a primeira nota: ");
                notas1[i] = scanner.nextDouble();

                System.out.print("Digite a segunda nota: ");
                notas2[i] = scanner.nextDouble();

                medias[i] = (notas1[i] + notas2[i]) / 2;

                i++;
            }
        }
        System.out.println("\nListagem de Alunos:");
        System.out.println("-------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s%n", "Nome", "Nota 1", "Nota 2", "Média");
        System.out.println("-------------------------------");
        for (int j = 0; j < numAlunos; j++) {
            System.out.printf("%-15s %-10.2f %-10.2f %-10.2f%n", nomes[j], notas1[j], notas2[j], medias[j]);
        }
        System.out.println("-------------------------------");
    }
}