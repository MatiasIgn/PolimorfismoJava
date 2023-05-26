package clases;

public class Transmision {
    private String marca;
    private int potencia;

    public Transmision(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Transmision{" + "marca=" + marca + ", potencia=" + potencia + '}';
    }
    
}
