package dio.spring_data_jpa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.spring_data_jpa.model.User;
import dio.spring_data_jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    
    @Override
    public void run(String... args) throws Exception {
        insertUser();
        List<User> users = repository.findByUsername("Tendy");
        for(User u: users){
            System.out.println(u);
        }
    }

    private void insertUser(){
        User user = new User();
        user.setName("Tendy Porã");
        user.setUsername("Tendy");
        user.setPassword("postgres");
        repository.save(user);
    

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}


/*
@Override 
public void run(String... args) throws Exception{
    User user = new User();
    user.setName("Ted");
    user.setUsername("tendypora");
    user.setPassword("dio123");

    repository.save(user);

    for(User u: repository.findAll()){
        System.out.println(u);
    }
}
*/





