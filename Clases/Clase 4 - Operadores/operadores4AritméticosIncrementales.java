/* ╔══════════════════════════════════════╗
   ║ Autor: Alejandro Soriano             ║
   ║ Perfil: https://github.com/Alejosor  ║
   ╚══════════════════════════════════════╝
*/

public class operadores4AritméticosIncrementales {
    public static void main(String[] args) {
        //Operadores Aritméticos incrementales (Unarios)
        /*
            Los operadores aritméticos incrementales son aquellos que "manipula" datos numéricos encargados
            de incrementar o decrementar un valor
            Cabe destacar que estos operadores se pueden utilizar de 2 formas, delante del operando o detrás del
            operando (variable o dato)

            ++ Incremento: Sirve para incrementar de uno en uno números o variables.
            -- Decremento: Sirve para reducir de uno en uno números o variables

            ¡++ Incremento: Primero se utiliza la variable y luego se incrementa el valor.
            ++¡ Incremento: Primero se incrementa el valor y luego se utiliza la variable.
         */

        //Declaración de variables
        int num1 = 1;
        int num2 = 2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //i++
        num2 = num1++; //Primero se asigna el valor a la variable y después incrementa su valor en uno.
        System.out.println("El valor de num2 = " + num2);
        System.out.println("El valor de num1 = "+ num1); // Incrementó el valor de la variable num1

        //++i
        num2 = ++num1; //Primero incrementa su valor en uno y después se asigna el valor a la variable.
        System.out.println("El valor de num2 = " + num2); // Incrementó el valor de la variable num2
        System.out.println("El valor de num1 = "+ num1); // Al igual que incrementó el valor de la variable num1
    }
}
