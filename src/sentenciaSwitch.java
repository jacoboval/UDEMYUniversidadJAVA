import java.util.Scanner;

public class sentenciaSwitch {
    public static void main(String[] args) {
        //var numero = 5;
        Scanner teclado = new Scanner(System.in);
        //System.out.println("ingrese un valor entre 1 y 5");
//        int valor = teclado.nextInt();
//        var numeroTexto = "Valor descomnocido";
//
//        switch (valor){
//            case 1:
//                numeroTexto = "Numero uno";
//                break;
//            case 2:
//                numeroTexto = "Numero dos";
//                break;
//            case 3:
//                numeroTexto = "Numero tres";
//                break;
//            case 4:
//                numeroTexto = "Numero cuatro";
//                break;
//            default:
//                numeroTexto = "Numero desconocido";
//        }
//        System.out.println("numeroTexto = " + numeroTexto);
        //var mes =10;
        System.out.println("ingrese un valor mes: ");
        int mes = teclado.nextInt();
        var estacion = "Estacion desconicida";

        switch (mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion ="Promavera";
                break;
            case 6: case 7: case 8:
                estacion = "verano";
            case 9: case 10: case 11:
                estacion = "otoño";
            default:
        }
        System.out.println("estacion = " + estacion);


    }
}
