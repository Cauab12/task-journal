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

    public void calcularCategoria() {
        if (getIdade() <= 12 && getAltura() <= 1.55) {
            categoria = 10;
        }
    }
}