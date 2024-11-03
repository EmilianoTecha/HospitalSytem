package Clases;
import java.util.Scanner;

public class Paciente{
    private int idPaciente;
    private String nombre;
    private String fecha;
    private String horaEntrada;
    private String horaSalida;
    private String padecimiento;
    Scanner seleccion = new Scanner(System.in);

    public Paciente(){
        System.out.print("IdPaciente: ");
        idPaciente = seleccion.nextInt();
        seleccion.nextLine(); // consume newline
        System.out.print("Nombre: ");
        nombre = seleccion.nextLine();
        System.out.print("Fecha: ");
        fecha = seleccion.nextLine();
        System.out.print("Hora de entrada: ");
        horaEntrada = seleccion.nextLine();
        System.out.print("Hora de salida: ");
        horaSalida = seleccion.nextLine();
        System.out.print("Padecimiento: ");
        padecimiento = seleccion.nextLine();
    }

    public Paciente(int idPaciente){
        this.idPaciente = idPaciente;
        System.out.print("Nuevo Nombre: ");
        nombre = seleccion.nextLine();
        System.out.print("Nueva Fecha: ");
        fecha = seleccion.nextLine();
        System.out.print("Nueva Hora de entrada: ");
        horaEntrada = seleccion.nextLine();
        System.out.print("Nueva Hora de salida: ");
        horaSalida = seleccion.nextLine();
        System.out.print("Nuevo Padecimiento: ");
        padecimiento = seleccion.nextLine();
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }
}