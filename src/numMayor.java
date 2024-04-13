import java.util.Scanner;

public class numMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Proporcione un numero: ");
        int valor1 = teclado.nextInt();

        System.out.println("Proporcione un segundo numero: ");
        int valor2 = teclado.nextInt();

        System.out.println("El numero mayor es: ");
        System.out.println(valor1 > valor2 ? valor1 : valor2);

        System.out.println(Math.max(5,6));

    }
}
