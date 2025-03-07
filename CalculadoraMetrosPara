import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        double N;
        int escolha;

        System.out.println(" -----------------------");
        System.out.println(" CONVERSOR DE MEDIDA (M) ");
        System.out.println(" -----------------------");

        System.out.println("Digite um numero");
        N = sc.nextDouble();

        System.out.println("1 - km");
        System.out.println("2 - hm");
        System.out.println("3 - dam");
        System.out.println("4 - dm");
        System.out.println("5 - cm");
        System.out.println("6 - mm");
        escolha =  sc.nextInt();
        switch (escolha) {
            case 1:
                System.out.println(N / 1000+"Km");
                break;
            case 2:
                System.out.println(N / 100+"Hm");
                break;
            case 3:
                System.out.println(N / 10+"dam");
                break;
            case 4:
                System.out.println(N * 10+"dm");
                break;
            case 5:
                System.out.println(N * 100+"cm");
                break;
            case 6:
                System.out.println(N * 1000+"mm");
                break;
            default:
                System.out.println("Error");
        }


    }
}
