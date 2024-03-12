

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Exercicio346{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String frase = "";
            List<Integer> opcoesEscolhidas = new ArrayList<>();

            System.out.print("Digite uma frase: ");
            frase = scanner.nextLine();

            while (true) {
                System.out.println("\nMENU");
                System.out.println("1 - Imprime o comprimento da frase");
                System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
                System.out.println("3 - Imprime a frase espelhada");
                System.out.println("4 - Termina o algoritmo");
                System.out.print("Opção: ");

                int opcao = scanner.nextInt();
                opcoesEscolhidas.add(opcao);

                switch (opcao) {
                    case 1:
                        System.out.println("Comprimento da frase: " + frase.length());
                        break;
                    case 2:
                        if (frase.length() >= 4) {
                            System.out.println("Dois primeiros caracteres: " + frase.substring(0, 2));
                            System.out.println("Dois últimos caracteres: " + frase.substring(frase.length() - 2));
                        } else {
                            System.out.println("A frase não possui caracteres suficientes para essa operação.");
                        }
                        break;
                    case 3:
                        System.out.println("Frase espelhada: " + new StringBuilder(frase).reverse().toString());
                        break;
                    case 4:
                        System.out.println("Terminando o algoritmo.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }

                scanner.nextLine();
            }
        }
    }
