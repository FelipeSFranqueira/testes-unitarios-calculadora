public class MultiplicacaoTestes {
    public static void main(String[] args) {
        Multiplicacao multiplicacao = new Multiplicacao();

        // Cenário de testes 1: Multiplicação de dois valores positivos
        int result = multiplicacao.multiplicar(5, 2);
        System.out.println(result);

        // Cenário de testes 2: Multiplicação de dois valores sendo um positivo e o outro zero
        result = multiplicacao.multiplicar(5, 0);
        System.out.println(result);

        // Cenário de testes 3: Multiplicação de dois valores sendo que ambos são zero
        result = multiplicacao.multiplicar(0, 0);
        System.out.println(result);

        // Cenário de testes 4: Multiplicação de dois valores sendo um positivo e o outro negativo
        result = multiplicacao.multiplicar(5, -2);
        System.out.println(result);

        // Cenário de testes 5: Multiplicação de dois valores sendo que abos são negativos
        result = multiplicacao.multiplicar(-5, -2);
        System.out.println(result);

        // Cenário de testes 6: Multiplicação de dois valores sendo um negativo e o outro zero
        result = multiplicacao.multiplicar(-5, 0);
        System.out.println(result);

        // Cenário de testes 7: Multiplicação de dois valores sendo um  o valor máximo de um int e o outro um positivo
        result = multiplicacao.multiplicar(2147483647, 2);
        System.out.println(result);
        // Incoerencia: o resultado esperado é 4294967294, porem o resultado mostrado foi -2

        // Cenário de testes 8: Multiplicação de dois valores sendo um  o valor máximo de um int e o outro um negativo
        result = multiplicacao.multiplicar( 2147483647, -2);
        System.out.println(result);
        // Incoerencia: o resultado esperado é -4294967294, porem o resultado mostrado foi 2

        // Cenário de testes 9: Multiplicação de dois valores sendo um  o valor máximo de um int e o outro zero
        result = multiplicacao.multiplicar(2147483647, 0);
        System.out.println(result);

        // Cenário de testes 10: Multiplicação de dois valores sendo um  o valor mínimo de um int e o outro um positivo
        result = multiplicacao.multiplicar(-2147483648, 2);
        System.out.println(result);
        // Incoerencia: o resultado esperado é -4294967296, porem o resultado mostrado foi 0

        // Cenário de testes 11: Multiplicação de dois valores sendo um  o valor mínimo de um int e o outro um negativo
        result = multiplicacao.multiplicar( -2147483648, -2);
        System.out.println(result);
        // Incoerencia: o resultado esperado é 4294967296, porem o resultado mostrado foi 0

        // Cenário de testes 12: Multiplicação de dois valores sendo um  o valor mínimo de um int e o outro zero
        result = multiplicacao.multiplicar(-2147483648, 0);
        System.out.println(result);
    }
}
