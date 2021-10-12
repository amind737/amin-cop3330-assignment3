/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex46;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
public class App {
    public static void main(String[] args)
    {

        String filePath = "exercise46_input.txt";

        String fileContent = null;
        try {
            fileContent = readfile.readFileIntoString(filePath, StandardCharsets.UTF_8);
            int NULL=0;
            fileContent = fileContent.replaceAll("(\\r|\\n|\\t)", " ");
            fileContent=fileContent.replaceAll("\\s+"," ").trim();
            int b=0;
        } catch (IOException e) {
            e.printStackTrace();
        }


        cwf.countWordsFrequency(fileContent);
    }
}
