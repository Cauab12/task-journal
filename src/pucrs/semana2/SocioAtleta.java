package pucrs.semana2;

public class SocioAtleta {
    private String nome;
    private int idade;
    private double altura;
    private int categoria;

    public SocioAtleta(String nome, int idade, double altura, int categoria) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.categoria = categoria;
        calculaCat(); // Calcula a categoria ao instanciar
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public int getCategoria() {
        return categoria;
    }

    // Método para calcular a categoria com base em idade e altura
    public void calculaCat() {
        if (idade <= 12 && altura <= 1.55) {
            categoria = 10;
        } else if (idade <= 12 && altura > 1.55) {
            categoria = 20;
        } else if (idade > 12 && altura <= 1.68) {
            categoria = 30;
        } else {
            categoria = 40;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura + ", Categoria: " + categoria;
    }
}
