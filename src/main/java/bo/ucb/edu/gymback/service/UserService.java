package bo.ucb.edu.gymback.service;

import bo.ucb.edu.gymback.dao.UserRepository;
import bo.ucb.edu.gymback.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public List<User> FindAll () {
        return (List<User>) userRepository.findAll();
    }

    public Optional<User> FindOne (int id) {
        return userRepository.findById(id);
    }

    public User Save (User user) {
        return userRepository.save(user);
    }

    public void DeleteOne (int id){
        userRepository.deleteById(id);
    }
    public User UpdateOne (int id, User userUpdate) {
        User userNew = new User();
        Optional<User> x = userRepository.findById(id);
        if (x.isPresent()) {
            userNew = x.get();
            userNew = userUpdate;
            userRepository.save(userNew);
        }
        return userNew;
    }

    public User searchUser(User user){
        User searchResult= userRepository.findByEmailAndPassword(user.getEmail(),user.getPassword());
        LOGGER.info("Entra searchUser");
        if (searchResult==null){
            LOGGER.info("User no encontrado");
        }else {
            LOGGER.info("User encontrado");
        }

        return searchResult;
    }

//    public boolean verifyUser(User searchUser){
//        User validator = new User();
//        validator=searchUser(searchUser);
//        if (searchUser(searchUser@)==null || (validator.getIdstatus())==2){
//            LOGGER.info("Cuenta o contraseña no existe");
//            return false;
//        }else{
//            LOGGER.info("Login exitoso");
//            return true;
//        }
//
//    }
}
