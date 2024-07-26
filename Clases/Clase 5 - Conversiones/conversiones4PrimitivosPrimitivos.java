public class conversionesPrimitivosPrimitivos {
    public static void main(String[] args) {
        // Conversiones de Primitivos a Primitivos
        //Declaración de variables
        byte num1 = 100;
        int num2 = 100;

        float num3 = 4000.123f;
        double num4 = 5000.123456789123123;

        //Conversión de Ampliación Primitiva (Implícita / Automática)
        /*
        > Conversión de Ampliación (Widening)
        La conversión de ampliación ocurre automáticamente cuando se asigna un valor de un tipo de dato más
        pequeño a un tipo de dato más grande. Este tipo de conversión es segura porque el rango del tipo de
        dato más grande incluye el rango del tipo de dato más pequeño,
        lo que significa que no habrá pérdida de información.

        La conversión de ampliación sigue el siguiente orden jerárquico:

        byte -> short -> int -> long -> float -> double

        char -> int -> long -> float -> double

        */
        //Guardamos una variable de rango menor en una variable numérica de rango mayor
        num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

        num4 = num3;
        System.out.println(num3);
        System.out.println(num4);


        int numeroInt = 100;
        long numeroLong = numeroInt; // Conversión implícita de int a long
        float numeroFloat = numeroLong; // Conversión implícita de long a float

        System.out.println(numeroLong);  // Imprime: 100
        System.out.println(numeroFloat); // Imprime: 100.0

        //Conversión de Estrechamiento Primitiva (Explicita / Manual)
        /*
        > Conversión de Estrechamiento (Narrowing)
        La conversión de estrechamiento ocurre cuando se asigna un valor de un tipo de dato más grande a un
        tipo de dato más pequeño. Este tipo de conversión no es segura porque el rango del tipo de dato más
        pequeño puede no incluir el rango del tipo de dato más grande, lo
        que puede resultar en pérdida de información.

        La conversión de estrechamiento sigue el siguiente orden jerárquico:

        double -> float -> long -> int -> short -> byte

        double -> float -> long -> int -> char
        */
        //Guardamos una variable de rango mayor en una variable numérica de rango menor
        num1 = (byte) num2;
        System.out.println(num1);
        System.out.println(num2);

        num3 = (float) num4;
        System.out.println(num3);
        System.out.println(num4);

        double numeroDouble = 9.78;
        int numeroInt2 = (int) numeroDouble; // Conversión explícita de double a int

        System.out.println(numeroInt2); // Imprime: 9 (pérdida de la parte decimal)

        long numeroLong2 = 1000L;
        short numeroShort = (short) numeroLong2; // Conversión explícita de long a short

        System.out.println(numeroShort); // Imprime: 1000

    }
}
