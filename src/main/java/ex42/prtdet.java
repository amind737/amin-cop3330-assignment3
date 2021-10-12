/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prtdet {
    public static void printDetails(String filename) {
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String s = sc.nextLine();
                String[] temp = s.split(",");
                System.out.printf("%-17s%-17s%-17s\n", temp[0], temp[1], temp[2]);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error: File Not Found!!");
        }
    }
}
