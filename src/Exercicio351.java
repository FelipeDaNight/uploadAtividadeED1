import java.util.Scanner;
public class Exercicio351 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] nomes = new String[5];

            for (int i = 0; i < nomes.length; i++) {
                System.out.print("Digite o nome " + (i + 1) + ": ");
                nomes[i] = scanner.nextLine();
            }

            System.out.print("\nDigite um número (1 a 5) para obter o nome correspondente: ");
            int numero = scanner.nextInt();

            if (numero >= 1 && numero <= 5) {

                System.out.println("Nome correspondente ao número " + numero + ": " + nomes[numero - 1]);
            } else {
                System.out.println("Número inválido. Tente novamente com um número de 1 a 5.");
            }

            scanner.close();
        }
    }


