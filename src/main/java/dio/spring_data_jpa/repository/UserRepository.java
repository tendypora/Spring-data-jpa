package dio.spring_data_jpa.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import dio.spring_data_jpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByUsername(String username);
      
}


/*
 
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByUsername(String username);
    @Query("SELECT u FROM User u WHERE u.username = :username")
    List<User> findByUsername(@Param("username") String username);
    
}

 */