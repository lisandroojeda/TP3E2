package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tiempo {

    private LocalDateTime fechaYhora;

    private static String fCorto= "yyy/MM/dd";
    private static String fLargo= "dd 'de' MMMM 'de' YYYY";

    public Tiempo(){

        this.fechaYhora = LocalDateTime.now();
    }

    public String mostrarEnformatoCorto(){
        DateTimeFormatter formato =  DateTimeFormatter.ofPattern(fCorto);
        return this.fechaYhora.format(formato);
    }

    public String mostrarEnformatoLargo(){
        DateTimeFormatter formato =  DateTimeFormatter.ofPattern(fLargo);
        return this.fechaYhora.format(formato);
    }
}

