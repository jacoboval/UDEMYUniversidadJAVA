public class operadorTernario {
    public static void main(String[] args) {
        var resultado = (3 > 1) ? "Verdadero" : "Falso"  ;
        System.out.println("resultado = " + resultado);

        var numero = 9;
        resultado =(numero % 2 == 0)? ">Numero Par" :  "Numero Impar";
        System.out.println(resultado);

    }
}
