import java.util.Scanner;

public class NotaAprovacao {
    private static final double MEDIA_APROVACAO = 5.0;
    private static final double NOTA_MINIMA = 0.0;
    private static final double NOTA_MAXIMA = 10.0;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double p1 = obterNotaValida(entrada);
        double p2 = calcularNotaP2(p1);
        exibirResultado(p2);

        entrada.close();
    }

    private static double obterNotaValida(Scanner entrada) {
        double nota;
        do {
            System.out.print("Digite a primeira nota do aluno (entre 0 e 10): ");
            while (!entrada.hasNextDouble()) {
                exibirMensagem("Entrada inválida! Digite um número entre 0 e 10.");
                entrada.next(); // descarta entrada inválida
            }
            nota = entrada.nextDouble();
            if (nota < NOTA_MINIMA || nota > NOTA_MAXIMA) {
                exibirMensagem("Erro: a nota informada precisa estar entre 0 e 10. Por favor, tente novamente.");
            }
        } while (nota < NOTA_MINIMA || nota > NOTA_MAXIMA);
        return nota;
    }

    private static double calcularNotaP2(double p1) {
        return (3 * MEDIA_APROVACAO - p1) / 2;
    }

    private static void exibirResultado(double p2) {
        if (p2 >= NOTA_MINIMA && p2 <= NOTA_MAXIMA) {
            System.out.printf("Para ser aprovado, você precisa tirar %.2f na segunda nota.%n", p2);
        } else {
            exibirMensagem("Infelizmente, não é possível alcançar a média mínima, mesmo com a nota máxima na P2.");
        }
    }

    private static void exibirMensagem (String mensagem){
        System.out.println(mensagem);
    }
}
