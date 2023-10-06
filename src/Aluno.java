public class Aluno {
    private String nome;
    private double[] notas = new double[3];

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setNotas(double nota1, double nota2, double nota3) {
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String getStatus() {
        double media = calcularMedia();
        if (media >= 70) {
            return "Aprovado";
        } else if (media < 40) {
            return "Reprovado";
        } else {
            return "Na final";
        }
    }
}
