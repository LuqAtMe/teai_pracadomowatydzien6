package home.application.teai_pracadomowatydzien6.aspect;

import home.application.teai_pracadomowatydzien6.email.EmailService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectService {

    //put here your address email
    private final String mail = "brzeznicki.lukasz@gmail.com";

    private EmailService emailService;

    @Autowired
    public AspectService(EmailService emailService) {
        this.emailService = emailService;
    }

    @After("@annotation(AspectServiceAnnotation)")
    public void afterMovieAdded(){
        emailService.sendEmailVer2(mail, "Confirmation - Movie Added", "Movie added to database");

    }

}
