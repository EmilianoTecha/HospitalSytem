import Clases.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Modificar paciente");
            System.out.println("3. Buscar paciente");
            System.out.println("4. Eliminar paciente");
            System.out.println("5. Cantidad de pacientes registrados");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Paciente nuevoPaciente = new Paciente();
                    hospital.registrarPaciente(nuevoPaciente);
                    break;
                case 2:
                    System.out.print("IdPaciente a modificar: ");
                    int idMod = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    Paciente pacienteModificado = new Paciente(idMod);
                    hospital.modificarPaciente(idMod, pacienteModificado);
                    break;
                case 3:
                    System.out.print("IdPaciente a buscar: ");
                    int idBuscar = scanner.nextInt();
                    String pacienteEncontrado = hospital.buscarPaciente(idBuscar);
                    if (pacienteEncontrado != null) {
                        System.out.println(pacienteEncontrado);
                    } else {
                        System.out.println("Paciente no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("IdPaciente a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    hospital.eliminarPaciente(idEliminar);
                    break;
                case 5:
                    System.out.println("Cantidad de pacientes registrados: " + hospital.cantidadPacientes());
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while (opcion != 6);
        scanner.close();
    }
}