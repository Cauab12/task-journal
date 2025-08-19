package pucrs.semana1;

public class Circulo {
    private double coordX;
    private double coordY;
    private double raio;

    public Circulo(double coordX, double coordY, double raio) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.raio = raio;
    }

    public Circulo() {
        this.coordX = 0;
        this.coordY = 0;
        this.raio = 1;
    }

    public double getCoordX() {
        return coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public double getRaio() {
        return raio;
    }

    public void move(double novoX, double novoY) {
        coordX = novoX;
        coordY = novoY;
    }

    public void zoom(double fator) {
        raio *= fator;
    }

    public double area() {
        return Math.PI * Math.pow(raio,2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "coordX=" + coordX +
                ", coordY=" + coordY +
                ", raio=" + raio +
                '}';
    }
}
