import java.util.Scanner;

public class CompraTroco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] produtos = new double[5];

        for (int i = 0; i < 5; i++){
            System.out.printf("Digite o %d° produto: ", i + 1);

            if (!entrada.hasNextDouble()){
                exibirErro("Entrada inválida. Por favor digite um número.");
                entrada.next();
                i--;
                continue;
            }
            double produto = entrada.nextDouble();
            if (produto < 0){
                exibirErro("Não é permitido entrada negativo. ");
                i--;
                continue;
            }
            produtos[i] = produto;
        }
        double soma = calcularSomaProdutos(produtos);

        System.out.printf("A soma dos produtos é: %.2f%n", soma);

        try {
            System.out.print("Digite o valor referente ao pagamento: ");
            double pagamento = entrada.nextDouble();

            if (pagamento < 0){
                throw new IllegalArgumentException("O pagamento não pode ser negativo: ");
            }

            resultadoPagamento(pagamento, soma);

        } catch (java.util.InputMismatchException e){
            exibirErro("Entrada inválida. Por favor digite um número: ");
        } catch (IllegalArgumentException e){
            exibirErro(e.getMessage());
        } finally {
            entrada.close();
        }
    }

    private static double calcularSomaProdutos(double[] produtos){
        double soma = 0;
        for (double pro : produtos){
            soma += pro;
        }
        return soma;
    }

    private static void resultadoPagamento(double pagamento, double calcularSomaProdutos){
        double trocoPagamento = calcularTroco(pagamento, calcularSomaProdutos);

        if (trocoPagamento < 0){
            exibirErro("Seu pagamento foi insuficiente.");
        } else {
            System.out.printf("Seu troco é: %.2f%n", trocoPagamento);
        }
    }

    private static double calcularTroco(double pagamento, double calcularSomaProdutos){
        return pagamento - calcularSomaProdutos;

    }

    private static void exibirErro(String mensagem){
        System.out.println("Erro: " + mensagem);
    }

}
