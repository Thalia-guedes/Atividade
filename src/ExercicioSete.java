import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = input.nextDouble();

        System.out.print("Digite a quantidade de dólares que deseja converter: ");
        double qtdDolares = input.nextDouble();

        double valorEmReais = qtdDolares * cotacaoDolar;

        System.out.printf("O valor de %.2f dólares em reais é de R$%.2f", qtdDolares, valorEmReais);

        input.close();
    }
}
