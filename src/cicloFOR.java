import java.util.Scanner;

public class cicloFOR {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un valor a repetir");
        int valor = teclado.nextInt();

        for (var i =0; i <= valor; i++){
          //  System.out.println("*");
            System.out.println("valor = " + i);

        }

        for (int j= 1; j <= valor; j++){
            for (int k =1; k<=j; k++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
