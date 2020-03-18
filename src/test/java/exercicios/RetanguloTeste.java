package exercicios;

    //Bibliotecas

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    // Classes

public class RetanguloTeste {
    private  Retangulo retangulo1;

    @BeforeEach
    public void beforeEach(){
        retangulo1 = new Retangulo(
                5.0,10.0);
    }
    @AfterEach
    public void afterEach(){

        retangulo1 = null;
    }
    @DisplayName("Deve criar um objeto retangulo")
    public void criarObjetoRetangulo()
    {
        assertNotNull(retangulo1);
    }

    @Test
    public  void presencaAtributos(){
        assertNotNull (retangulo1.getAltura());
        assertNotNull (retangulo1.getBase());
    }
    //set
    @Test
    public void metodoSetBase(){
        retangulo1.setBase(5.0);
        assertEquals(5.0, retangulo1.getBase());

    }
    @Test
    public void metodoSetAltura(){
        retangulo1.setAltura(10.0);
        assertEquals(10.0, retangulo1.getAltura());
    }
    //set invalido
    @Test
    public void metodoSetBaseInvalido(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->retangulo1.setBase(-5.0));
        assertEquals("A base deve ser maior que zero", exception.getMessage());
    }

    @Test
    public void metodoSetAlturaInvalido(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->retangulo1.setAltura(-10.0));
        assertEquals("A altura deve ser maior que zero", exception.getMessage());
    }
    //get
    @Test
    public void metodoGetBase(){
        assertEquals(5.0 , retangulo1.getBase());
    }
    @Test
    public void metodoGetAltura(){
        assertEquals(10.0 , retangulo1.getAltura());
    }
    @Test
    public void metodoCalcularArea(){
        Double esperado = 50.0;
        Double obtido = retangulo1.calcularArea();
        assertEquals(esperado,obtido);
    }
    @Test
    public void metodoCalcularPerimetro(){
        Double esperado = 30.0;
        Double obtido = retangulo1.calcularPerimetro();
        assertEquals(esperado,obtido);
    }
}