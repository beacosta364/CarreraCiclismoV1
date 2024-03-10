import java.util.Scanner;
public class PruebaCiclismo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo = scanner.nextLine();
        System.out.println("Ingrese el pais al que pertenece el equipo:");
        String paisEquipo = scanner.nextLine();

        Equipo equipo = new Equipo(nombreEquipo, paisEquipo);

        int opcion;
        do {
            System.out.println("\nQue opcin desea seleccionar:");
            System.out.println("1. Agregar ciclista");
            System.out.println("2. Imprimir datos del equipo");
            System.out.println("3. Listar ciclistas del equipo");
            System.out.println("4. Imprimir datos de un ciclista por identificador");
            System.out.println("5. Mostrar Tiempo Total del Equipo");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarCiclistaDesdeConsola(scanner, equipo);
                    break;
                case 2:
                    equipo.imprimirDatosEquipo();
                    break;
                case 3:
                    equipo.listarNombresCiclistas();
                    break;
                case 4:
                    System.out.println("Ingrese el identificador del ciclista:");
                    int identificadorCiclista = scanner.nextInt();
                    scanner.nextLine(); 
                    equipo.imprimirDatosCiclista(identificadorCiclista);
                    break;
                case 5:
                    equipo.calcularTiempoTotal();
                    break;
                case 0:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static void agregarCiclistaDesdeConsola(Scanner scanner, Equipo equipo) {
        System.out.println("Ingrese el nombre del ciclista: ");
        String nombreCiclista = scanner.nextLine();
        System.out.println("Ingrese el identificador del ciclista: ");
        int identificadorCiclista = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Seleccione el tipo de ciclista:");
        System.out.println("1. Velocista");
        System.out.println("2. Escalador");
        System.out.println("3. Contrarrelojista");
    
        int tipoCiclista = scanner.nextInt();
        scanner.nextLine(); 
    
        switch (tipoCiclista) {
            case 1:
                System.out.println("Ingrese la potencia promedio del velocista:");
                double potenciaPromedio = scanner.nextDouble();
                System.out.println("Ingrese la velocidad promedio en sprint del velocista:");
                double velocidadPromedio = scanner.nextDouble();
                Velocista velocista = new Velocista(identificadorCiclista, nombreCiclista, tipoCiclista, potenciaPromedio, velocidadPromedio);
                equipo.agregarCiclista(velocista);
                break;
            case 2:
                System.out.println("Ingrese la aceleración promedio en subida del escalador:");
                float aceleracionPromedioSubida = scanner.nextFloat();
                System.out.println("Ingrese el grado de rampa soportada del escalador:");
                float gradoRampaSoportada = scanner.nextFloat();
                Escalador escalador = new Escalador(identificadorCiclista, nombreCiclista, tipoCiclista, aceleracionPromedioSubida, gradoRampaSoportada);
                equipo.agregarCiclista(escalador);
                break;
            case 3:
                System.out.println("Ingrese la velocidad máxima del contrarrelojista:");
                double velocidadMaxima = scanner.nextDouble();
                Contrarrelojista contrarrelojista = new Contrarrelojista(identificadorCiclista, nombreCiclista, tipoCiclista, velocidadMaxima);
                equipo.agregarCiclista(contrarrelojista);
                break;
            default:
                System.out.println("Tipo de ciclista no válido.");
        }
    }
}
