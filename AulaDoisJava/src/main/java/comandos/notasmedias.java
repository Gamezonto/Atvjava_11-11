package comandos;

    import java.util.Scanner;

    public class notasmedias {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a quantidade de notas: ");
            int quantidadeNotas = scanner.nextInt();

            double somaNotas = 0;

            for (int i = 1; i <= quantidadeNotas; i++) {
                System.out.print("Digite a nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double media = somaNotas / quantidadeNotas;
            System.out.printf("Média do aluno: %.2f\n", media);

            if (media >= 7.0) {
                System.out.println("O aluno foi aprovado.");
            } else {
                System.out.println("O aluno foi reprovado=F.");
            }

            scanner.close();
        }
    }

}
