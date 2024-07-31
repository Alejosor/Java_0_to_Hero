
public class julianb0315 {
    public static void main(String[] args) {
        //Ejercicio 1: Conversión y Operaciones Aritméticas
        double numeroDouble = 987.654;
        int numeroInt = (int) numeroDouble;
        int suma = numeroInt + 20;
        int resta = numeroInt - 15;
        int multiplicacion = numeroInt * 3;
        int division = numeroInt / 4;
        System.out.println("Número original:" + numeroDouble);
        System.out.println("Número convertido a int::" + numeroInt);
        System.out.println("Suma:" + suma);
        System.out.println("Resta:" + resta);
        System.out.println("Multiplicación:" + multiplicacion);
        System.out.println("División:" + division);
        //Ejercicio 2: Conversión y Comparación de Cadenas y Números
        String n1 = "250";
        String n2 = "67.89";
        int n1_int = Integer.parseInt(n1);
        double n2_double = Double.parseDouble(n2);
        boolean esIgualInt = n1_int == 250;
        boolean esMayorDouble = n2_double > 60.0;
        System.out.println("La cadena " + n1_int + " convertida a int es igual a 250: " + esIgualInt);
        System.out.println("La cadena " + n2_double + " convertida a double es mayor que 60.0: " + esMayorDouble);
    }
}
