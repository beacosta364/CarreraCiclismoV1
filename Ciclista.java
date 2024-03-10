public abstract class Ciclista {
    private int identificador; //identificador unico para cada ciclista
    private String nombre; //nombre del ciclista
    private int tiempoAcumulado; //tiempo acumulado por ciclista 

    public Ciclista(int identificador, String nombre, int tiempoAcumulado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = tiempoAcumulado;
    }


    //constructor de la clase ciclista
   
    
    protected int getIdentificador() {
        return identificador;
    }

    protected String getNombre() {
        return nombre;
    }

    protected int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    protected void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }
    
    //metodo abstracto para imprimir el tipo de ciclista en cada clase que corresponda
    protected abstract String imprimirTipo();
}
