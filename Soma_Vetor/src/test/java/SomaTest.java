import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SomaTest {

    Soma soma;

    @BeforeEach
    void init(){
       soma = new Soma();
    }

    @Test
    void deveraVoltarSomaVetores(){
        init();
        int teste[] = {45, 12, 2, 8, 37, 98};
        int resultado = soma.somaVetor(teste);

        Assertions.assertEquals(202, resultado);
    }
}
