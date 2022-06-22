public class Retangulo extends FormaGeometrica{

    private double largura ;
    private double altura ;


    @Override
    public double area( ){
        return largura*altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {

        if (largura > 0){
            this.largura = largura;
        }
        else {
            throw new java.lang.IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {

        if(altura >0){
        this.altura = altura;}
        else {
           throw new java.lang.IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }
    }

    public String toString() {
        return String.format("[Retangulo] %.2f / %.2f", largura, altura);
    }
}