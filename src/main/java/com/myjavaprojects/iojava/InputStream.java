package com.myjavaprojects.iojava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputStream {

    public void filePath() {
        URL url = getClass().getResource("input.txt");
        File filePath = new File(url.getPath());
        System.out.println(filePath);
    }

    public void readFileData() {
        String fileName = "/home/musili/Desktop/java/Java-practice/target/classes/com/myjavaprojects/iojava/input.txt";

        try (FileReader input = new FileReader(fileName)) {
            BufferedReader fileData = new BufferedReader(input);

            String line;

              List<String> lines = new ArrayList<String>();

            System.out.println("File data:");
            while ((line = fileData.readLine()) != null) {
                lines.add(line);
               
            }
        //   for (String oneLine : lines) {
        //     System.out.println(oneLine);
        //   }

        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }
             
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
