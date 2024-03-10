public class Contrarrelojista extends Ciclista {
    private double velocidadMaxima;

    protected Contrarrelojista(int identificador, String nombre,int tiempoAcumulado, double velocidadMaxima) {
        super(identificador, nombre, tiempoAcumulado);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    protected String imprimirTipo() {
        return "Es un Contrarrelojista";
    }
}