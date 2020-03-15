package home.application.teai_pracadomowatydzien6.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class EmailService {

    private JavaMailSender javaMailSender;

    @Autowired
    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }
    //send mail method using Mime Messages
    public void sendEmail(String to, String subject, String context) {
        MimeMessage mail = javaMailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(mail, true);
            helper.setTo(to);
            //helper.setFrom("java.tester@interia.pl");
            helper.setSubject(subject);
            helper.setText(context);
        } catch (MessagingException e){
            e.getCause();
            e.printStackTrace();
        }

        this.javaMailSender.send(mail);
    }
    //send mail method using simple Messages
    public void sendEmailVer2(String to, String subject, String context){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        //message.setFrom("java.tester@interia.pl");
        message.setSubject(subject);
        message.setText(context);
        javaMailSender.send(message);
    }


}
