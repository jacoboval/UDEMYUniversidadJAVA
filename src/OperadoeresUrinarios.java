public class OperadoeresUrinarios {
    public static void main(String[] args) {
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //invremento
        // preincremento (sim antes var)
        var e = 3;
        var f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //post incremento
        var g = 5;
        var h = g++;
        System.out.println("g = " + g);  // teniamos pendiente un incremento
        System.out.println("h = " + h);

        // decremento
        //pre decremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // post decremento
        var k = 4;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
