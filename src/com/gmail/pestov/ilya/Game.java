package com.gmail.pestov.ilya;

public class Game {
  Counter counter = new Counter();
  public void startGame() {
    counter.countCowsAndBulls();
    System.out.println(counter.getUserNumber());
  }
}

