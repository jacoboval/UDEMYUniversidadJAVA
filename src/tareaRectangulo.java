import java.util.Scanner;

public class tareaRectangulo {
    public static void main(String[] args) {
        //int alto = 0;
        //int ancho = 0;

        Scanner  teclado = new Scanner(System.in);

        System.out.println("Proporciona el alto: ");
        int alto = teclado.nextInt();

        System.out.println("proporciona el ancho:");
        int ancho = teclado.nextInt();

        var area = alto * ancho;
        var perimetro = (alto + ancho ) * 2;

        System.out.println("Área:  = " + area);
        System.out.println("Perimetro = " + perimetro);
    }
}
