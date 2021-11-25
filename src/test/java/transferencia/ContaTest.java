package transferencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    Cliente xuxa;
    Cliente silvioSantos;
    Conta contaXuxa;
    Conta contasilvio;

    @BeforeEach
    void setUp(){

        xuxa = new Cliente ("xuxa", "06739973679", "13605826");
        silvioSantos = new Cliente("Silvio Santos", "04844898725", "13652985");
        contaXuxa = new Conta("0025", "2254", 2500.0, xuxa);
        contasilvio = new Conta("0026", "2251", 3500, silvioSantos);
    }

    @Test
    public void realizarTransacao(){

        contaXuxa.realizarTansferencia(1000.00, contasilvio);

        assertEquals(1500.00, contaXuxa.getSaldo());
        assertEquals(4500.00, contasilvio.getSaldo());


            }

            @Test
    public void validarTransferenciaInvalida(){


              boolean resultado = contaXuxa.realizarTansferencia(3500.00, contaXuxa);
                assertFalse(resultado);

            }

    @Test
    public void validarProprietario(){
        assertEquals(xuxa, contaXuxa.getProprietario());
    }
}