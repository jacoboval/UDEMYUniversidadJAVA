import java.util.Scanner;

public class tiendaLibros {
    public static void main(String[] args) {
        Scanner  teclado = new Scanner(System.in);
        System.out.println("ingrese el nombre del libro: ");
        String nombre = teclado.nextLine();

        System.out.println("ID: ");
        int id = Integer.parseInt(teclado.nextLine());

        System.out.println("Precio: ");
        double precio = Double.parseDouble(teclado.nextLine());

        System.out.println("Envío gratuito?: ");
        boolean envíoGratuito = Boolean.parseBoolean(teclado.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("precio: $ " + precio);
        System.out.println("Envío Gratuito:  " + envíoGratuito);

    }
}
