package pucrs.semana2;

public class SocioAtleta {
    private String nome;
    private int idade;
    private double altura;
    private int categoria;

    public SocioAtleta(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.calcularCategoria();
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

    public void atualizarAltura(double novaAltura) {
        this.altura = novaAltura;
        this.categoria = calcularCategoria();
    }


    public int calcularCategoria() {
        if (idade <= 12 && altura <= 1.55) {
            return 10;
        } else if (idade <= 12 && altura > 1.55) {
            return 20;
        } else if (idade > 12 && altura <= 1.68) {
            return 30;
        } else {
            return 40;
        }
    }

    @Override
    public String toString() {
        return "SocioAtleta{ " +
                "nome= '" + nome + '\'' +
                ", idade= " + idade +
                ", altura= " + altura +
                ", categoria=  " + categoria +
                '}';
    }
}
