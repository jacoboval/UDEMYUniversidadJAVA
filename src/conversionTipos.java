import java.util.Scanner;

public class conversionTipos {
    public static void main(String[] args) {
//        //var edad ="20";
//        var edad = Integer.parseInt("20");
//        System.out.println("edad = " + (edad + 1));
//
//        var valorPI = Double.parseDouble("3.1416");
//        System.out.println("valorPI = " + valorPI);
//
        var teclado = new Scanner(System.in);
//        System.out.println("Ingrese su edad: ");
//        edad = Integer.parseInt(teclado.nextLine() );
//        System.out.println("edad = " + edad);

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);

        System.out.println("ingrese in caracter: ");
        caracter = teclado.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);

    }
}
