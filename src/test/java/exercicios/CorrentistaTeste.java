package exercicios;

    //Bibliotecas

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    // Classes

public class CorrentistaTeste {
    private Correntista c1;

    @BeforeEach
    public void beforeEach() {
        c1 = new Correntista("1252", "Bilbo", "bilbo@email.com", "29512493");
    }

    @AfterEach
    public void afterEach() {
        c1 = null;
    }

    @Test
    public void criarObjetoCorrentista() {
        assertNotNull(c1);
    }
    //atributos
    @Test
    public void atributoCodigo(){
        assertNotNull(c1.getCodigo());

    }
    @Test
    public void atributoNome() {

        assertNotNull(c1.getNome());
    }
    @Test
    public void atributoEmail() {

        assertNotNull(c1.getEmail());
    }@Test
    public void atributoTelefone() {

        assertNotNull(c1.getTelefone());
    }
    //set
    @Test
    public void metodoSetCodigo(){
        c1.setCodigo("1252");
        assertEquals("1252",c1.getCodigo());
    }
    @Test
    public void metodoSetNome(){
        c1.setCodigo("Bilbo");
        assertEquals("Bilbo",c1.getNome());
    }
    @Test
    public void metodoSetEmail(){
        c1.setCodigo("bilbo@email.com");
        assertEquals("bilbo@email.com",c1.getEmail());
    }
    @Test
    public void metodoSetTelefone(){
        c1.setCodigo("29512493");
        assertEquals("29512493",c1.getTelefone());
    }
    //set invalido
    @Test
    public void metodoSetCodigoInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setCodigo("123"));
        assertEquals("Codigo invalido.", exception.getMessage());
    }
    @Test
    public void metodoSetNomeInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setNome("P"));
        assertEquals("Nome invalido.", exception.getMessage());
    }
    @Test
    public void metodoSetEmailInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setEmail("pe"));
        assertEquals("E-mail invalido.", exception.getMessage());
    }  @Test
    public void metodoSetTelefoneInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setTelefone("38"));
        assertEquals("Telefone invalido.", exception.getMessage());
    }



    //get
    @Test
    public void metodoGetNome() {
        assertEquals("Bilbo", c1.getNome());
    }
    @Test
    public void metodoGetEmail() {
        assertEquals("bilbo@email.com", c1.getEmail());
    }
    @Test
    public void metodoGetTelefone() {
        assertEquals("29512493", c1.getTelefone());
    }
    @Test
    public void metodoGetCodigo() {
        assertEquals("1252", c1.getCodigo());
    }



}
