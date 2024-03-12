import java.util.Scanner;
public class Exercicio358{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numMercadorias = 100;
        int contLucroMenor10 = 0, contLucroEntre10e20 = 0, contLucroMaior20 = 0;

        for (int i = 1; i <= numMercadorias; i++) {
            System.out.print("Digite o preço de compra da mercadoria " + i + ": ");
            double precoCompra = scanner.nextDouble();

            System.out.print("Digite o preço de venda da mercadoria " + i + ": ");
            double precoVenda = scanner.nextDouble();

            double lucro = ((precoVenda - precoCompra) / precoCompra) * 100;

            if (lucro < 10) {
                contLucroMenor10++;
            } else if (lucro <= 20) {
                contLucroEntre10e20++;
            } else {
                contLucroMaior20++;
            }
        }

        System.out.println("\nAnálise de Lucro das Mercadorias:");
        System.out.println("---------------------------------");
        System.out.println("Mercadorias com lucro < 10%: " + contLucroMenor10);
        System.out.println("Mercadorias com 10% <= lucro <= 20%: " + contLucroEntre10e20);
        System.out.println("Mercadorias com lucro > 20%: " + contLucroMaior20);
        System.out.println("---------------------------------");

        scanner.close();
    }
}
