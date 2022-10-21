package com.gmail.pestov.ilya;

import java.io.IOException;

public class Game {
  Counter counter = new Counter();
  public void startGame() throws IOException {
    counter.countCowsAndBulls();
    System.out.println(counter.getUserNumber());
  }
}

