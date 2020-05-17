package thezalesskiy;

import thezalesskiy.sending.SendEmail;
import thezalesskiy.sending.SendFileEmail;
import thezalesskiy.sending.SendHtmlEmail;

public class Main {
    private static SendEmail sendEmail = new SendEmail
            ("e-mail", "pass");
    private static SendFileEmail sendFileEmail = new SendFileEmail
            ("e-mail", "pass");
    private static SendHtmlEmail sendHtmlEmail = new SendHtmlEmail
            ("e-mail", "this pass");

    public static void main(String[] args) {
        sendEmail.send("This is test","test", "e-mail",
                "e-mail");
        sendFileEmail.send("Hello", "wow", "e-mail",
                "e-mail");
        sendHtmlEmail.send("HelloHTML","cool", "e-mail",
                "e-mail");
    }
}
