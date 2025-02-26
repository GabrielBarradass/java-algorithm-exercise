import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite o %d° número: ", i + 1);
            if (!entrada.hasNextDouble()) {
                System.out.println("Erro: Entrada inválida. Por favor digite um número.");
                entrada.next();
                i--;
                continue;
            }
            double numero = entrada.nextDouble();
            if (numero < 0) {
                System.out.println("Erro: não é permitido número negativo.");
                i--;
                continue;
            }
            numeros[i] = numero;
        }

        double media = calcularMedia(numeros);
        System.out.printf("A media aritmética é: %.2f%n", media);
    }

    public static double calcularMedia(double[] numeros){
        double soma = 0;
        for (double num : numeros){
            soma += num;
        }
        return soma / numeros.length;
    }
}
