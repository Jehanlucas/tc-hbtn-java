public class Quadrado {


    private static double area = 0 ;
    public static double area(double lado){{
        
            if (lado > 0){area = lado *lado ;}

            else{

                throw new IllegalArgumentException("Lado deve possuir valor positivo");
            }

}
        return area;
    }}