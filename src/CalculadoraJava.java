import java.util.Scanner;

public class CalculadoraJava {

    /*** Declara variables para dos operandos y realiza las siguientes operaciones:
     Suma.
     Resta.
     Multiplicación.
     División.
     Módulo (resto de la división).
     * Utiliza nombres de variables significativos
     * Imprime los resultados de cada operación en la consola
     * Permite al usuario ingresar valores para los operandos a través de la consola
     *
     */

    public static void main(String[] args) {
        // Scanner para crear entrada de usuario
        Scanner teclado = new Scanner(System.in);

        // Solicitamos el primer numero al usuario
        System.out.print("Elige tu primer número: ");
        int primerNumero = teclado.nextInt();

        System.out.print("Elige tu segundo número: ");
        int segundoNumero = teclado.nextInt();

        // Imprimimos ambos números
        System.out.println("¡Entendido! ʕっ•ᴥ•ʔっ");
        System.out.println("El primer número que elegiste es: " +  primerNumero + " y " + "el segundo número elegido es: " + segundoNumero);

        // Operaciones aritméticas básicas
        //int :: operatoria
        //Sout :: print de texto
        System.out.println("\n--- OpErAcIoNeS ArItMéTicAs báSiCaS ʕ•ᴥ•ʔ ---");

        int suma = primerNumero + segundoNumero;
        System.out.println("La suma de " + primerNumero + " más " + segundoNumero + " es = " + (suma));

        int resta = primerNumero - segundoNumero;
        System.out.println("La resta de " + primerNumero + " menos " + segundoNumero + " es = " + (resta));

        int multiplicacion = primerNumero * segundoNumero;
        System.out.println("La multiplicación de " + primerNumero + " y " + segundoNumero + " es = " + (multiplicacion));

        int division = primerNumero / segundoNumero;
        System.out.println("La división de " + primerNumero + " y " + segundoNumero + " es = " + (division));

        int modulo = primerNumero % segundoNumero;
        System.out.println("El módulo de " + primerNumero + " y " + segundoNumero + " es = " + (modulo));



    }
}