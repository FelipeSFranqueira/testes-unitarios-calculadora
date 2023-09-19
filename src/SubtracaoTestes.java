public class SubtracaoTestes {
    public static void main(String[] args) {
        Subtracao subtracao = new Subtracao();

        // Cenário de testes 1: Subtração de dois valores positivos
        int result = subtracao.subtrair(10, 3);
        System.out.println(result);

        // Cenário de testes 2: Subtração de dois valores sendo o primeiro positivo e o segundo zero
        result = subtracao.subtrair(10, 0);
        System.out.println(result);

        // Cenário de testes 3: Subtração de dois valores sendo o primeiro zero e o segundo positivo
        result = subtracao.subtrair(0, 10);
        System.out.println(result);

        // Cenário de testes 4: Subtração de dois valores sendo que ambos são zero
        result = subtracao.subtrair(0, 0);
        System.out.println(result);

        // Cenário de testes 5: Subtração de dois valores sendo o primeiro positivo e o segundo negativo
        result = subtracao.subtrair(10, -1);
        System.out.println(result);

        // Cenário de testes 6: Subtração de dois valores sendo o primeiro negativo e o segundo positivo
        result = subtracao.subtrair(-1, 10);
        System.out.println(result);

        // Cenário de testes 7: Subtração de dois valores sendo que abos são negativos
        result = subtracao.subtrair(-10, -1);
        System.out.println(result);

        // Cenário de testes 8: Subtração de dois valores sendo o primeiro negativo e o segundo zero
        result = subtracao.subtrair(-10, 0);
        System.out.println(result);

        // Cenário de testes 9: Subtração de dois valores sendo o primeiro zero e o segundo negativo
        result = subtracao.subtrair(0, -10);
        System.out.println(result);

        // Cenário de testes 10: Subtração de dois valores sendo o primeiro o valor máximo de um int e o segundo um positivo
        result = subtracao.subtrair(2147483647, 1);
        System.out.println(result);

        // Cenário de testes 11: Subtração de dois valores sendo o primeiro o valor máximo de um int e o segundo um negativo
        result = subtracao.subtrair( 2147483647, -1);
        System.out.println(result);
        // Incoerencia: o resultado esperado é 2147483648, porem o resultado mostrado foi -2147483648

        // Cenário de testes 12: Subtração de dois valores sendo o primeiro o valor máximo de um int e o segundo zero
        result = subtracao.subtrair(2147483647, 0);
        System.out.println(result);

        // Cenário de testes 13: Subtração de dois valores sendo o primeiro positivo e o segundo o valor máximo de um int
        result = subtracao.subtrair(1, 2147483647);
        System.out.println(result);

        // Cenário de testes 14: Subtração de dois valores sendo o primeiro negativo e o segundo o valor máximo de um int
        result = subtracao.subtrair( -1, 2147483647);
        System.out.println(result);

        // Cenário de testes 15: Subtração de dois valores sendo o primeiro zero e o segundo o valor máximo de um int
        result = subtracao.subtrair(0, 2147483647);
        System.out.println(result);

        // Cenário de testes 16: Subtração de dois valores sendo o primeiro o valor mínimo de um int e o segundo um positivo
        result = subtracao.subtrair(-2147483648, 1);
        System.out.println(result);
        // Incoerencia: o resultado esperado é -2147483649, porem o resultado mostrado foi 2147483647

        // Cenário de testes 17: Subtração de dois valores sendo o primeiro o valor mínimo de um int e o segundo um negativo
        result = subtracao.subtrair( -2147483648, -1);
        System.out.println(result);

        // Cenário de testes 18: Subtração de dois valores sendo o primeiro o valor mínimo de um int e o segundo zero
        result = subtracao.subtrair(-2147483648, 0);
        System.out.println(result);

        // Cenário de testes 19: Subtração de dois valores sendo o primeiro positivo e o segundo o valor mínimo de um int
        result = subtracao.subtrair(1, -2147483648);
        System.out.println(result);
        // Incoerencia: o resultado esperado é 2147483649, porem o resultado mostrado foi -2147483647

        // Cenário de testes 20: Subtração de dois valores sendo o primeiro negativo e o segundo o valor mínimo de um int
        result = subtracao.subtrair( -1, -2147483648);
        System.out.println(result);

        // Cenário de testes 21: Subtração de dois valores sendo o primeiro zero e o segundo o valor mínimo de um int
        result = subtracao.subtrair(0, -2147483648);
        System.out.println(result);
    }
}
