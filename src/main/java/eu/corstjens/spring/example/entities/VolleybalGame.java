package eu.corstjens.spring.example.entities;

import lombok.Data;

@Data
public class VolleybalGame implements Game{
    private Team home;
    private Team away;


    public VolleybalGame(Team home, Team away) {
        this.home = home;
        this.away = away;
    }

    @Override
    public String playGame() {
        return Math.random()>0.7 ? home.getName(): away.getName();
    }
}
