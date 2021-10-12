/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex45;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws IOException {

        File file = new File("exercise45_input.txt");
        Scanner sc = new Scanner(file);

        FileWriter writer = new FileWriter("exercise45_output.txt");
        try
        {
            while( sc.hasNext() )
            {

                String user = sc.nextLine();

                user = user.replaceAll("utilize", "use");

                writer.write(user);

                writer.write("\n");
            }
        }
        finally
        {
            sc.close();
        }

        writer.close();

        System.out.println("\nSuccessfully Modified!!");

    }
}
