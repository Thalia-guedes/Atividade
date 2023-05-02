import java.util.Scanner;


public class ExercicioDois {
    public static void main ( String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Qual e o seu nome?");
         String nome = scanner.nextLine();
        System.out.println("Prazer em Conhece-la  " + nome + "!!!");


    }

        public static String  ExercicioDois  (String nome ) {

        System.out.println(" Qual e o seu nome?");
        return "Meu nome é = " + nome+ ".";
        }
}
