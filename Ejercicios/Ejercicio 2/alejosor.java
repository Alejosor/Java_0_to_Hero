public class alejosor {
    public static void main(String[] args) {
        //  - Declara tres variables de diferentes tipos, asígnales valores y luego imprímelas.
        int edad = 23;
        double precioSoda = 3.5;
        boolean soltero = false;

        System.out.println("Mi edad  es " + edad);
        System.out.println("El precio de la soda es $" + precioSoda);
        System.out.println("Mi estado civil es soltero? " + soltero);

        // - Crea un programa que declare dos variables enteras, asigne valores a estas variables y luego imprima la suma de esos valores.
        int championsRealMadrid = 14;
        int championsBarca = 5;

        int championsTotales = championsRealMadrid + championsBarca;
        System.out.println("Las champions totales entre los dos equipos son " + championsTotales);

        /* 
         - Crea un programa que declare variables para almacenar los costos de diferentes compras 
         realizadas en un día, sume estos costos y luego imprima el total.
        */
        int precioLeche;
        double precioPan;
        double precioQueso;
        int precioHuevos;

        double totalCompras;

        precioLeche = 5;
        precioPan = 2.5;
        precioQueso = 4.3;
        precioHuevos = 2;

        totalCompras = precioLeche + precioPan + precioQueso + precioHuevos;

        System.out.println("El total gastado en las compras es de $" + totalCompras);
    }
}
