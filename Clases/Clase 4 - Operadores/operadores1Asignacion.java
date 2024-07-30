/* ╔══════════════════════════════════════╗
   ║ Autor: Alejandro Soriano             ║
   ║ Perfil: https://github.com/Alejosor  ║
   ╚══════════════════════════════════════╝
*/

public class operadores1Asignacion {
    public static void main(String[] args){
        /*
        OPERADORES
        En esta clase tocaremos el tema relacionado con operadores en Java.
         */

        /*
         //Operador de asignación//
         Aquí trabajamos con el '=', para asignar un valor a una variable, declaraciones de datos para
         posteriormente inicializarlo
         */

        // Forma 1: Aquí se hace el proceso en una sola línea.
        int numero = 5;
        System.out.println("numero = " + numero);

        //Forma 2: Em cambio en esta forma se declara primero para posteriormente inicializarlo.
        int numero2; // <-- Declaración o instancia
        numero2 = 6; // <-- Asignación
        System.out.println("numero2 = " + numero2);

        /*
        *Recordar que el programa siempre ejecutará la última asignación de una variable. Ejemplo:
         */
        int numero3;
        numero3 = 7;
        numero3 = 8;
        numero3 = 9;
        System.out.println("numero3 = " + numero3); // El numero que imprimirá en pantalla será el número 9 y no el 7.
    }
}
