/*
 * JavaMailSender.java
 */
package org.itson.arquitectura.mailSender.enviarCorreo;

import datos.Configuracion;
import datos.Correo;
import datos.Cuenta;
import datos.Protocolo;
import datos.Servicio;
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
public class JavaMailApi implements IMecanismo {

    private static String emailDesde = "equipo4.arquitectura@gmail.com";
    private static String passwordFrom = "unvrbuznlpzyhrci";
    private String destinatario;
    private String encabezado;
    private String mensaje;
    private Properties mProperties;
    private Session mSession;
    private MimeMessage mCorreo;

    /**
     * Constructor.
     */
    public JavaMailApi() {
        mProperties = new Properties();
    }

    /**
     * Permite crear un correo para poder enviarlo.
     * 
     * @param correo El correo a enviar.
     */
    private void crearCorreo(Correo correo) {
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
            mCorreo.setText(mensaje, "ISO-8859-1", "html");
        } catch (AddressException ex) {
            Logger.getLogger(JavaMailApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(JavaMailApi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void enviar(Correo correo, Configuracion configuracion) {
        crearCorreo(correo);
        Servicio servicio = configuracion.getServicios().getFirst();
        Protocolo protocolo = servicio.getProtocolos().getFirst();
        Cuenta cuenta = servicio.getCuentas().getFirst();
        System.out.printf("""
                          Correo enviado exitosamente.
                          Mecanismo: Java.Mail.API
                          Servicio: %s
                          Protocolo: %s
                          Cuenta: %s
                          """, servicio.getNombre(), protocolo.getProtocolo(), cuenta.getDireccion());
        try {
            Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(emailDesde, passwordFrom);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(JavaMailApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(JavaMailApi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
