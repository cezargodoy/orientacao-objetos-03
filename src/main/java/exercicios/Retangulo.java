package exercicios;

    // Classes

public class Retangulo {
    private Double base;
    private Double altura;

    //Construtores

    public Retangulo(Double base, Double altura){
        this.setBase(base);
        this.setAltura(altura);
    }

    //getters and setters

    public void setBase(Double base) {
        if (base <=0){
            throw new IllegalArgumentException("A base deve ser maior que zero");
        }
        this.base = base;
    }

    public void setAltura(Double altura) {
        if(altura <=0){
            throw new IllegalArgumentException("A altura deve ser maior que zero");
        }
        this.altura = altura;
    }

    // Metodos

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }
    public Double calcularArea(){
        return base * altura;
    }
    public Double calcularPerimetro(){
        return (2 * base) + (2 * altura);
    }
}