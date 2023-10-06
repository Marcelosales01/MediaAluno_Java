import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        Aluno aluno = new Aluno(nome);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        aluno.setNotas(nota1, nota2, nota3);

        double media = aluno.calcularMedia();
        String status = aluno.getStatus();

        System.out.println("Média do aluno: " + media);
        System.out.println("Status do aluno: " + status);

        scanner.close();

    }
}