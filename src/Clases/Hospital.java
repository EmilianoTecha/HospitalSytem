package Clases;
import java.util.ArrayList;

public class Hospital {
    private ArrayList<Paciente> pacientes;
    public Hospital() {
        pacientes = new ArrayList<>();
    }

    public void registrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void modificarPaciente(int idPaciente, Paciente nuevoPaciente) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getIdPaciente() == idPaciente) {
                pacientes.set(i, nuevoPaciente);
            }
        }
    }

    public String buscarPaciente(int idPaciente) {
        for (Paciente paciente : pacientes) {
            if (paciente.getIdPaciente() == idPaciente) {
                return "ID: " + paciente.getIdPaciente() + ", Nombre: " + paciente.getNombre() + ", Fecha: " + paciente.getFecha() + ", Padecimiento: " + paciente.getPadecimiento() ;
            }
        }return "Paciente no encontrado";
    }

    public void eliminarPaciente(int idPaciente) {
        pacientes.removeIf(paciente -> paciente.getIdPaciente() == idPaciente);
    }

    public int cantidadPacientes() {
        return pacientes.size();
    }
}