package eu.corstjens.spring.example;

import eu.corstjens.spring.example.config.AppConfig;
import eu.corstjens.spring.example.entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunDemo {

    public static void main (String[] args ){
        //run the aplication
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Game game = context.getBean("game", Game.class);
        System.out.println("result:" + game.playGame());

        System.out.println();
        System.out.println();
        //print all beans
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

    }
}
