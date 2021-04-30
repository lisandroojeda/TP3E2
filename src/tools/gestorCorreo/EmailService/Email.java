package tools.gestorCorreo.EmailService;


import modelo.EnvioCorreos;

public class Email{

    public String destinatarioEmail;
    public String tituloEmail;
    public String cuerpoEmail;

    public void enviar() throws SmtpException {
        //conectar con el servidor SMTP para el envio
        // Si algo sale mal, se lanza una SmtpException
       // Si todo sale bien
        System.out.println("Se envió el email correctamente");
    }
    public Email(String address, String subject, String content) {
        this.destinatarioEmail = destinatarioEmail;
        this.tituloEmail = tituloEmail;
        this.cuerpoEmail = cuerpoEmail;
    }
}

