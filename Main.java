import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int large, alt, comp;
        double valor;
        String resposta = "S";
do {
    System.out.println(" ----------------------- ");
    System.out.println(" Calculadora Cm para m^3 ");
    System.out.println(" ----------------------- ");

    System.out.println("Digite a largura ");
    large = sc.nextInt();
    System.out.println("Digite a altura ");
    alt = sc.nextInt();
    System.out.println("Digite o comprimento ");
    comp = sc.nextInt();
    valor = large * alt * comp;
    System.out.println(+large + "x" + alt + "x" + comp + " é igual a " + valor / 1000000 +" m^3");

    System.out.println("DESEJA CONTINUAR? (S) ou (N)");
    resposta  = sc.next();
}while (resposta.equals("S"));

System.out.println("Programa encerrado");

sc.close();




    }

}