package tools.gestorCorreo;

import tools.gestorCorreo.EmailService.Email;
import tools.gestorCorreo.EmailService.SmtpException;
import modelo.EnvioCorreos;

public class GestorCorreo implements EnvioCorreos {
    @Override
    public void enviar(String address, String subject, String content) {
         try {
                new Email(address, subject, content).enviar();
            } catch (SmtpException e) {
                throw new RuntimeException("Email no enviado", e);
            }
        }
}
