package org.microserviceproject.dockerdemo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public CommandLineRunner commandLineRunner (Repository repository){
        return args -> {
          repository.save(new DemoEntity("Docker"));
        };
    }
}
