import java.util.Scanner;

class sentenciasControl {
    public static void main(String[] args) {
        var condicion = true;

        if(condicion) {
            System.out.println("verdeadera");
        }else {
            System.out.println("falsa");
        }
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 5");

        var numero = teclado.nextInt();
        var numTexto = "Numero desconocido";

        if (numero == 1){
            numTexto = "Numero uno";
            System.out.println("numTexto = " + numTexto);
        } else if (numero == 2){
            numTexto = "Numero dos";
            System.out.println("numTexto = " + numTexto);
        } else if (numero == 3){
            numTexto = "Numero tres";
            System.out.println("numTexto = " + numTexto);
        } else if (numero == 4) {
            numTexto = "Numero cuatro";
            System.out.println("numTexto = " + numTexto);
        } else if (numero == 5) {
            System.out.println("Numero cinco");
            System.out.println("numTexto = " + numTexto);
        } else if (numero > 5) {
            System.out.println("favor de ingresar un valor menor a 5");
        }
        //System.out.println("numTexto = " + numTexto);

    }

}

