import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
    String Aluno, AlunoMaior = " ";
    double Nota;
    double Maior = 0;
int quant;
int cont = 0;

        System.out.println("Digite quantos alunos tem: ");
        quant = sc.nextInt();
    while (cont < quant) {
        System.out.println(" -------------------- ");
        System.out.println("Digite o nome do aluno: ");
        Aluno = sc.next().toString();
        System.out.println(" -------------------- ");

        System.out.println(" -------------------- ");
        System.out.println(" Digite a nota do aluno:");
        Nota = sc.nextDouble();
        System.out.println(" -------------------- ");

        if (Nota >= Maior) {
            Maior = Nota;
            AlunoMaior = Aluno;
        }

        cont = cont + 1;
    }
        System.out.println("A maior nota foi:" + Maior);
        System.out.println("A maior nota foi de:" + AlunoMaior);






        }
    }
