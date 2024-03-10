public class PruebaCiclismo {
    public static void main(String[] args) {
        // Crear equipo
        Equipo equipo = new Equipo("La gran Colombia", "Colombia");

        // Agregar ciclistas de diferentes tipos al equipo
        Ciclista velocista = new Velocista(1, "jose", 50,300.5, 45.2);
        Ciclista escalador = new Escalador(2, "Ever", 30,9.8f, 12.5f);
        Ciclista contrarrelojista = new Contrarrelojista(3, "carlos", 20,55.3);


        // Agregar ciclistas al equipo
        equipo.agregarCiclista(velocista);
        equipo.agregarCiclista(escalador);
        equipo.agregarCiclista(contrarrelojista);

        // Imprimir datos del equipo
        equipo.imprimirDatosEquipo();

        // Listar nombres de ciclistas en el equipo
        equipo.listarNombresCiclistas();

        // Imprimir datos de un ciclista por identificador
        equipo.imprimirDatosCiclista(2);
    }
}
