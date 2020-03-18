package exemplos;

    // Classes

public class Circulo {
    private Double lado;

    //construtores

    public Circulo(Double lado) {
        this.setLado(lado);
    }

    //getters and setters

    public void setLado(Double lado) {
        if(lado <= 0) {
            throw new IllegalArgumentException("O lado deve ser maior que zero.");
        }
        this.lado = lado;
    }

    // Metodos

    public Double getLado() {
        return lado;
    }

    public Double calcularArea() {
        return lado * lado;
    }

    public Double calcularPerimetro() {
        return 4 * lado;
    }
}

