public class booleanos {
    public static void main(String[] args) {
        boolean varBooleanos = true;
        System.out.println("varBooleanos = " + varBooleanos);

        if (varBooleanos) {
            System.out.println("verdadero");
        }
        else{
            System.out.println("falso");
        }
        
        var edad = 45;
        //var esAdulto = edad >= 18;
        //System.out.println("esAdulto = " + esAdulto);
        if(edad >= 18){
            System.out.println("mayor de edad");
        }else{
            System.out.println("menor");
        }
        }
    }

