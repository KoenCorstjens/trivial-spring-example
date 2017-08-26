package eu.corstjens.spring.example;

import eu.corstjens.spring.example.entities.*;

public class RunDemoWithoutSpring {

  public static void main (String[] args ){
      Team noliko = new NolikoMaaseik();
      Team knack = new KnackRoeselare();
      Game game = new VolleybalGame(noliko, knack);
      System.out.println(game.playGame());
  }
}
