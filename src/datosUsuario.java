import java.sql.SQLOutput;
import java.util.Scanner;

public class datosUsuario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        var nombre = teclado.nextLine();

        System.out.println("Cual es tu edad: ");
        var edad = teclado.nextLine();

        System.out.println("Cual es tu signo: ");
        var signo = teclado.nextLine();

        System.out.println("valor 1: ");
        var valore1 = teclado.nextInt();

        System.out.println("valor 2: ");
        var valor2 = teclado.nextInt();

        System.out.println(valor2 + valore1);



    }
}
