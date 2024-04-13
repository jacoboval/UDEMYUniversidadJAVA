public class tiposPrmitivos {
    public static void main(String[] args) {
        byte numByte =(byte)10;
        System.out.println("valor byte: " + numByte);
        System.out.println("valor min byte: " + Byte.MIN_VALUE);
        System.out.println("valor min byte: " + Byte.MAX_VALUE);

        byte numShort = 10;
        System.out.println("NUmero shirt: " +  numShort);
        System.out.println("Valor minimo: " + Short.MIN_VALUE);
        System.out.println("Valor maximo:" + Short.MAX_VALUE);

        int numShortInt = 10;
        System.out.println("NUmero Int: " +  numShortInt);
        System.out.println("Valor minimo: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo:" + Integer.MAX_VALUE);

        long numlong = 10;
        System.out.println("NUmero long: " +  numlong);
        System.out.println("Valor minimo: " + Long.MIN_VALUE);
        System.out.println("Valor maximo:" + Long.MAX_VALUE);

        //tipos float

        float numFloat = (float)10.0;
        //float numFloat = 10.0F;
        System.out.println("Numero float" + numFloat);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor minimo tipo float: " + Float.MAX_VALUE);

        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);

    }
}
