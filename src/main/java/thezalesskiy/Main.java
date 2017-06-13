package thezalesskiy;

import thezalesskiy.sending.SendEmail;
import thezalesskiy.sending.SendFileEmail;
import thezalesskiy.sending.SendHtmlEmail;

public class Main {
    private static SendEmail sendEmail = new SendEmail
            ("evgeniy.zalesskiy@gmail.com", "zalesskiy83");
    private static SendFileEmail sendFileEmail = new SendFileEmail
            ("evgeniy.zalesskiy@gmail.com", "zalesskiy83");
    private static SendHtmlEmail sendHtmlEmail = new SendHtmlEmail
            ("evgeniy.zalesskiy@gmail.com", "zalesskiy83");

    public static void main(String[] args) {
        sendEmail.send("This is test","test", "evgeniy.zalesskiy@gmail.com",
                "evgeniy.zalesskiy@ukr.net");
        sendFileEmail.send("Hello", "wow", "evgeniy.zalesskiy@gmail.com",
                "evgeniy.zalesskiy@ukr.net");
        sendHtmlEmail.send("HelloHTML","cool", "evgeniy.zalesskiy@gmail.com",
                "evgeniy.zalesskiy@ukr.net");
    }
}
