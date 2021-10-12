/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex41;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
public class App {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner inputFile = new Scanner(new File("exercise41_input.txt"));

        ArrayList<String> names = new ArrayList<>();

        readnames.readNames(inputFile, names);

        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);

        inputFile.close();

        try {
            output.outputNames(names);
        }
        catch (Exception e) {
            System.out.println();
        }
    }
}
