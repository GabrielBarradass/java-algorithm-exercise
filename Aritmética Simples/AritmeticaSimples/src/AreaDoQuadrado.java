import java.util.Scanner;

public class AreaDoQuadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");

        if (!entrada.hasNextDouble()){
            System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
        } else {
            double lado = entrada.nextDouble();

            if (lado < 0) {
                System.out.println("Erro: O valor do lado não pode ser negativo.");
            } else {
                double area = Math.pow(lado, 2);
                System.out.printf("A área do quadrado é: %.2f%n", area);
            }
        }
        entrada.close();
    }
}
