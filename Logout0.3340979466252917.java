·       User should be able to logout from the application.
 

//Controller Class

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logout")
public class LogoutController {
 
    @GetMapping
    public String logout() {
        // Code to logout the user and redirect to login screen
        return "Logged out successfully";
    }
}

//Service Class

import org.springframework.stereotype.Service;

@Service
public class LogoutService {
 
    public void logout() {
        // Code to logout the user
    }
}

//Repository Class

import org.springframework.data.jpa.repository.JpaRepository;

public interface LogoutRepository extends JpaRepository<Logout, Long> {
 
    Logout findByUsername(String username);
}