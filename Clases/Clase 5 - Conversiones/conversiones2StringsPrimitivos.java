public class conversionesStringsPrimitivos {
    public static void main(String[] args) {
        // Conversiones de Strings a Primitivos

        //STRING -> CHAR
        //Declaración de variables
        String saludo = "Hola";

        //Conversión
        char caracter = saludo.charAt(0); //Imprimirá la primera letra del saludo
        System.out.println("Carácter = " + caracter);

        //----------------------------------------------------------

        //STRING -> BYTE
        //Declaración de variables
        String numero = "10";

        //Conversión
        // Convierte en tipo primitivo
        byte num1 = Byte.parseByte(numero);
        System.out.println("De String a byte (Tipo primitivo) = " + num1);

        // Convierte en un objeto de tipo envoltorio *Los usaremos más adelante en el curso
        byte num1_2 = Byte.valueOf(numero);
        System.out.println("De String a BYTE (Tipo envoltorio) = " + num1_2);

        //----------------------------------------------------------

        //STRING -> SHORT
        //Declaración de variables
        numero = "10";

        //Conversión
        // Convierte en tipo primitivo
        short num2 = Short.parseShort(numero);
        System.out.println("De String a short (Tipo primitivo) = " + num2);

        // Convierte en un objeto de tipo envoltorio *Los usaremos más adelante en el curso
        short num2_2 = Short.valueOf(numero);
        System.out.println("De String a SHORT (Tipo envoltorio) = " + num2_2);

        //----------------------------------------------------------

        //STRING -> INTEGER
        //Declaración de variables
        numero = "10";

        //Conversión
        // Convierte en tipo primitivo
        int num3 = Integer.parseInt(numero);
        System.out.println("De String a integer (Tipo primitivo) = " + num3);

        // Convierte en un objeto de tipo envoltorio *Los usaremos más adelante en el curso
        int num3_2 = Integer.valueOf(numero);
        System.out.println("De String a Integer (Tipo envoltorio) = " + num3_2);

        //----------------------------------------------------------

        //STRING -> LONG
        //Declaración de variables
        numero = "10";

        //Conversión
        // Convierte en tipo primitivo
        long num4 = Long.parseLong(numero);
        System.out.println("De String a long (Tipo primitivo) = " + num4);

        // Convierte en un objeto de tipo envoltorio *Los usaremos más adelante en el curso
        long num4_2 = Long.valueOf(numero);
        System.out.println("De String a Long (Tipo envoltorio) = " + num4_2);

        //----------------------------------------------------------

        //STRING -> FLOAT
        //Declaración de variables
        numero = "10";

        //Conversión
        // Convierte en tipo primitivo
        float num5 = Float.parseFloat(numero);
        System.out.println("De String a float (Tipo primitivo) = " + num5);

        // Convierte en un objeto de tipo envoltorio *Los usaremos más adelante en el curso
        float num5_2 = Float.valueOf(numero);
        System.out.println("De String a Float (Tipo envoltorio) = " + num5_2);

        //----------------------------------------------------------

        //STRING -> DOUBLE
        //Declaración de variables
        numero = "10";

        //Conversión
        // Convierte en tipo primitivo
        double num6 = Double.parseDouble(numero);
        System.out.println("De String a double (Tipo primitivo) = " + num6);

        // Convierte en un objeto de tipo envoltorio *Los usaremos más adelante en el curso
        double num6_2 = Double.valueOf(numero);
        System.out.println("De String a Float (Tipo envoltorio) = " + num6_2);
    }
}
