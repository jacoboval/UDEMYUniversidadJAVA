import java.util.Scanner;

public class entradaTeclado {
    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita: ");
        String pelicula  = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamiento =  teclado.nextInt();
        System.out.println("Que nota le das a la pelicula");
        double nota = teclado.nextInt();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
