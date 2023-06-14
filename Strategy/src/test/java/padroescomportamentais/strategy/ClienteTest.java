package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRealizarCalculoSomar() {
        Calculadora calculadora = new Calculadora(0, 0);
        Cliente cliente = new Cliente(calculadora);
        cliente.somarNota(80.0f, 20.0f);
        assertEquals(100.0f, cliente.getNota());
    }

    @Test
    void deveRealizarCalculoSubtrair() {
        Calculadora calculadora = new Calculadora(0, 0);
        Cliente cliente = new Cliente(calculadora);
        cliente.subtrairNota(80.0f, 10.0f);
        assertEquals(70.0f, cliente.getNota());
    }

    @Test
    void deveRealizarCalculoMultiplicar() {
        Calculadora calculadora = new Calculadora(0, 0);
        Cliente cliente = new Cliente(calculadora);
        cliente.multiplicarNota(80.0f, 1.1f);
        assertEquals(88.0f, cliente.getNota());
    }

    @Test
    void deveRealizarCalculoDividir() {
        Calculadora calculadora = new Calculadora(0, 0);
        Cliente cliente = new Cliente(calculadora);
        cliente.dividirNota(100.0f, 2.0f);
        assertEquals(50.0f, cliente.getNota());
    }

    @Test
    void naoDeveRealizarCalculoDividirPorZero() {
        try {
            Calculadora calculadora = new Calculadora(0, 0);
            Cliente cliente = new Cliente(calculadora);
            cliente.dividirNota(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveRealizarCalculoMedia() {
        Calculadora calculadora = new Calculadora(0, 0);
        Cliente cliente = new Cliente(calculadora);
        cliente.calcularMediaNotas(70.0f, 80.0f);
        assertEquals(75.0f, cliente.getNota());
    }
}
