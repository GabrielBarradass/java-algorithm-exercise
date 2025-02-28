import java.util.Scanner;

public class CotacaoDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Digite a cotação atual do dolar: ");
            double cotacaoDolar = scanner.nextDouble();

            System.out.print("Digite a quantidade de dolar: ");
            double quantidadeDolar = scanner.nextDouble();

            if (cotacaoDolar <= 0) {
                throw new IllegalArgumentException ("A cotação não pode ser negativo ou neutra: ");
            } else if (quantidadeDolar < 0) {
                throw new IllegalArgumentException("A quantidade de dolar não pode ser negativa.");
            }

            resultadoReal(cotacaoDolar, quantidadeDolar);

        } catch (java.util.InputMismatchException e) {
            exibirErro("Entrada inválida. Por favor digite um número");
        } catch (IllegalArgumentException e){
            exibirErro(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void resultadoReal(double cotacaoDolar, double quantidadeDolar){
        double cotacaoReal = calcularCotacaoDolar(cotacaoDolar,quantidadeDolar);
        System.out.printf("O valor em Reais é : R$%.2f%n", cotacaoReal);
    }

    private static double calcularCotacaoDolar(double cotacaoDolar, double quantidadeDolar){
        return cotacaoDolar * quantidadeDolar;
    }

    private static void exibirErro(String mensagem){
        System.out.println("Erro: " + mensagem);
    }

}
