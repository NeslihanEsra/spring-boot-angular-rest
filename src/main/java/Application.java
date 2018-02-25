import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories (basePackages = {"com.nea.repository"})
@EntityScan(basePackages = {"com.nea"})
@ComponentScan(basePackages = {"com.nea"})
@EnableTransactionManagement
@PropertySource("application.properties")
public class Application {
        public static void main(String[] args) throws Exception {
            new SpringApplication(Application.class).run(args);
        }

}
