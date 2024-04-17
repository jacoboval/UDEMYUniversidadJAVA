package clases;

import java.util.Scanner;

public class pruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        persona1.nombre = teclado.nextLine();

        System.out.println("Ingrese el Apellido: ");
        persona1.apellido = teclado.nextLine();

//        persona1.nombre = "jacobo";
//        persona1.apellido = "Valencia";
        persona1.desplegarInforamcion();
    }
}
