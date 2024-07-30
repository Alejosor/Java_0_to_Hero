/* ╔══════════════════════════════════════╗
   ║ Autor: Alejandro Soriano             ║
   ║ Perfil: https://github.com/Alejosor  ║
   ╚══════════════════════════════════════╝
*/

public class operadores6Comparacion {
    public static void main(String[] args) {
        /*
        OPERADORES DE COMPARACIÓN
        - Igual que '==': Sirve para comprobar que una expresión o varias variables son iguales.
        - Distinto que '!=': Sirve para comprobar que una expresión o varias variables son distintos.
        - Menor que '<': Sirve para comprobar que una expresión o varias variables son menores que otras.
        - Mayor que '>': Sirve para comprobar que una expresión o varias variables son mayores que otras.
        - Menor o igual que '<=': Sirve para comprobar que una expresión o varias variables son
            menores o iguales a otras
        - Mayor o igual que '>=': Sirve para comprobar que una expresión o varias variables son
            mayores o iguales a otras
         */

        //Declaración de variables
        int num1 = 5;
        int num2 = 5;

        boolean resultado = false;
        // Operador de igualdad o igual que ==
        System.out.println(num1 == num2); // Resultado true, porque hay igualdad

        //Operador de desigualdad o distinto de !=
        System.out.println(num1 != num2); // Resultado false, porque no hay igualdad

        //Operador de menor que <
        System.out.println(num1 < num2); // Resultado false, porque no es menor

        //Operador de mayor que >
        System.out.println(num1 > num2); // Resultado false, porque no es mayor

        //Operador de menor o igual que <=
        System.out.println(num1 <= num2); // Resultado true, porque hay igualdad

        //Operador de mayor o igual que >=
        System.out.println(num1 >= num2); // Resultado true, porque hay igualdad
    }
}
