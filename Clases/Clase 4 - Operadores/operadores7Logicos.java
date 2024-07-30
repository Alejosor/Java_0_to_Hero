/* ╔══════════════════════════════════════╗
   ║ Autor: Alejandro Soriano             ║
   ║ Perfil: https://github.com/Alejosor  ║
   ╚══════════════════════════════════════╝
*/

public class operadores7Logicos {
    public static void main(String[] args) {
        /*
        OPERADORES LÓGICOS
        Evaluar una expresión en la que están implicados uno o dos operadores booleanos.

        - && "AND"
        Evalúa 2 operandos de tipo lógico(expresiones, variales o literales). Ejemplo:

            true && true = true
            true && false = false
            false && false = false

        - || "OR"
        Evalúa 2 operandos de tipo lógico(expresiones, variales o literales). Ejemplo:

            true || true = true
            true || false = true
            false || true = true
            false || false = false

        - ! Negación
        El operador de negociación evalúa un solo operando con valor lógico y devuelve como resultado
        el valor de este invertido. Ejemplo:

            true = true
            !true = false

        */

        // Ejemplo 1: AND lógico (&&)
        boolean a = true;
        boolean b = false;
        boolean resultadoAND = a && b;
        System.out.println("Resultado de a && b: " + resultadoAND);  // Imprime: Resultado de a && b: false

        // Ejemplo 2: OR lógico (||)
        boolean resultadoOR = a || b;
        System.out.println("Resultado de a || b: " + resultadoOR);  // Imprime: Resultado de a || b: true

        // Ejemplo 3: NOT lógico (!)
        boolean resultadoNOT = !a;
        System.out.println("Resultado de !a: " + resultadoNOT);  // Imprime: Resultado de !a: false

        // Ejemplo 4: Combinación de operadores lógicos
        boolean c = true;
        boolean resultadoCombinacion = (a && b) || c;
        System.out.println("Resultado de (a && b) || c: " + resultadoCombinacion);
        // Imprime: Resultado de (a && b) || c: true
    }
}
