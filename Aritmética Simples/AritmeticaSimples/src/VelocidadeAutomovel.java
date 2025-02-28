import java.util.InputMismatchException;
import java.util.Scanner;

public class VelocidadeAutomovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a velocidade inicial do automóvel: ");
            double velocidade = scanner.nextDouble();

            System.out.print("Digite a aceleração: ");
            double aceleracao = scanner.nextDouble();

            System.out.print("Digite o tempo por segundo: ");
            double tempo = scanner.nextDouble();

            if (tempo < 0){
                throw new IllegalArgumentException("O tempo não pode ser negativo.");
            }

                processarVelocidade(velocidade, aceleracao, tempo);

            } catch (java.util.InputMismatchException e) {
                exibirErro("Entrada inválida. Por favor digite um número: ");
            } catch (IllegalArgumentException e) {
                exibirErro(e.getMessage());
            }finally {
                scanner.close();
            }
    }

    private static void processarVelocidade(double velocidade, double aceleracao, double tempo) {
        double velocidadeFinal = calcularVelocidadeFinal(velocidade, aceleracao, tempo);
        System.out.printf("A velocidade final é %.2f%n km/h%n",  velocidadeFinal);
    }

    private static double calcularVelocidadeFinal(double velocidade, double aceleracao, double tempo){
        double velocidadeFinalMs = velocidade  + (aceleracao * tempo );
        return velocidadeFinalMs * 3.6;
    }

    private static void exibirErro (String mensagem){
        System.out.println("Erro: " + mensagem);
    }
}