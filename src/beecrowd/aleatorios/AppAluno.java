package beecrowd.aleatorios;

public class AppAluno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Carlos", 18, 7.60);
        Aluno aluno2 = new Aluno("Jorge", 20, 8);
        Aluno aluno3 = new Aluno("Matheus", 21, 3);

        Turma turma = new Turma();
        turma.addAluno(aluno);
        turma.addAluno(aluno2);
        turma.addAluno(aluno3);

        aluno.exibir_informacoes();
        aluno2.exibir_informacoes();
        aluno3.exibir_informacoes();

        turma.listar_aprovados();

        turma.media_da_turma();
    }
}
