package bo.ucb.edu.gymback.controller;

import bo.ucb.edu.gymback.domain.User;
import bo.ucb.edu.gymback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

//@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PutMapping(value = "/update/{id}")
	public User UserUpdateOne (@RequestBody User user, @PathVariable int id) {
        return userService.UpdateOne(id, user);
    }
    
    //list all users
 	@GetMapping(value = "/list")
    public List<User> FindAll() {
        return userService.FindAll();
    }
}
