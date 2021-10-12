/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex41;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class output {
    public static void outputNames(ArrayList<String> names) throws IOException {

        FileWriter output = new FileWriter("exercise41_output.txt");

        output.write("Total of " + names.size() + " names\n");

        output.write("--------------------\n");

        for (String i : names) {

            output.write(i + "\n");

        }

        output.close();

    }
}
