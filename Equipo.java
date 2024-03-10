import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String paisEquipo;
    private int tiempoTotal;
    private static int tiempoTotalEquipo;
    private ArrayList<Ciclista> ciclistas;
    
    
    protected Equipo(String nombreEquipo, String paisEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.paisEquipo = paisEquipo;
        this.tiempoTotalEquipo = 0;
        this.ciclistas = new ArrayList<>();
    }

    private  String getNombreEquipo() {
        return nombreEquipo;
    }

    private void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    private String getPaisEquipo() {
        return paisEquipo;
    }

    private void setPaisEquipo(String paisEquipo) {
        this.paisEquipo = paisEquipo;
    }

    private static int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    private ArrayList<Ciclista> getCiclistas() {
        return ciclistas;
    }

    protected void agregarCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
        tiempoTotalEquipo += ciclista.getTiempoAcumulado();
    }

    protected void imprimirDatosEquipo() {
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("País del equipo: " + paisEquipo);
        System.out.println("Tiempo total del equipo: " + tiempoTotalEquipo + " minutos");
    }
    protected void calcularTiempoTotal(){
        this.tiempoTotalEquipo = tiempoTotalEquipo;
    }
    protected void listarNombresCiclistas() {
        System.out.println("Nombres de los ciclistas en el equipo:");
        for (Ciclista ciclista : ciclistas) {
            System.out.println(ciclista.getNombre() + " - " + ciclista.imprimirTipo());
        }
    }

    protected void imprimirDatosCiclista(int identificador) {
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getIdentificador() == identificador) {
                System.out.println("Datos del ciclista:");
                System.out.println("Nombre: " + ciclista.getNombre());
                System.out.println("Identificador: " + ciclista.getIdentificador());
                System.out.println("Tiempo acumulado: " + ciclista.getTiempoAcumulado() + " minutos");
                System.out.println(ciclista.imprimirTipo());
                return;
            }
        }
        System.out.println("Ciclista no encontrado con el identificador suministrado: " + identificador);
    }
}
