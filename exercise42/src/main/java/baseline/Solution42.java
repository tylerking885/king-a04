/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution 42
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution42 {
    public static void main(String[] args) throws Exception {
        // Construct a new Solution42 object.
        Solution42 app = new Solution42();

        // Assign the return value of readInput method to a List String variable.
        List<String> lineList =  app.readInput("exercise42_input.txt");

        // Call the writeOutput method by passing in the previous List String
        // variable and pass in the outputFile name in the form of a String.
        app.writeOutput("exercise42_output.txt", lineList);
    }

    public List<String> readInput(String inputFile) throws IOException {

        // Construct a fileReader object and pass in the inputFile as
        // a parameter in the form of a String.
        FileReader fileReader = new FileReader(inputFile);

        // Construct a bufferedReader object and pass it the fileReader as a parameter.
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Declare a new String.
        String inputLine;

        // Construct a new ArrayList object and set it to a ListString variable.
        List<String> lineList = new ArrayList<>();

        // Loop through each line of input and assign it to the new string variable.
        while ((inputLine = bufferedReader.readLine()) != null) {

            // Split the String at each comma.
            String[] parts = inputLine.split(",");

            // Assign each part a value.
            String firstName = parts[0];
            String lastName = parts[1];
            String Salary = parts[2];

            // Add the parts to the list.
            lineList.add(firstName);
            lineList.add(lastName);
            lineList.add(Salary);
        }
        // Close the fileReader object stream.
        fileReader.close();

        return lineList;
    }

    public void writeOutput(String outputFile, List<String> lineList) throws IOException {

        // Use a counter for each line break.
        int i = 0;

        // Construct a fileWriter object and pass it the outputFile String as a parameter.
        FileWriter fileWriter = new FileWriter(outputFile);

        // Construct a PrintWriter object and pass it the fileWriter variable as a parameter.
        PrintWriter out = new PrintWriter(fileWriter);

        // Print the Header.
        out.println("Last      First     Salary");
        out.println("--------------------------");

        // Loop through the contents of the list.
        for (String outputLine : lineList) {
            i++;

            out.printf("%-10s",outputLine);

            // Indenting the line every 3 entries.
            if (i%3 ==0 ) {out.println();}
        }

        // Flush the printWriter stream.
        out.flush();
        // Close the printWriter stream.
        out.close();
        // Close the fileWriter stream.
        fileWriter.close();
    }
}

