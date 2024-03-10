class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedio;

    protected Velocista(int identificador, String nombre, int tiempoAcumulado, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre, tiempoAcumulado);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    protected  double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    protected  double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    @Override
    protected String imprimirTipo() {
        return "Es un Velocista";
    }
}