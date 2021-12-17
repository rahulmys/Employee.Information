package WelcomeController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeWelcomePage {

    @RequestMapping("/welcome")
  public String welcome(){
      return "Welcome to employee information page!!!!!";
  }
}
