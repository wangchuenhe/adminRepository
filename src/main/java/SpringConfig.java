import com.dao.UserDao;
import com.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public UserDao getUserDao(){
        return new UserDao();
    }
    @Bean
    public UserService getUserService(){
        return new UserService();
    }
}
