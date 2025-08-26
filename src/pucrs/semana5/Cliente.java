package pucrs.semana5;



public class Cliente {
    private String nome;
    private long telefone;
    private String endereco;
    private String cpf;


    public Cliente(String nome, long telefone, String endereco, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{ " +
                "nome= '" + nome + '\'' +
                ", telefone= " + telefone +
                ", endereco= '" + endereco + '\'' +
                ", cpf= '" + cpf + '\'' +
                '}';
    }
}
