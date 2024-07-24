public class operadoresUnario {
    public static void main(String[] args) {
        //Operadores Unarios
        /*
            Los operadores unarios en Java son aquellos que solo requieren un operando para funcionar
            + Suma: Sirve para indicar una suma
            - Resta: Sirve para indicar una resta, o convertir un número a negativo.
            ! Negación: Invierte el valor de una expresión o un booleano
            ++ Incremento: Sirve para incrementar de uno en uno números o variables.
            -- Decremento: Sirve para reducir de uno en uno números o variables
         */

        //Declaración de variables
        int resultado = 1;
        System.out.println(resultado);

        int resultado2 = +1;
        System.out.println(resultado2);

        int resultado3 = -1;
        System.out.println(resultado3);

        //Operador de incremento ++
        resultado ++;
        System.out.println(resultado); // Suma 1 unidad

        //operador de decremento --
        resultado --;
        System.out.println(resultado); // Resta 1 unidad

        //Cambiamos el signo del número o variable numérica aplicando el operador de resta -
        resultado = 10;
        resultado = -resultado;
        System.out.println(resultado); // Lo convertimos en -10

        //Operador de negación
        boolean esVerdadero = false;
        System.out.println(esVerdadero);
        System.out.println(!esVerdadero); // El false para a ser TRUE
    }
}
