package pl.edu.agh.softwarestudio.angel.security.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserREST {

    @Autowired
    PasswordEncoder enc;

    @Autowired
    UserRepo userRepo;

    @PostMapping("/api/register")
    public User register(
            @RequestBody User user
    ) throws Exception {
        if(userRepo.countByUsername(user.getUsername()) == 0 && userRepo.countByEmail(user.getEmail()) == 0) {
            user.setPassword(enc.encode(user.getPassword()));
            user.setRole("USER");
            return userRepo.save(user);
        }
        else{
            throw new Exception("User already exists");
        }
    }
}
