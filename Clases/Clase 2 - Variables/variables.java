/* ╔══════════════════════════════════════╗
   ║ Autor: Alejandro Soriano             ║
   ║ Perfil: https://github.com/Alejosor  ║
   ╚══════════════════════════════════════╝
*/

//CLASE #2 - Variables
/*
¿Qué es un variable?
Son las entidades, contienen valores o datos. Nos sirve para almacenar valores.

En Java una variable esta divido en 2 partes:
 - Tipo de dato - nombre de la variable -
 Ejemplo: int estoEsUnEjemplo = 10;

 Si en Java es necesario especificar el tipo de dato al momento de inicializar una variable, de momento te explicaré de
 manera rápida un par de tipo de datos primitivos para lograr las explicaciones que daremos en la clase:

  int -> Enteros
  double -> Decimales
  boolean -> Booleanos

 Cada tipo de dato debe ser colocado antes del nombre la variable que vamos a utilizar
 */
public class variables {
    public static void main(String[] args) {
        // En Java es permitido definir la variable y luego colocarles un valor.
        int enteros;
        double decimales;
        boolean booleanos;

        booleanos = true;
        decimales = 4.45;
        enteros = 50;

        // Como también se puede definir al momento que declaramos la variable
        int edad = 23;
        double cuota = 2.75;
        boolean admitido = true;

        /* Esto es permitido de igual manera es preferible acostumbrarnos a definir el tipo de dato al momento de
         declarar nuestras variables */
        var alumno = false;

        //Ahora daremos uno que otro ejemplo para el uso de variables
        /*
        Ejemplo 1
        Sumaremos todos los precios de unos productos que hemos comprado en una tienda, estos precios estarán en
        sus respectivas variables para posteriormente sumarlas y darnos el precio final de nuestra compra
        */
        double precioPan = 1.5;
        int precioSoda = 3;
        double precioEmpanada = 2.5;
        double precioTotal = precioPan + precioSoda + precioEmpanada;

        System.out.println("El precio total de nuestra comprar es $" + precioTotal);

        /*
        Ejemplo 2
        Sumaremos todos los alumnos de diferentes salones de una sola promoción, con el fin de conocer cuántos alumnos
        son en total.
        */
        int salonA = 23;
        int salonB = 33;
        int salonC = 26;
        int salonD = 28;

        int totalAlumnos = salonA + salonB + salonC + salonD;

        System.out.println("El total de alumnos de esta promoción es " + totalAlumnos);


        /*
        REGLAS PARA VARIABLES:
        1) Se puede definir una variable y después asignarle un valor.
        2) No podemos usar palabras reservadas o palabras clave del lenguaje.
        3) El nombre de una variable no puede empezar con un número, ni MAYÚSCULAS, ni signos (los unicos admitidos
           $ _ -).
        4) Usar siempre el camelCase para definir nombres de variables.
        5) Evitar acentos y ñ. (Evitar el uso de caracteres especiales)
         */
    }
}
