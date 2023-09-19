import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtracaoJunitTest {

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairDoisNumerosPositivos() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(10,3);

        Assertions.assertEquals(7, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairUmNumeroPositivoEZero() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(10,0);

        Assertions.assertEquals(10, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairZeroEUmNumeroPositivo() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(0,10);

        Assertions.assertEquals(-10, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairDoisNumeorsZeros() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(0,0);

        Assertions.assertEquals(0, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairUmNumeroPositivoENegativo() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(10,-1);

        Assertions.assertEquals(11, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairUmNumeroNegativoEPositivo() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(-1,10);

        Assertions.assertEquals(-11, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairDoisNumerosNegativos() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(-10,-1);

        Assertions.assertEquals(-9, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairUmNumeroNegativoEZero() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(-10,0);

        Assertions.assertEquals(-10, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairZeroEUmNumeroNegativo() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(0,-10);

        Assertions.assertEquals(10, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairOValorMaximoDoIntEUmNumeroPositivo() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(2147483647,1);

        Assertions.assertEquals(2147483646, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairOValorMaximoDoIntEUmNumeroNegativo() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(2147483647,-1);

        Assertions.assertEquals(2147483648L, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairOValorMaximoDoIntEZero() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(2147483647,0);

        Assertions.assertEquals(2147483647, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairUmNumeroPositivoEOValorMaximoDoInt() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(1,2147483647);

        Assertions.assertEquals(-2147483646, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairUmNumeroNegativoEOValorMaximoDoInt() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(-1,2147483647);

        Assertions.assertEquals(-2147483648, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairZeroEOValorMaximoDoInt() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(0,2147483647);

        Assertions.assertEquals(-2147483647, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairOValorMinimoDoIntEUmNumeroPositivo() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(-2147483648,1);

        Assertions.assertEquals(-2147483649L, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairOValorMinimoDoIntEUmNumeroNegativo() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(-2147483648,-1);

        Assertions.assertEquals(-2147483647, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairOValorMinimoDoIntEZero() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(-2147483648,0);

        Assertions.assertEquals(-2147483648, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairUmNumeroPositivoEOValorMinimoDoInt() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(1,-2147483648);

        Assertions.assertEquals(2147483649L, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairUmNumeroNegativoEOValorMinimoDoInt() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(-1,-2147483648);

        Assertions.assertEquals(2147483647, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairZeroEOValorMinimoDoInt() {
        Subtracao subtracao = new Subtracao();
        int result = subtracao.subtrair(0,-2147483648);

        Assertions.assertEquals(2147483648L, result);
    }
}
