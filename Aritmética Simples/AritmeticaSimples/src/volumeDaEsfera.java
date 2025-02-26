import java.util.Scanner;

public class volumeDaEsfera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do Diâmetro: ");

        if (!entrada.hasNextDouble()){
            System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
        } else{
            double diametro = entrada.nextDouble();
            if (diametro < 0){
                System.out.println("Erro: Entrada inválida, não pode colocar número negativo.");
            } else {
                double raio = Math.pow((diametro / 2) , 3);
                //double PI = Math.PI;
                double volume = ((4.0/3.0) * Math.PI * raio);

                System.out.printf("O volume da esfera é : %.2f%n", volume);
            }
        }
        entrada.close();
    }
}
