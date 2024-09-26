/*
 * JavaMailSender.java
 */
package enviarCorreo;

import datos.Configuracion;
import datos.Correo;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author Equipo4
 */
public class JavaMailSender implements IMecanismo {

    private static String emailDesde = "equipo4.arquitectura@gmail.com";
    private static String passwordFrom ="unvrbuznlpzyhrci";
    private String destinatario;
    private String encabezado;
    private String mensaje;
    
    private Properties mProperties;
    private Session mSession;
    private MimeMessage mCorreo;
    
    private void crearEmail(Correo correo, Configuracion configuracion){
        destinatario = correo.getDestinatario();
        encabezado = correo.getEncabezado();
        mensaje = correo.getMensaje();
        
        mProperties.put("mail.smtp.host", "smtp.gmail.com");  // Corregido
    mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");  // Corregido
    mProperties.setProperty("mail.smtp.starttls.enable", "true");
    mProperties.setProperty("mail.smtp.port", "587");
    mProperties.setProperty("mail.smtp.user", emailDesde);
    mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
    mProperties.setProperty("mail.smtp.auth", "true");  // Añadido
    mProperties.setProperty("mail.smtp", "true");
        
        mSession = Session.getDefaultInstance(mProperties);
        
        
        try {
            mCorreo = new MimeMessage(mSession);
            mCorreo.setFrom(new InternetAddress(emailDesde));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mCorreo.setSubject(encabezado);
            mCorreo.setText(mensaje,"ISO-8859-1","html");
            
        } catch (AddressException ex) {
            Logger.getLogger(JavaMailSender.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(JavaMailSender.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public JavaMailSender() {
        mProperties = new Properties();
    }
    
    
    
    @Override
    public void enviar(Correo correo, Configuracion configuracion) {
        crearEmail(correo, configuracion);
        try {
            Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(emailDesde, passwordFrom);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
            System.out.println("Se envio un correo");
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(JavaMailSender.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(JavaMailSender.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
