public class DivisaoTestes {
    public static void main(String[] args) {
        Divisao divisao = new Divisao();

        // Cenário de testes 1: Divisão de dois valores positivos
        int result = divisao.dividir(10, 2);
        System.out.println(result);

        // Cenário de testes 2: Divisão de dois valores sendo o primeiro positivo e o segundo zero
        // result = divisao.dividir(10, 0);
        // System.out.println(result);
        // Incoerencia: o resultado esperado é um NaN (not a number), porem o código quebra e não continua rodando

        // Cenário de testes 3: Divisão de dois valores sendo o primeiro zero e o segundo positivo
        result = divisao.dividir(0, 2);
        System.out.println(result);

        // Cenário de testes 4: Divisão de dois valores sendo que ambos são zero
        // result = divisao.dividir(0, 0);
        // System.out.println(result);
        // Incoerencia: o resultado esperado é um NaN (not a number), porem o código quebra e não continua rodando

        // Cenário de testes 5: Divisão de dois valores sendo o primeiro positivo e o segundo negativo
        result = divisao.dividir(10, -2);
        System.out.println(result);

        // Cenário de testes 6: Divisão de dois valores sendo o primeiro negativo e o segundo positivo
        result = divisao.dividir(-10, 2);
        System.out.println(result);

        // Cenário de testes 7: Divisão de dois valores sendo que abos são negativos
        result = divisao.dividir(-10, -2);
        System.out.println(result);

        // Cenário de testes 8: Divisão de dois valores sendo o primeiro negativo e o segundo zero
        // result = divisao.dividir(-10, 0);
        // System.out.println(result);
        // Incoerencia: o resultado esperado é um NaN (not a number), porem o código quebra e não continua rodando

        // Cenário de testes 9: Divisão de dois valores sendo o primeiro zero e o segundo negativo
        result = divisao.dividir(0, -2);
        System.out.println(result);

        // Cenário de testes 10: Divisão de dois valores sendo o primeiro o valor máximo de um int e o segundo um positivo
        result = divisao.dividir(2147483647, 2);
        System.out.println(result);
        // Incoerencia: o resultado esperado é 1073741823,5 , porem o resultado mostrado é 1073741823, isso porque é aceito um int como resultado dessa calculadora

        // Cenário de testes 11: Divisão de dois valores sendo o primeiro o valor máximo de um int e o segundo um negativo
        result = divisao.dividir( 2147483647, -2);
        System.out.println(result);
        // Incoerencia: o resultado esperado é -1073741823,5 , porem o resultado mostrado é -1073741823, isso porque é aceito um int como resultado dessa calculadora

        // Cenário de testes 12: Divisão de dois valores sendo o primeiro o valor máximo de um int e o segundo zero
        // result = divisao.dividir(2147483647, 0);
        // System.out.println(result);
        // Incoerencia: o resultado esperado é um NaN (not a number), porem o código quebra e não continua rodando

        // Cenário de testes 13: Divisão de dois valores sendo o primeiro positivo e o segundo o valor máximo de um int
        result = divisao.dividir(10, 2147483647);
        System.out.println(result);
        // Incoerencia: o resultado esperado é ≈0,000000004656613 , porem o resultado mostrado é 0, isso porque é aceito um int como resultado dessa calculadora

        // Cenário de testes 14: Divisão de dois valores sendo o primeiro negativo e o segundo o valor máximo de um int
        result = divisao.dividir( -10, 2147483647);
        System.out.println(result);
        // Incoerencia: o resultado esperado é ≈-0,000000004656613 , porem o resultado mostrado é 0, isso porque é aceito um int como resultado dessa calculadora

        // Cenário de testes 15: Divisão de dois valores sendo o primeiro zero e o segundo o valor máximo de um int
        result = divisao.dividir(0, 2147483647);
        System.out.println(result);

        // Cenário de testes 16: Divisão de dois valores sendo o primeiro o valor mínimo de um int e o segundo um positivo
        result = divisao.dividir(-2147483648, 2);
        System.out.println(result);

        // Cenário de testes 17: Divisão de dois valores sendo o primeiro o valor mínimo de um int e o segundo um negativo
        result = divisao.dividir( -2147483648, -2);
        System.out.println(result);

        // Cenário de testes 18: Divisão de dois valores sendo o primeiro o valor mínimo de um int e o segundo zero
        // result = divisao.dividir(-2147483648, 0);
        // System.out.println(result);
        // Incoerencia: o resultado esperado é um NaN (not a number), porem o código quebra e não continua rodando

        // Cenário de testes 19: Divisão de dois valores sendo o primeiro positivo e o segundo o valor mínimo de um int
        result = divisao.dividir(10, -2147483648);
        System.out.println(result);
        // Incoerencia: o resultado esperado é ≈-0,000000004656613 , porem o resultado mostrado é 0, isso porque é aceito um int como resultado dessa calculadora

        // Cenário de testes 20: Divisão de dois valores sendo o primeiro negativo e o segundo o valor mínimo de um int
        result = divisao.dividir( -10, -2147483648);
        System.out.println(result);
        // Incoerencia: o resultado esperado é ≈0,000000004656613 , porem o resultado mostrado é 0, isso porque é aceito um int como resultado dessa calculadora

        // Cenário de testes 21: Divisão de dois valores sendo o primeiro zero e o segundo o valor mínimo de um int
        result = divisao.dividir(0, -2147483648);
        System.out.println(result);
    }
}
