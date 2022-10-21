package com.gmail.pestov.ilya;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Writer {
  public void writeAnswer(ArrayList<String> userNumberArray, ArrayList<String> answerArray, String randomNumber) throws IOException {
    FileWriter fileWriter = new FileWriter("gameLog.txt", true);
    Date date = new Date(System.currentTimeMillis());
    int lastGameNumberIndex = 0;
    int lastGameNumberInt = 0;
    String lastGameNumber = "";
    String path = "gameLog.txt";
    String content = Files.readString(Paths.get(path).toAbsolutePath(), StandardCharsets.UTF_8);
    lastGameNumberIndex = content.lastIndexOf("Game №");

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
    String formattedDate = simpleDateFormat.format(date);

    if (lastGameNumberIndex == -1) {
      lastGameNumberInt = 1;
    }
    else {
      lastGameNumber = content.charAt(lastGameNumberIndex + 6) + "";
      lastGameNumberInt = Integer.parseInt(lastGameNumber) + 1;
    }
    fileWriter.write("Game №" + lastGameNumberInt + " " + formattedDate + " Загаданная строка " + randomNumber + "\n");
    for (int i = 0; i < userNumberArray.size(); i++) {
      fileWriter.write("  Запрос: " + userNumberArray.get(i) + " Ответ: " + answerArray.get(i) + "\n");
    }
    fileWriter.write("  Строка была угадана за " + userNumberArray.size() + " попыток \n");
    fileWriter.flush();
    fileWriter.close();
  }
}
