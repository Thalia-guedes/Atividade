import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preço de custo do produto: R$");
        double precoCusto = input.nextDouble();

        System.out.print("Digite o percentual de acréscimo: ");
        double percentualAcrescimo = input.nextDouble();

        double precoVenda = precoCusto * (1 + percentualAcrescimo / 100);

        System.out.printf("O preço de venda do produto é de R$%.2f", precoVenda);

        input.close();
    }
}