public class Escalador extends Ciclista {
    private float aceleracionPromedio;
    private float gradoRampaSoportada;

    protected Escalador(int identificador, String nombre, int tiempoAcumulado, float aceleracionPromedio, float gradoRampaSoportada) {
        super(identificador, nombre, tiempoAcumulado);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    

    @Override
    protected String imprimirTipo() {
        return "Es un Escalador";
    }
}