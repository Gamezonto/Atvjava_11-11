package comandos;

import java.util.Scanner;

public class votos {
    public static void main(String[] args) {
        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if (idade >= 18 && idade <= 69) {
            System.out.println("Voto obrigatorio!");
        } else if (idade >= 18 && idade <= 69) {
            System.out.println("Voto Opcional!");
        } else {
            System.out.println("Voto Invalido!");
        }

    }
}

