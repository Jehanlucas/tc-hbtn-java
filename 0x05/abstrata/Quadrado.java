public class Quadrado extends Retangulo {


    private static double lado;


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {

        if (lado >= 0){
            this.lado = lado;
        }
        else {
            throw new java.lang.IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }
    }

    public static double getArea() {
        return area;
    }

    public static void setArea(double area) {
        Quadrado.area = area;
    }

    private static double area = 0 ;

    @Override
    public double area(){{

            if (lado > 0){area = lado *lado ;}

            else{

                throw new IllegalArgumentException("Lado deve possuir valor positivo");
            }

}
        return area;
    }

    @Override
    public String toString() {
        return String.format("[Quadrado] %.2f", lado);
    }
}