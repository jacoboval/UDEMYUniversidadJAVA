import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        int datoDePI = 3;
        float datoCircunferencia = 15F;
        int datoRadio = 5;
        int datoDiametro = 6;
        int datoArea = 6;
        int datolongitud = 3;

        formulas form1 = new formulas();
        form1.area = datoArea;
        form1.diametro = datoDiametro;
        form1.longitud = datolongitud;
        form1.radio = datoRadio;
        form1.circunferencia = datoCircunferencia;

        System.out.println("Formulas para calculas");
        System.out.println("\n1 - Area");
        System.out.println("\n2 - Radio");
        System.out.println("\n3 - Circunferencia");
        System.out.println("\n4 - Diametro");
        System.out.println("\n5 - Longitud");

        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();

        switch (opcion){
            case 1:
                int resultado = form1.calcularArea();
                System.out.println("El área es = " + resultado);
                //System.out.println("\n*******");
                //formulas form2 = new formulas(3,5,6,5,4,5);
                //System.out.println("El área es = " + form2.calcularArea());
                break;
            case 2:
                float resultadoRadio = form1.calcularRadio();
                System.out.println("El radio es = " + resultadoRadio);
                break;
        }

    }
}
