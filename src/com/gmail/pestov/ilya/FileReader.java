package com.gmail.pestov.ilya;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileReader {
  FileWriter fileWriter = new FileWriter("gameLog.txt", true);

  public FileReader(String randomNumber, String userNumber, int bulls, int cows, int numberOfAttempts) throws IOException {
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
  }
}
