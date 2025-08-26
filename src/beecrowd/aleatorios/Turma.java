package beecrowd.aleatorios;

import java.util.ArrayList;

public class Turma {
    private String nome_da_turma;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void media_da_turma() {
        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }
        double media = soma / alunos.size();
        System.out.println("Media da turma: " + media);
    }

    public void listar_aprovados() {
        for (Aluno aluno : alunos) {
            aluno.aprovado(aluno.getNota());
            aluno.exibir_informacoes();
            }
        }
    }

