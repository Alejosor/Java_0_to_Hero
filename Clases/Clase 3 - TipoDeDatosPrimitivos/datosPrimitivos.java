public class datosPrimitivos {
    public static void main(String[] args) {

        //Estos son los 8 tipos de datos primitivos en Java

        /*
        **Números Enteros**
        Empezamos por los que pueden llegar a mostrar números enteros: byte - short - int - long
        Un número entero es un número del conjunto Z {... -2, -1, 0 , 1 , 2, ...}
        Difieren en las precisiones y pueden ser positivos o negativos.
        */

        byte numeroByte = 12;
        System.out.println("Este es un número admitido dentro de los bytes = " + numeroByte);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE); // Máximo valor: 127
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE); // Mínimo valor: -128

        System.out.println("**********************");

        short numeroShort = 300;
        System.out.println("Este es un número admitido dentro de los short = " + numeroShort);
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE); // Máximo valor: 32767
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE); // Mínimo valor: -32768

        System.out.println("**********************");

        int numeroInt = 40500;
        System.out.println("Este es un número admitido dentro de los ints = " + numeroInt);
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE); // Máximo valor: 2147483647
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE); // Mínimo valor: -2147483648

        System.out.println("**********************");

        //Es necesario colocar una L al final de un número de tipo Long.
        long numeroLong = 3147483647L;
        System.out.println("Este es un número admitido dentro de los Longs = " + numeroLong);
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE); // Máximo valor: 9223372036854775807
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE); // Mínimo valor: -9223372036854775808

        /*
        **Números Reales**
        Es un tipo dato para guardar números reales en coma flotante con precisión simple y doble.
        Los números de punto flotante (también conocidos "flotantes", "dobles" o "números reales")
        -La diferencia entre ambos tipos de dato es que en uno vamos a ver más números decimales que en el otro.
        */

        System.out.println("**********************");

        float realFloat = 3.1416f; // Debe llevar la letra "f" al final al momento de usar el tipo float
        System.out.println("Este es un número admitido dentro de los Floats = " + realFloat);
        System.out.println("Valor máximo de un float: " + Float.MAX_VALUE); // Máximo valor: 3.4028235E38
        System.out.println("Valor mínimo de un float: " + Float.MIN_VALUE); // Mínimo valor: 1.4E-45

        System.out.println("**********************");

        double realDouble = 4.702922354;
        System.out.println("Este es un número admitido dentro de los Doubles = " + realDouble);
        System.out.println("Valor máximo de un double: " + Double.MAX_VALUE); // Máximo valor: 1.7976931348623157E308
        System.out.println("Valor mínimo de un double: " + Double.MIN_VALUE); // Mínimo valor: 4.9E-324

        System.out.println("**********************");

        /*
        **Char**
        Uso el código UNICODE y ocupa cada carácter 16 bits.
        */
        char a = 'a';
        char b = 'b';
        char c = '\u0021';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("**********************");

        /*
        **Booleanos**
        Es el tipo más simple de un solo bit.
        El boolean expresa un valor de verdad, puede ser verdadero o falso.
        */

        boolean af = false;
        System.out.println(af); //false

        boolean bf = true;
        System.out.println(bf); //true
    }
}
