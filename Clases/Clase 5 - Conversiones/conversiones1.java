public class conversiones {
    public static void main(String[] args) {
        /*
        // CONVERSIONES //
        Una conversión es la transformacíón de un tipo de dato a otro tipo.
        Hay dos tipos principales de conversiones: conversión implícita (también conocida como
        conversión automática o "widening") y conversión explícita (también conocida como "casting" o "narrowing").
        */

        //Conversión Implícita
        /*
        La conversión implícita ocurre automáticamente cuando se asigna un valor de un tipo de dato
        más pequeño a un tipo de dato más grande. No se requiere una sintaxis especial para esta conversión,
        ya que Java maneja esto automáticamente.
        */
        int numeroInt = 100;
        long numeroLong = numeroInt; // Conversión implícita de int a long
        float numeroFloat = numeroLong; // Conversión implícita de long a float

        System.out.println(numeroLong);  // Imprime: 100
        System.out.println(numeroFloat); // Imprime: 100.0

        //Conversión Explícita
        /*
        La conversión explícita debe ser especificada por el programador y se utiliza cuando se asigna
        un valor de un tipo de dato más grande a un tipo de dato más pequeño. Esto se hace utilizando el
        operador de casting (tipo).
        */
        double numeroDouble = 9.78;
        int numeroInt2 = (int) numeroDouble; // Conversión explícita de double a int

        System.out.println(numeroInt2); // Imprime: 9


        
        //Conversión entre Objetos y Tipos Primitivos (Autoboxing y Unboxing)
        /*
            //Autoboxing
            Java convierte automáticamente un tipo primitivo a su clase envoltorio correspondiente
            cuando es necesario.
        */
        Integer numeroInteger = 10; // Autoboxing: convierte int a Integer

        /*
            //Unboxing
            Java convierte automáticamente un objeto de la clase envoltorio a su tipo primitivo
            correspondiente cuando es necesario.
        */
        int numeroInt3 = numeroInteger; // Unboxing: convierte Integer a int


    }
}
