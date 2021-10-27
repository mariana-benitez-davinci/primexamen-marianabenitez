package problemas.primero;

public class TetraedoRegular extends FiguraTridimencional {
    //ATRIBUTOS
    double arista;
    final int CARAS = 4;

    //CONSTRUCTORES

    public TetraedoRegular(double arista) {
        this.arista = arista;
    }

    public void asignarValor(double arista){
        this.arista = 1;
    }

    //SOBREESCRITURA DE METODOS HEREDADOS

    @Override
    public double calcularVolumen() {
    return (Math.sqrt(2) * Math.pow(arista, 3)/12);

    }

    @Override
    public double calcularSuperficie(){
    return (Math.sqrt(3)*Math.pow(arista, 2));
    }
}
