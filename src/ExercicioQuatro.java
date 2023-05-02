import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println(" --- Digite um numero --- ");
        int quantidade = scanner.nextInt();


        int menor= 0;

        for (int i = 0; i < quantidade; i++) ;{

        System.out.println(" - Digite um numero - ");
        int num = scanner.nextInt();

            if (menor < num) {
            menor = num;
            }


        }
        System.out.println("O maior número é: " + menor);

        scanner.close();
    }
}
