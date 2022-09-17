package br.com.estudo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class AppConfiguration {

//    @Bean
//    public String applicationName(){
//        return "System name";
//    }

    @Bean
    public CommandLineRunner execute(){
        return args -> {
            System.out.println("RUNNING DEVELOPMENT CONFIG");
        };
    }

}
