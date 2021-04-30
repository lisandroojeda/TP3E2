package persistencia;

import modelo.Empleado;
import modelo.EmpleadosEnArchivo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class PersistirEmpleadosEnArchivo implements EmpleadosEnArchivo {

    private final File archivo;

    public PersistirEmpleadosEnArchivo(String file) {
        file = "./media/lisandro/F802F89602F85AD8/"+file;
        System.out.println(file);
        this.archivo = new File(file);
    }

    public void escribirEnArchivo(String textoEnRenglon) {
        try {
            Files.write(Paths.get("/media/lisandro/F802F89602F85AD8/archivo1.txt"), textoEnRenglon.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException("Fallo la persistencia", e);
        }
    }

    @Override
    public List<Empleado> listadoDeEmpleados() {

        Path filePath = Paths.get("/media/lisandro/F802F89602F85AD8/archivo1.txt");

        List<String> lines = null;
        try {
            lines = Files.readAllLines(filePath);
            return lines.stream().map(line -> line.split(", "))
                    .map(str -> new Empleado(str[0], str[1], str[2], str[3]))
                    .collect(Collectors.toList());

        } catch (Exception e) {
            throw new RuntimeException("No hay datos almacenados", e);
        }
    }


}
