package eu.corstjens.spring.example.entities;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class VolleybalGame implements Game{

    private Team home;

    private Team away;


    public VolleybalGame(@Qualifier("nolikoMaaseik") Team home, @Qualifier("knackRoeselare") Team away) {
        this.home = home;
        this.away = away;
    }

    @Override
    public String playGame() {
        String result = String.format("Game %s at %s", away.getName(), home.getName());
        result += String.format(" winner is %s", Math.random() > 0.5 ? home.getName() : away.getName());
        return result;
    }
}
