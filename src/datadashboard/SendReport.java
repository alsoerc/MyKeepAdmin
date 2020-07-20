/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datadashboard;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author alsorc
 */
public class SendReport {

    private String strDateFormat;
    private SimpleDateFormat objSDF;

    public SendReport() {
        strDateFormat = "hh: mm: ss a dd-MMM-aaaa"; // El formato de fecha está especificado  
        objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 

    }

    public void sendPdf(String destino, String ruta) throws AddressException, MessagingException {
        String host = "smtp.gmail.com";
        final String user = "mykeepapplication@gmail.com";//change accordingly        
        //final String user = "exkapp@gmail.com";//change accordingly
        final String password = "hkjrjnrrorgkuaoh";//change accordingly
        //final String password = "tuyirlzhxcpwjkkp";//Contraseña única de exkapp; change accordingly
        //String to = "also.erc@gmail.com";//change accordingly

        //Get the session object
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", 465);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

        //Compose the message
        MimeMessage message = new MimeMessage(session);

        message.setFrom(new InternetAddress(user));

        message.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));

        message.setSubject("Reporte My Keep");
        // Create the message part
        BodyPart messageBodyPart = new MimeBodyPart();

        // Now set the actual message
        messageBodyPart.setText("Reporte generado en la fecha :" + objSDF.format(new Date()));
        System.out.println(objSDF.format(new Date()));

        // Create a multipar message
        Multipart multipart = new MimeMultipart();

        // Set text message part
        multipart.addBodyPart(messageBodyPart);

        // Part two is attachment
        messageBodyPart = new MimeBodyPart();
        String filename = ruta;
        DataSource source = new FileDataSource(filename);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(filename);
        multipart.addBodyPart(messageBodyPart);

        // Send the complete message parts
        message.setContent(multipart);

        // Send message
        Transport.send(message);

        System.out.println("Sent message successfully....");

    }

}
