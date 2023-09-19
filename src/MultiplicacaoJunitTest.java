import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicacaoJunitTest {

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicarDoisNumerosPositivos() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int result = multiplicacao.multiplicar(5,2);

        Assertions.assertEquals(10, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicarUmNumeroPositivoEZero() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int result = multiplicacao.multiplicar(5,0);

        Assertions.assertEquals(0, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicarDoisNumeorsZeros() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int result = multiplicacao.multiplicar(0,0);

        Assertions.assertEquals(0, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicarUmNumeroPositivoENegativo() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int result = multiplicacao.multiplicar(5,-2);

        Assertions.assertEquals(-10, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicarDoisNumerosNegativos() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int result = multiplicacao.multiplicar(-5,-2);

        Assertions.assertEquals(10, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicarUmNumeroNegativoEZero() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int result = multiplicacao.multiplicar(-5,0);

        Assertions.assertEquals(0, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicarUmNumeroPositivoEOValorMaximoDoInt() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int result = multiplicacao.multiplicar(2,2147483647);

        Assertions.assertEquals(4294967294L, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicarUmNumeroNegativoEOValorMaximoDoInt() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int result = multiplicacao.multiplicar(-2,2147483647);

        Assertions.assertEquals(-4294967294L, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicarZeroEOValorMaximoDoInt() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int result = multiplicacao.multiplicar(0,2147483647);

        Assertions.assertEquals(0, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicarUmNumeroPositivoEOValorMinimoDoInt() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int result = multiplicacao.multiplicar(2,-2147483648);

        Assertions.assertEquals(-4294967296L, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicarUmNumeroNegativoEOValorMinimoDoInt() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int result = multiplicacao.multiplicar(-2,-2147483648);

        Assertions.assertEquals(4294967296L, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicarZeroEOValorMinimoDoInt() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int result = multiplicacao.multiplicar(0,-2147483648);

        Assertions.assertEquals(0, result);
    }
}