import java.util.Scanner;

public class MilhasVsKm {
    private static final double milhaMaritima = 1852;

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       System.out.print("Por favor coloque a quantida de milhas: ");

       if (entrada.hasNextDouble()){
           double milhas = entrada.nextDouble();
           processarMilhas(milhas);
       } else {
           exibirErro("Erro: Entrada inválida. Por favor digite um número.");
       }
       entrada.close();
    }
    private static void processarMilhas(double milhas){
        if (milhas < 0 ){
            exibirErro("Erro: digite um número que não seja negativo.");
        } else {
            double quilometro = converteMilhasParaKm(milhas);
            System.out.printf("O valor %.2f milhas marítimas em quilômetros é: %.2f%n", milhas , quilometro);
        }
    }

    private static double converteMilhasParaKm(double milhas){
        return milhas * milhaMaritima;
    }

    private static void exibirErro(String mensagem){
        System.out.println("Erro: " + mensagem);
    }
}