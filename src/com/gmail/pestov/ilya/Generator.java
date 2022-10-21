package com.gmail.pestov.ilya;

import java.util.Random;

public class Generator {
  private String randomNumber = "";
  Random random = new Random();
  public String generateNumber(){
    while (randomNumber.length() < 4){
      int num = random.nextInt(10);
      if (!randomNumber.contains(Integer.toString(num))){
        randomNumber = randomNumber + num;
      }
    }
    return randomNumber;
  }
}
