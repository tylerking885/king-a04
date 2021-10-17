/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution 41
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution41 {
    public static void main(String[] args) throws Exception {
        // Create a new object of the main class.
        Solution41 app = new Solution41();

        // Assign the return value of input method to a list string variable.
        List<String> lineList =  app.readInput("exercise41_input.txt");

        // Pass the List String variable along with output
        // String file to a writeOutput method.
        app.writeOutput("exercise41_output.txt", lineList);
    }

    public List<String> readInput(String inputFile) throws IOException {

        // Create a new FileReader object and pass it String input.txt argument.
        FileReader fileReader = new FileReader(inputFile);

        // Create a new BufferedReader object and pass it the FileReader argument.
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Declare String variable for input.
        String inputLine;

        // Declare new Array list variable and cast it to List String.
        List<String> lineList = new ArrayList<>();

        // Loop through input from text file and add it to the list.
        while ((inputLine = bufferedReader.readLine()) != null) {
            lineList.add(inputLine);
        }

        // Close the FileReader input stream.
        fileReader.close();

        // Return the list.
        return lineList;
    }

    public void writeOutput(String outputFile, List<String> lineList) throws IOException {

        // Sort the list (alphabetically).
        Collections.sort(lineList);

        // Construct a FileWriter object and pass it a String output.txt argument.
        FileWriter fileWriter = new FileWriter(outputFile);

        // Construct a PrintWriter object and pass it the fileWriter variable as a parameter.
        PrintWriter out = new PrintWriter(fileWriter);

        // Print the Total # of names according to the size of the list.
        out.printf("Total of %d names%n", lineList.size());

        // Print out a borderline.
        out.println("-----------------");

        // Loop through the list, printing out its contents.
        for (String outputLine : lineList) {
            out.println(outputLine);
        }

        // Flush the PrintWriter stream.
        out.flush();
        // Close the PrintWriter stream.
        out.close();
        // Close the fileWriter stream.
        fileWriter.close();
    }
}