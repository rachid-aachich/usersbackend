package ma.avito.test.demo;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(UserRepository repository) {
    return args -> {
      System.out.println("Preloading " + repository.save(new User("Bilbo Baggins", "bilbo@gmail.com", "avatar")));
      System.out.println("Preloading " + repository.save(new User("Frodo Baggins", "frodo@gmail.com", "avatar")));
    };
  }
}