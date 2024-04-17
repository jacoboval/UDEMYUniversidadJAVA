import java.util.Scanner;

public class breakAndContonue {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un valor a repetir");
        int valor = teclado.nextInt();

        for (var i =0; i <= valor; i++){
            if (i % 2 ==0){
                System.out.println("i = " + i);
                //break;
            }
        }

        for (var i =0; i <= valor; i++){
            if (i % 2 !=0){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
