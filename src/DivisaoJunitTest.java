import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisaoJunitTest {

    @SuppressWarnings("deprecation")
    @Test
    public void DividirDoisNumerosPositivos() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(10,2);

        Assertions.assertEquals(5, result);
    }

//    @SuppressWarnings("deprecation")
//    @Test
//    public void DividirUmNumeroPositivoEZero() {
//        Divisao divisao = new Divisao();
//        int result = divisao.dividir(10,0);
//
//        Assertions.assertEquals(NaN, result);
//    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirZeroEUmNumeroPositivo() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(0,2);

        Assertions.assertEquals(0, result);
    }

//    @SuppressWarnings("deprecation")
//    @Test
//    public void DividirDoisNumeorsZeros() {
//        Divisao divisao = new Divisao();
//        int result = divisao.dividir(0,0);
//
//        Assertions.assertEquals(NaN, result);
//    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirUmNumeroPositivoENegativo() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(10,-2);

        Assertions.assertEquals(-5, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirUmNumeroNegativoEPositivo() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(-10,2);

        Assertions.assertEquals(-5, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirDoisNumerosNegativos() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(-10,-2);

        Assertions.assertEquals(5, result);
    }

//    @SuppressWarnings("deprecation")
//    @Test
//    public void DividirUmNumeroNegativoEZero() {
//        Divisao divisao = new Divisao();
//        int result = divisao.dividir(-10,0);
//
//        Assertions.assertEquals(NaN, result);
//    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirZeroEUmNumeroNegativo() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(0,-2);

        Assertions.assertEquals(0, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirOValorMaximoDoIntEUmNumeroPositivo() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(2147483647,2);

        Assertions.assertEquals(1073741823.5, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirOValorMaximoDoIntEUmNumeroNegativo() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(2147483647,-2);

        Assertions.assertEquals(-1073741823.5, result);
    }

//    @SuppressWarnings("deprecation")
//    @Test
//    public void DividirOValorMaximoDoIntEZero() {
//        Divisao divisao = new Divisao();
//        int result = divisao.dividir(2147483647,0);
//
//        Assertions.assertEquals(NaN, result);
//    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirUmNumeroPositivoEOValorMaximoDoInt() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(10,2147483647);

        Assertions.assertEquals(0.000000004656613, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirUmNumeroNegativoEOValorMaximoDoInt() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(-10,2147483647);

        Assertions.assertEquals(-0.000000004656613, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirZeroEOValorMaximoDoInt() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(0,2147483647);

        Assertions.assertEquals(0, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirOValorMinimoDoIntEUmNumeroPositivo() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(-2147483648,2);

        Assertions.assertEquals(-1073741824, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirOValorMinimoDoIntEUmNumeroNegativo() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(-2147483648,-2);

        Assertions.assertEquals(1073741824, result);
    }

//    @SuppressWarnings("deprecation")
//    @Test
//    public void DividirOValorMinimoDoIntEZero() {
//        Divisao divisao = new Divisao();
//        int result = divisao.dividir(-2147483648,0);
//
//        Assertions.assertEquals(NaN, result);
//    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirUmNumeroPositivoEOValorMinimoDoInt() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(10,-2147483648);

        Assertions.assertEquals(-0.000000004656613, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirUmNumeroNegativoEOValorMinimoDoInt() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(-10,-2147483648);

        Assertions.assertEquals(0.000000004656613, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirZeroEOValorMinimoDoInt() {
        Divisao divisao = new Divisao();
        int result = divisao.dividir(0,-2147483648);

        Assertions.assertEquals(0, result);
    }
}
