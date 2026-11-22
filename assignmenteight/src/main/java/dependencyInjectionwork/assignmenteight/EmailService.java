package dependencyInjectionwork.assignmenteight;
import org.springframework.stereotype.Service;
@Service

public class EmailService implements MessageService{
    public void send(String msg) {
        System.out.println("Email sent: " + msg);
    }
}
