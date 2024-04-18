package Caja;


public class pruebaCaja {
    public static void main(String[] args) {
        int mediddaAncho = 3;
        int medidaAlto = 2;
        int medidaProfundo = 6;


        Caja caja1 = new Caja();
        caja1.alto = medidaAlto;
        caja1.ancho = mediddaAncho;
        caja1.profundo = medidaProfundo;

        int resultado = caja1.calcularVolumen();
        System.out.println("Volumen caja = " + resultado);


        Caja caja2 = new Caja(2,4,6);
        System.out.println("Volumen caja 2 = " + caja2.calcularVolumen());
    }
}
