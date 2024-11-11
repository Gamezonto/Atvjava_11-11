import java.util.Scanner;

public class banco {

    public static double calcularCredito(double saldoMedio) {
        if (saldoMedio <= 500) {
            return 0;
        } else if (saldoMedio <= 1000) {
            return saldoMedio * 0.3;
        } else if (saldoMedio <= 3000) {
            return saldoMedio * 0.4;
        } else {
            return saldoMedio * 0.5;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo médio: ");
        double saldoMedio = scanner.nextDouble();

        double credito = calcularCredito(saldoMedio);
        System.out.printf("O crédito disponível é: R$ %.2f%n", credito);

        scanner.close();
    }
}