public class SomaTestes {
    public static void main(String[] args) {
        Soma soma = new Soma();

        // Cenário de testes 1: Soma de dois valores positivos
        int result = soma.somar(3, 7);
        System.out.println(result);

        // Cenário de testes 2: Soma de dois valores sendo um positivo e o outro zero
        result = soma.somar(3, 0);
        System.out.println(result);

        // Cenário de testes 3: Soma de dois valores sendo que ambos são zero
        result = soma.somar(0, 0);
        System.out.println(result);

        // Cenário de testes 4: Soma de dois valores sendo um positivo e o outro negativo
        result = soma.somar(3, -1);
        System.out.println(result);

        // Cenário de testes 5: Soma de dois valores sendo que abos são negativos
        result = soma.somar(-1, -2);
        System.out.println(result);

        // Cenário de testes 6: Soma de dois valores sendo um negativo e o outro zero
        result = soma.somar(-1, 0);
        System.out.println(result);

        // Cenário de testes 7: Soma de dois valores sendo um positivo e o outro o valor máximo de um int
        result = soma.somar(1, 2147483647);
        System.out.println(result);
        // Incoerencia: o resultado esperado é 2147483648, porem o resultado mostrado foi -2147483648

        // Cenário de testes 8: Soma de dois valores sendo um negativo e o outro o valor máximo de um int
        result = soma.somar(-1, 2147483647);
        System.out.println(result);

        // Cenário de testes 9: Soma de dois valores sendo um zero e o outro o valor máximo de um int
        result = soma.somar(0, 2147483647);
        System.out.println(result);

        // Cenário de testes 10: Soma de dois valores sendo um positivo e o outro o valor mínimo de um int
        result = soma.somar(1, -2147483648);
        System.out.println(result);

        // Cenário de testes 11: Soma de dois valores sendo um negativo e o outro o valor mínimo de um int
        result = soma.somar(-1, -2147483648);
        System.out.println(result);
        // Incoerencia: o resultado esperado é -2147483649, porem o resultado mostrado foi 2147483647

        // Cenário de testes 12: Soma de dois valores sendo um zero e o outro o valor mínimo de um int
        result = soma.somar(0, -2147483648);
        System.out.println(result);
    }
}
