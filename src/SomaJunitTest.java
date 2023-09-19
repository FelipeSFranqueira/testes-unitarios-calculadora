import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomaJunitTest {

    @SuppressWarnings("deprecation")
    @Test
    public void SomarDoisNumerosPositivos() {
        Soma soma = new Soma();
        int result = soma.somar(3,7);

        Assertions.assertEquals(10, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomarUmNumeroPositivoEZero() {
        Soma soma = new Soma();
        int result = soma.somar(3,0);

        Assertions.assertEquals(3, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomarDoisNumeorsZeros() {
        Soma soma = new Soma();
        int result = soma.somar(0,0);

        Assertions.assertEquals(0, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomarUmNumeroPositivoENegativo() {
        Soma soma = new Soma();
        int result = soma.somar(3,-1);

        Assertions.assertEquals(2, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomarDoisNumerosNegativos() {
        Soma soma = new Soma();
        int result = soma.somar(-1,-2);

        Assertions.assertEquals(-3, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomarUmNumeroNegativoEZero() {
        Soma soma = new Soma();
        int result = soma.somar(-1,0);

        Assertions.assertEquals(-1, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomarUmNumeroPositivoEOValorMaximoDoInt() {
        Soma soma = new Soma();
        int result = soma.somar(1,2147483647);

        Assertions.assertEquals(2147483648L, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomarUmNumeroNegativoEOValorMaximoDoInt() {
        Soma soma = new Soma();
        int result = soma.somar(-1,2147483647);

        Assertions.assertEquals(2147483646, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomarZeroEOValorMaximoDoInt() {
        Soma soma = new Soma();
        int result = soma.somar(0,2147483647);

        Assertions.assertEquals(2147483647, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomarUmNumeroPositivoEOValorMinimoDoInt() {
        Soma soma = new Soma();
        int result = soma.somar(1,-2147483648);

        Assertions.assertEquals(-2147483647, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomarUmNumeroNegativoEOValorMinimoDoInt() {
        Soma soma = new Soma();
        int result = soma.somar(-1,-2147483648);

        Assertions.assertEquals(-2147483649L, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomarZeroEOValorMinimoDoInt() {
        Soma soma = new Soma();
        int result = soma.somar(0,-2147483648);

        Assertions.assertEquals(-2147483648, result);
    }
}