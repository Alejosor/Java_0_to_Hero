/* ╔══════════════════════════════════════╗
   ║ Autor: Alejandro Soriano             ║
   ║ Perfil: https://github.com/Alejosor  ║
   ╚══════════════════════════════════════╝
*/

import java.util.Scanner;

public class entradaDeDatosScanner {

    // private static Scanner ingreso;
    // Se declara el objeto Scanner como una variable de instancia, otra manera de trabajar con Scanner

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in); // Aquí se declara de manera local o dentro del método
        // Entrada de Datos con Scanner

        //Ingreso de texto por teclado
        System.out.println("Por favor ingresa tu nombre:");
        String nombre = ingreso.nextLine();
        System.out.println("Hola y bienvenido " + nombre);

        //Ingreso de datos tipo primitivo
        System.out.println("Por favor ingresa tu edad:");
        int edad = ingreso.nextInt();
        System.out.println("Tu edad es: " + edad);

        //Ingreso de datos y Conversión de int a String
        System.out.println("Por favor ingresa tu año de nacimiento:");
        int año = ingreso.nextInt();
        String fecha = Integer.toString(año);
        System.out.println("Tu fecha de nacimiento es: " + fecha);
    }
}
