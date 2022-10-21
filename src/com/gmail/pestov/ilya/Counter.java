package com.gmail.pestov.ilya;

import java.util.Scanner;

public class Counter {
  Scanner sc = new Scanner(System.in);
  Generator generator = new Generator();
  private int numberOfAttempts;
  private int bulls;
  private int cows;
  private String userNumber;
  private String randomNumber;

  public int getBulls() {
    return bulls;
  }

  public int getCows() {
    return cows;
  }

  public String getUserNumber() {
    return userNumber;
  }

  public String getRandomNumber() {
    return randomNumber;
  }

  public int getNumberOfAttempts() {
    return this.numberOfAttempts;
  }

  public void countCowsAndBulls() {
    String bullsOutString;
    String cowsOutString;
    this.bulls = 0;
    this.cows = 0;
    this.numberOfAttempts = 0;
    this.userNumber = "";
    char[] userNumberArray;
    this.randomNumber = generator.generateNumber();
    System.out.println(this.randomNumber);
    char[] randomNumberArray = this.randomNumber.toCharArray();
    while (true) {
      this.bulls = 0;
      this.cows = 0;
      bullsOutString = "быка";
      cowsOutString = "коровы";
      this.userNumber = sc.next().substring(0, 4);
      userNumberArray = this.userNumber.toCharArray();
      for (int i = 0; i < userNumberArray.length; i++) {
        if (this.randomNumber.contains(userNumberArray[i] + "")){
          this.cows++;
        }
        if (randomNumberArray[i] == userNumberArray[i]){
          this.bulls++;
          this.cows--;
        }
      }
      if (this.cows == 0) {
        cowsOutString = "коров";
      } else if (this.cows == 1) {
        cowsOutString = "корова";
      }
      if (this.bulls == 0) {
        bullsOutString = "быков";
      } else if (this.bulls == 1) {
        bullsOutString = "бык";
      }
      System.out.println(this.cows + " " + cowsOutString +  " " + this.bulls + " " + bullsOutString);
      if (this.bulls == 4){
        break;
      }
      else {
        this.numberOfAttempts++;
      }
    }
  }
}

