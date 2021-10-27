package problemas.primero;

public class Ortoedro extends FiguraTridimencional {
    //ATRIBUTOS

    double ancho;
    double base;
    double altura;
    final int CARAS = 6;


    //CONSTRUCTORES

    public Ortoedro (double ancho, double base, double altura){
        this.ancho = ancho;
        this.base = base;
        this.altura = altura;
    }

    //SOBRE ESCRITURA DE METODOS HEREDADOS
    @Override
    public double calcularVolumen(){
    return (ancho * base * altura);
    }

    @Override
    public double calcularSuperficie(){
    return (2 * (ancho * base) + 2 * (ancho * base) + 2 * (ancho * base));
    }
}
