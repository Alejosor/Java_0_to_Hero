/* ╔══════════════════════════════════════╗
   ║ Autor: Alejandro Soriano             ║
   ║ Perfil: https://github.com/Alejosor  ║
   ╚══════════════════════════════════════╝
*/

public class conversiones3PrimitivosStrings {
    public static void main(String[] args) {
        // Conversiones de Primitivos a Strings

        // CHAR -> STRING
        //Declaración de variables
        char caracter = 'H';

        //Conversión
        String letra = Character.toString(caracter);
        System.out.println("De char a String (Tipo primitivo) = " + letra);

        //Conversión: Concatenación
        /*
        Este método de conversión es simple y directo, y a menudo se usa en el código para convertir
        rápidamente un tipo primitivo a una cadena.
        */

        letra = caracter + "";
        System.out.println("De char a String (Concatenación) = " + letra);

        //-----------------------------------------------------------
        /*
        Usa toString() cuando necesitas una representación en cadena personalizada de un objeto,
        especialmente si estás sobrescribiendo este método en tus clases.

        Usa String.valueOf() cuando necesites convertir cualquier tipo de dato a una cadena, especialmente si existe
        la posibilidad de que el valor sea null.
         */
        //-----------------------------------------------------------

        //BYTE -> STRING
        //Declaración de variables
        byte numero = 18;

        //Conversión
        // Convierte en String (Método de instancia).
        String num1 = Byte.toString(numero);
        System.out.println("De byte a String (Método de instancia) = " + num1);

        // Convierte en String (Método estático).
        String num1_2 = String.valueOf(numero);
        System.out.println("De byte a String (Método de instancia) = " + num1_2);

        //Conversión: Concatenación
        num1 = numero + "";
        System.out.println("De byte a String (Concatenación) = " + num1);

        //----------------------------------------------------------

        //SHORT -> STRING
        //Declaración de variables
        short numero2 = 16;

        //Conversión
        // Convierte en String (Método de instancia).
        String num2 = Short.toString(numero2);
        System.out.println("De short a String (Método de instancia) = " + num2);

        // Convierte en String (Método estático).
        String num2_2 = String.valueOf(numero2);
        System.out.println("De short a String (Método de instancia) = " + num2_2);

        //Conversión: Concatenación
        num2 = numero2 + "";
        System.out.println("De short a String (Concatenación) = " + num2);

        //----------------------------------------------------------

        //INTEGER -> STRING
        //Declaración de variables
        int numero3 = 10;

        //Conversión
        // Convierte en String (Método de instancia).
        String num3 = Integer.toString(numero3);
        System.out.println("De integer a String (Método de instancia) = " + num3);

        // Convierte en String (Método estático).
        String num3_2 = String.valueOf(numero3);
        System.out.println("De integer a String (Método de instancia) = " + num3_2);

        //Conversión: Concatenación
        num3 = numero3 + "";
        System.out.println("De integer a String (Concatenación) = " + num3);

        //----------------------------------------------------------

        //LONG -> STRING
        //Declaración de variables
        long numero4 = 15L;

        //Conversión
        // Convierte en String (Método de instancia).
        String num4 = Long.toString(numero4);
        System.out.println("De long a String (Método de instancia) = " + num4);

        // Convierte en String (Método estático).
        String num4_2 = String.valueOf(numero4);
        System.out.println("De long a String (Método de instancia) = " + num4_2);

        //Conversión: Concatenación
        num4 = numero4 + "";
        System.out.println("De long a String (Concatenación) = " + num4);

        //----------------------------------------------------------

        //FLOAT -> STRING
        //Declaración de variables
        float numero5 = 1.58F;

        //Conversión
        // Convierte en String (Método de instancia).
        String num5 = Float.toString(numero5);
        System.out.println("De float a String (Método de instancia) = " + num5);

        // Convierte en String (Método estático).
        String num5_2 = String.valueOf(numero5);
        System.out.println("De float a String (Método de instancia) = " + num5_2);

        //Conversión: Concatenación
        num5 = numero5 + "";
        System.out.println("De float a String (Concatenación) = " + num5);

        //----------------------------------------------------------

        //DOUBLE -> STRING
        //Declaración de variables
        double numero6 = 3.54;

        //Conversión
        // Convierte en String (Método de instancia).
        String num6 = Double.toString(numero6);
        System.out.println("De double a String (Método de instancia) = " + num6);

        // Convierte en String (Método estático).
        String num6_2 = String.valueOf(numero6);
        System.out.println("De double a String (Método de instancia) = " + num6_2);

        //Conversión: Concatenación
        num6 = numero6 + "";
        System.out.println("De double a String (Concatenación) = " + num6);
    }
}
