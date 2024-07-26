public class alejosor {
    public static void main(String[] args) {
        //Ejercicio #1
        System.out.println("Ejercicio #1");
        double numDecimal = 123.456;
        int numInteger = (int) numDecimal; // Conversión de estrechamiento

        // Operaciones Aritméticas
        int suma = numInteger + 10;
        int resta = numInteger - 50;
        double multi = numInteger * 2;
        double divi = numInteger/ 3;

        // Conversión a cadenas
        String mensaje= "\nValor Original: " + numDecimal + "\n" +
                "Número Entero: " + numInteger + "\n" +
                "Suma: " + suma + "\n" +
                "Resta: " + resta + "\n" +
                "Multiplicación: " + multi + "\n" +
                "División: " + divi;

        System.out.println("El mensaje es... " + mensaje);

        System.out.println("\n---------------------\n");

        //Ejercicio #2
        System.out.println("Ejercicio #2");
        String strNum1 = "500";
        String strNum2 = "128.78";

        //Conversión de String a Primitivos
        int num1 = Integer.parseInt(strNum1);
        double num2 = Double.parseDouble(strNum2);

        //Comparaciones
        boolean comp1 = num1 == 20;
        boolean comp2 = num1 == 500;
        boolean comp3 = num2 > 20;
        boolean comp4 = num2 < 20;
        boolean comp5 = num1 > num2;

        //Resultados
        System.out.println("La variable num1 es igual a 20: " + comp1);
        System.out.println("La variable num1 es igual a 500: " + comp2);
        System.out.println("La variable num2 es mayor a 20: " + comp3);
        System.out.println("La variable num1 es menor a 20: " + comp4);
        System.out.println("La variable num1 es mayor a la variable num2: " + comp5);
    }
}
