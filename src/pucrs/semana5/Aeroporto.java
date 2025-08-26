package pucrs.semana5;

public class Aeroporto {
    private String nome;
    private int codigo;
    private String cidade;

    public Aeroporto(String nome, int codigo, String cidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Aeroporto {" +
                "nome= '" + nome + '\'' +
                ", codigo= " + codigo +
                ", cidade= '" + cidade + '\'' +
                '}';
    }
}
