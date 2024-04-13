public class oparadoresIgualdad {
    public static void main(String[] args) {
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena = "hola";
        var cadena2 = "adios";
        var e = cadena == cadena2;
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2);
        System.out.println("f = " + f);

        var g = a > b;
        System.out.println("g = " + g);

        if (a % 2 == 0)
            System.out.println("par");
        else
            System.out.println("impar");

        var edad = 17;
        var adulto= 18;
        if (edad >= adulto){
            System.out.println("Es adulto");
        }else{
            System.out.println("Es menor");
        }
    }
}
