public class OperadoresCondicionales {
    public static void main(String[] args) {
        var a = 1;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >= 0 && a <= 10;
        if (resultado){
            System.out.println("Dentro rango");
        }else{
            System.out.println("fuera de rango");
        }

        var vacciones = true;
        var diaDescanso = false;

        if (vacciones || diaDescanso){
            System.out.println("padre puede asistir");
        }else{
            System.out.println("ocupado");
        }



    }
}
