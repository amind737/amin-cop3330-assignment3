/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex41;

import java.util.ArrayList;
import java.util.Scanner;

public class readnames {
    public static void readNames(Scanner input, ArrayList<String> names) {

        while (input.hasNextLine()) {

            names.add(input.nextLine());
        }
    }
}
