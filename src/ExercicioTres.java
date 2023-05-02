import java.util.Scanner;
public class ExercicioTres {
    public static void main (String [] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu peso");
        double peso = input.nextDouble();
        System.out.print("Digite sua altura");
        double altura = input.nextDouble();

        System.out.printf("Seu imc é %.2f e sua classificacao e %s\n");
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}
