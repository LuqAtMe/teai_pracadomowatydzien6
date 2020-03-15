package home.application.teai_pracadomowatydzien6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public EmailService() {
    }
    @EventListener(ApplicationReadyEvent.class)
    public void sendEmail() {
        MimeMessage mail = javaMailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(mail, true);
            helper.setTo("mmiodows@gmail.com");
            helper.setCc("brzeznicki.lukasz@gmail.com");
            helper.setFrom("java.tester@interia.pl");
            helper.setSubject("Mail from Luq - Java Mail Spring API");
            helper.setText("Hej Maciek, bawię się właśnie wysyłaniem maili z poziomu Springa. :-) " +
                    "Oczywiście nie odpowiadaj, ten mail z interii to fake tylko na potrzeby testów");
        } catch (MessagingException e){
            e.getCause();
            e.printStackTrace();
        }

        javaMailSender.send(mail);
    }
}
