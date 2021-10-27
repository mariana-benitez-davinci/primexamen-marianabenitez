package problemas.primero;

public class Cubo extends FiguraTridimencional{
    //Atributos
    double lado;
    int arista;
    final int CARAS = 6;

    //Constructores

    public Cubo(double lado){
    this.lado = lado;
    }

    //Sobreescritura de los metodos heredados
    @Override
    public double calcularVolumen() {
        return (Math.pow(lado, 3));
    }

    @Override
    public double calcularSuperficie(){
        return 6 * (Math.sqrt(arista));
    }

}
