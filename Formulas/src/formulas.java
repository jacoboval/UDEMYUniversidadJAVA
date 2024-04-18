public class formulas {
    float radio;
    float circunferencia;
    float diametro;
    float area;
    float longitud;
    float pi = 3.1416F;

    public formulas(){

    }
    public formulas(float radio, float circunferencia, float diametro, float area, float longitud, float pi){
        this.radio = radio;
        this.circunferencia = circunferencia;
        this.diametro = diametro;
        this.area = area;
        this.longitud = longitud;
        this.pi = pi;

    }


    public int calcularArea(){
        return (int) (pi * (radio * 2));
    }

    public float calcularRadio(){
        return circunferencia / (2 * pi);
    }
}
