package pucrs.semana5;

public class Voo {
    private long numero;
    private String data;
    private int numVagas;
    private String horaPartida;
    private String horaChegada;

    public Voo(long numero, String data, int numVagas, String horaPartida, String horaChegada) {
        this.numero = numero;
        this.data = data;
        this.numVagas = numVagas;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(int numVagas) {
        this.numVagas = numVagas;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }

    @Override
    public String toString() {
        return "Voo{ " +
                "numero= " + numero +
                ", data= '" + data + '\'' +
                ", numVagas= " + numVagas +
                ", horaPartida= '" + horaPartida + '\'' +
                ", horaChegada= '" + horaChegada + '\'' +
                '}';
    }
}
