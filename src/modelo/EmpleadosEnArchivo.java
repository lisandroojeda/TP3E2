package modelo;

import java.util.List;

public interface EmpleadosEnArchivo {
    public void escribirEnArchivo(String textoEnRenglon);
    public List<Empleado> listadoDeEmpleados();
}
