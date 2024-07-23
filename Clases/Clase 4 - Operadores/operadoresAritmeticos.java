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
    }
}
