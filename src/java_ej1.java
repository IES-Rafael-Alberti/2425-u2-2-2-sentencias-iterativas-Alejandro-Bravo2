import java.util.Scanner; // Importamos el módulo de scanner que es como un read en bash o un scanf en c

public class java_ej1 { // Declaramos la clase saludo, java es un lenguaje que funciona con clases.
    public static void main(String[] args) { /* Declaramos nuestra clase como pública y estatica para que este método pertenezca a la clase.4
        el string[] args es para decir al programa que vamos a pasar argumentos al programa, sin esto no funcionaría el programa.*/
        System.out.println("Dime tu nombre: "); // Le decimos al usuario que escriba su nombre aunque esta parte no va a recoger ese valor
        String nombre = new Scanner(System.in).nextLine(); // Recogemos el nombre del usuario
        System.out.println("Hola " + nombre + " Este programa está hecho en el lenguaje de programación java ");
        // Imprimimos el nombre con la frase
    }
}
// La locura que hay que hacer para hacer un simple input y print en java es brutal