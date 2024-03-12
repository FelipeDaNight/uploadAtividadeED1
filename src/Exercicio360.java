import java.util.Scanner;

public class Exercicio360 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dataNascimento;

        while (true) {
            System.out.print("Digite a data de nascimento (ddmm) ou 9999 para encerrar: ");
            dataNascimento = scanner.nextInt();

            if (dataNascimento == 9999) {
                System.out.println("Encerrando o programa. Obrigado!");
                break;
            }

            int dia = dataNascimento / 100;
            int mes = dataNascimento % 100;

            String signo = determinarSigno(dia, mes);

            if (signo != null) {
                System.out.println("Data de nascimento: " + formatarData(dia, mes));
                System.out.println("Signo: " + signo);
            } else {
                System.out.println("Data inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static String determinarSigno(int dia, int mes) {
        if ((mes == 1 && dia >= 1 && dia <= 20) || (mes == 12 && dia >= 22 && dia <= 31)) {
            return "Capricórnio";
        } else if ((mes == 1 && dia >= 21 && dia <= 31) || (mes == 2 && dia >= 1 && dia <= 19)) {
            return "Aquário";
        } else if ((mes == 2 && dia >= 20 && dia <= 29) || (mes == 3 && dia >= 1 && dia <= 20)) {
            return "Peixes";
        } else if ((mes == 3 && dia >= 21 && dia <= 31) || (mes == 4 && dia >= 1 && dia <= 20)) {
            return "Áries";
        } else if ((mes == 4 && dia >= 21 && dia <= 30) || (mes == 5 && dia >= 1 && dia <= 20)) {
            return "Touro";
        } else if ((mes == 5 && dia >= 21 && dia <= 31) || (mes == 6 && dia >= 1 && dia <= 20)) {
            return "Gêmeos";
        } else if ((mes == 6 && dia >= 21 && dia <= 30) || (mes == 7 && dia >= 1 && dia <= 21)) {
            return "Câncer";
        } else if ((mes == 7 && dia >= 22 && dia <= 31) || (mes == 8 && dia >= 1 && dia <= 22)) {
            return "Leão";
        } else if ((mes == 8 && dia >= 23 && dia <= 31) || (mes == 9 && dia >= 1 && dia <= 22)) {
            return "Virgem";
        } else if ((mes == 9 && dia >= 23 && dia <= 30) || (mes == 10 && dia >= 1 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23 && dia <= 31) || (mes == 11 && dia >= 1 && dia <= 21)) {
            return "Escorpião";
        } else if ((mes == 11 && dia >= 22 && dia <= 30) || (mes == 12 && dia >= 1 && dia <= 21)) {
            return "Sagitário";
        } else {
            return null;
        }
    }
    private static String formatarData(int dia, int mes) {
        return String.format("%02d/%02d", dia, mes);
    }
}
