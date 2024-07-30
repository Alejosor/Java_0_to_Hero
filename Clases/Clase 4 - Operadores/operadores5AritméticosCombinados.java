/* ╔══════════════════════════════════════╗
   ║ Autor: Alejandro Soriano             ║
   ║ Perfil: https://github.com/Alejosor  ║
   ╚══════════════════════════════════════╝
*/

public class operadores5AritméticosCombinados {
    public static void main(String[] args) {
        /*
        OPERADORES ARITMÉTICOS COMBINADOS
        - Suma Combinada '+=': Sirve para sumar números o variables (numéricas) y asignar el resultado.
        - Resta Combinada '-=': Sirve para resta números o variables (numéricas) y asignar el resultado.
        - Multiplicación Combinada '*=': Sirve para multiplicar números o variables (numéricas)
            y asignar el resultado.
        - División Combinada '/=': Sirve para dividir números o variables (numéricas) y asignar el resultado.
        - Módulo Combinado '%=': Sirve para obtener el resto números o variables (numéricas) y asignar el resultado.
         */

        //Declaración de variables

        int num1 = 10;
        int num2 = 5;


        // SUMA
        //Forma normal
        num1 = num1 + num2;
        System.out.println(num1);
        //Forma combinada
        num1 = 10; //Reasignamos el valor al num1

        num1 += num2;
        System.out.println(num1);

        // RESTA
        //Forma normal
        num1 = 10; //Reasignamos el valor al num1
        num1 = num1 - num2;
        System.out.println(num1);
        //Forma combinada
        num1 = 10; //Reasignamos el valor al num1

        num1 -= num2;
        System.out.println(num1);

        // MULTIPLICACIÓN
        //Forma normal
        num1 = 10; //Reasignamos el valor al num1
        num1 = num1 * num2;
        System.out.println(num1);
        //Forma combinada
        num1 = 10; //Reasignamos el valor al num1

        num1 *= num2;
        System.out.println(num1);

        // DIVISIÓN
        //Forma normal
        num1 = 10; //Reasignamos el valor al num1
        num1 = num1 / num2;
        System.out.println(num1);
        //Forma combinada
        num1 = 10; //Reasignamos el valor al num1

        num1 /= num2;
        System.out.println(num1);

        // MÓDULO
        //Forma normal
        num1 = 10; //Reasignamos el valor al num1
        num1 = num1 % num2;
        System.out.println(num1);
        //Forma combinada
        num1 = 10; //Reasignamos el valor al num1

        num1 %= num2;
        System.out.println(num1);
    }
}
