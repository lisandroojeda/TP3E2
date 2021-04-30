package Main;

import modelo.EmpleadosEnArchivo;
import modelo.EnvioCorreos;
import modelo.envioMensajesEmpleados;
import persistencia.PersistirEmpleadosEnArchivo;
import tools.gestorCorreo.EmailService.Email;
import tools.gestorCorreo.GestorCorreo;

import java.time.LocalDateTime;

public class main {
    public static void main(String[] args) {
        PersistirEmpleadosEnArchivo pp = new PersistirEmpleadosEnArchivo("Empleados.txt");
        //new envioMensajesEmpleados(new PersistirEmpleadosEnArchivo("Empleados.txt"),new GestorCorreo()).mandarFelizCumpleaños(LocalDateTime.now());

    }
}
