import java.util.Scanner;

public class CelsiusVsFahrenheit {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite os Graus Celsius: ");
            if (entrada.hasNextDouble()) {
                double celsius = entrada.nextDouble();
                exibirResultado(celsius);
            } else {
                exibirErro("Por favor digite um número válido");
            }
        }
    }

    private static void exibirResultado(double celsius){
        double fahrenheit = converterCelsiusParaFahrenheit(celsius);
        System.out.printf("O valor %.2f em fahrenheit é: %.2f%n",celsius, fahrenheit);
    }

    private static double converterCelsiusParaFahrenheit(double celsius){
        return celsius * 1.8 + 32;
    }

    private static void exibirErro(String mensagem){
        System.out.println("Erro: " + mensagem);
    }

}


//Formula F= C*1,8+32