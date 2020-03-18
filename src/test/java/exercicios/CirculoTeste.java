package exercicios;

    //Bibliotecas

import exemplos.Circulo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

    // Classes

public class CirculoTeste {
    private Circulo c1;

    @BeforeEach
    public void beforeEach(){
        c1 = new Circulo();
    }
    @AfterEach
    public void afterEach() {
        c1 = null;
    }

    @Test
    public void criarObjetoCirculo(){
        assertNotNull(c1);
    }
    @Test
    public void presencaAtributos(){
        c1.raio = 10.0;
        assertNotNull(c1.raio);

    }
    @Test
    public void metodoSetCirculo(){
        c1.raio = 10.0;
        c1.setRaio(20.0);
        assertEquals(20.0, c1.raio);
    }
    @Test
    public void metodoGetCirculo(){
        c1.raio = 10.0;
        assertEquals(10.0, c1.getRaio());

    }
    @Test
    public void metodoCalcularArea(){
        c1.raio = 10.0;
        Double esperado =314.0;
        Double obtido =c1.calcularArea();
        assertEquals(esperado,obtido);

    }
    @Test
    public void metodoCalcularPerimetro(){
        c1.raio = 2.0;
        Double esperado = 12.56;
        Double obtido = c1.calcularPerimetro();
        assertEquals(esperado,obtido);

    }
}

