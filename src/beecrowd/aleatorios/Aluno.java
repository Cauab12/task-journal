package beecrowd.aleatorios;

public class Aluno {
    private String aluno;
    private int idade;
    private double nota;

    public Aluno(String aluno, int idade, double nota) {
        this.aluno = aluno;
        this.idade = idade;
        this.nota = nota;
    }

    public String getAluno() {
        return aluno;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota() {
        return nota;
    }

    public void exibir_informacoes() {
        System.out.println("Aluno: " + this.aluno);
        System.out.println("Idade: " + this.idade);
        System.out.println("Nota: " + this.nota);
        System.out.println();
    }

    public void aprovado(double nota) {
        if (nota >= 7) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
