package eu.corstjens.spring.example.config;

import eu.corstjens.spring.example.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Game game(){
        return new VolleybalGame(getNoliko(), getRoeselare());
    }

    @Bean
    public Team getRoeselare() {
        return new KnackRoeselare();
    }

    @Bean
    public Team getNoliko() {
        return new NolikoMaaseik();
    }
}
