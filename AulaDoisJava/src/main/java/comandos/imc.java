package comandos;

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();


        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);


        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Classificação: Peso ideal (parabéns)");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Classificação: Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Classificação: Obesidade grau II (severa)");
        } else {
            System.out.println("Classificação: Obesidade III (mórbida)= Vai Morrer!!!");
        }

        scanner.close();
    }
}
