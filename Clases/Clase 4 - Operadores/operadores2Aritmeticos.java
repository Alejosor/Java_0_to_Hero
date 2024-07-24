public class operadoresAritmeticos {
    public static void main(String[] args) {
        /*
        OPERADORES ARITMÉTICOS
        En esta clase veremos las operaciones más básicas que encontramos en las matemáticas.
        + Suma
        - Resta
        * Multiplicación
        / División
        % Módulo
        */

        //Declaración de variables
        int numero1 = 20;
        int numero2 = 4;
        int resultado;

        //Suma
        resultado = numero1+numero2;
        System.out.println("El resultado de la suma es -> " + resultado);

        //Resta
        resultado = numero1-numero2;
        System.out.println("El resultado de la resta es -> " + resultado);

        //Multiplicación
        resultado = numero1*numero2;
        System.out.println("El resultado de la multiplicación es -> " + resultado);

        //División
        resultado = numero1/numero2;
        System.out.println("El resultado de la división es -> " + resultado);

        //Módulo -> Sirve para obtener el resto de una división
        resultado = numero1 % numero2;
        System.out.println("El resultado del residuo es -> " + resultado);

        //Datos importantes a tener en cuenta

        /*
        •El resultado es de tipo long si, al menos, uno de los operandos es de tipo long y ninguno
        es real (float o double).

            long num3 = 10l;
            int num4 = 5;

            long resultado2 = num3 + num4;
        */


        /*
        El resultado es de tipo int si ninguno de los operandos es de tipo long y tampoco es real (float o double).

            int num3 = 10;
            int num4 = 5;

            int resultado2 = num3 + num4;
        */


        /*
        El resultado es de tipo double si, al menos, uno de los operandos es de tipo double

            double num3 = 10;
            int num4 = 5;

            double resultado2 = num3 + num4;
         */


        /*
        El resultado es de tipo float si, al menos,
        uno de los operandos es de tipo float y ninguno es double.

            float num3 = 10;
            int num4 = 5;

            float resultado2 = num3 + num4;

        */

    }
}
