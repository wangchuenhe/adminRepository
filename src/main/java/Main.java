import com.entity.User;
import com.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public  static void  main(String [] args ){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
        List<User> list = userService.queryUserList();
        for (User user:list) {
            System.out.println(user.getUsername()+","+user.getPassword()+","+user.getPassword()+"aaaaaa");
        }
        context.destroy();
    }
}
