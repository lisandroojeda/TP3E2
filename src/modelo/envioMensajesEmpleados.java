package modelo;

import java.time.LocalDateTime;

public class envioMensajesEmpleados {


    private final EmpleadosEnArchivo empleadosEnArchivo;
    private final EnvioCorreos envioCorreos;

    public envioMensajesEmpleados(EmpleadosEnArchivo empleadosEnArchivoP, EnvioCorreos envioCorreos){
        this.empleadosEnArchivo = empleadosEnArchivoP;
        this.envioCorreos = envioCorreos;
    }

    public void mandarFelizCumpleaños(LocalDateTime fecha){

        for (Empleado e: empleadosEnArchivo.listadoDeEmpleados()){
            if (e.esMicumpleaños(fecha)){
                this.envioCorreos.enviar(e.getEmail(),"","");
            }
        }
    }

}
