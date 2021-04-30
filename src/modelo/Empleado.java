package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Empleado {
    private String apellido;
    private String nombre;
    private LocalDateTime fecha_nac;
    private String email;

    private static String fCorto= "yyy/MM/dd";

    public Empleado(String apellido, String nombre, String fecha_nac, String email){

        if (nombre == null || nombre.isEmpty())
            throw new RuntimeException("Debe cargar un nombre");
        if (apellido == null || apellido.isEmpty())
            throw new RuntimeException("Debe cargar un apellido");
        if (fecha_nac ==null || fecha_nac.isEmpty() )
            throw new RuntimeException("Debe cargar una fecha");
        if (email == null || email.isEmpty())
            throw new RuntimeException("Debe cargar un mail");

        this.apellido = apellido;
        this.nombre = nombre;
        this.fecha_nac = aDatetime(fecha_nac);
        this.email = email;

    }

    private LocalDateTime aDatetime(String fechaEnString){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(fechaEnString, formatter);
        return dateTime;
    }


    public boolean esMicumpleaños(LocalDateTime fecha){

        if(fecha_nac.getMonth()!= fecha.getMonth())
            return false;
        if(fecha_nac.getDayOfMonth()!=fecha.getDayOfMonth())
            return false;
        return true;
    }

    public String datosAString(){
        DateTimeFormatter formato =  DateTimeFormatter.ofPattern(fCorto);
        return this.apellido+","+this.nombre+","+this.fecha_nac.format(formato)+","+this.email;
    }

    public String getEmail() {
        return email;
    }
}
