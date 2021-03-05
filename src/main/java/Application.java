import com.pluralsight.service.SpeakerServiceImpl;
import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String args[]) {

        //converting main.class to use spring
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //not bean
        //SpeakerService service = new SpeakerServiceImpl();

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);


        System.out.println(service.findAll().get(0).getFirstName());

        System.out.println(service.findAll().get(0).getLastName());

    }
}
