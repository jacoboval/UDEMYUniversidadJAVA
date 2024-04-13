public class oparadores {
    public static void main(String[] args) {
        int a= 10,b= 15;
        var resultado = a+b;
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado rest = " + resultado);

        resultado = a * b;
        System.out.println("resultado  multiplicación= " + resultado);

        var resultado2 = 3D /b;
        System.out.println("resultado division = " + resultado2);

        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);

        if (a % 2 == 0)
            System.out.println("Es numero par.");
        else
            System.out.println("Es num impar");



    }
}
