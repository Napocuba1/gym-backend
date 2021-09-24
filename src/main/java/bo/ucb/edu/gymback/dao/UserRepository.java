package bo.ucb.edu.gymback.dao;

import bo.ucb.edu.gymback.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "select * from user where email=?1 and password=?2 LIMIT 1",nativeQuery = true)
    User findByEmailAndPassword(String email, String password);
}
