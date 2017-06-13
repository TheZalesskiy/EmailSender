package thezalesskiy.sending;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendHtmlEmail {
    private String userName;
    private String password;
    private Properties props;

    public SendHtmlEmail(String userName, String password) {
        this.userName = userName;
        this.password = password;

        props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

    }

    public void send(String subject, String text, String fromEmail, String toEmail) {
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            //from
            message.setFrom(new InternetAddress(fromEmail));
            //To
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            //title a latter
            message.setSubject(subject);
            //send html message
            message.setContent("<h1>Hello message</h1>", "text/html");
            //send email
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
