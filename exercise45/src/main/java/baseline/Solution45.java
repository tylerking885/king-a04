/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution 45
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution45 {

    // Introduce a Scanner object.
    private static final Scanner in = new Scanner(System.in);

    // Declare String variable for outputFile.
    private String outputFile;

    public static void main(String[] args) throws Exception {

        // Declare new super class object.
        Solution45 app = new Solution45();

        // Call prompt method (Ask the user for an output file name).
        app.outputFilePrompt();

        // Assign user input to String variable.
        app.outputFile = in.nextLine();

        // Assign the result of input method to List String variable.
        List<String> lineList =  app.readInput("exercise45_input.txt");

        // Call writeOutput method which takes the users output file
        // and the List String as parameters.
        app.writeOutput(app.outputFile, lineList);
    }

    public List<String> readInput(String inputFile) throws IOException {

        // Construct new fileReader object with inputFile String as a parameter.
        FileReader fileReader = new FileReader(inputFile);

        // Construct new BufferedReader object with fileReader as a parameter.
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Declare new String variable.
        String inputLine;

        // Construct a new ArrayList and assign it to a List String variable.
        List<String> lineList = new ArrayList<>();

        // Loop through each line of input assigning it to the previous created string.
        while ((inputLine = bufferedReader.readLine()) != null) {

            // Replace every occurrence of "utilize" with "use" and assign this result to a new String.
            String moddedInputLine = inputLine.replaceAll("utilize","use");

            // Add the modded String to the String List.
            lineList.add(moddedInputLine);
        }
        // Close the fileReader stream.
        fileReader.close();

        // return the String List.
        return lineList;
    }

    public void writeOutput(String outputFile, List<String> lineList) {

        try {
            // Construct new FileWriter object and pass it the users output file string as a parameter.
            FileWriter fileWriter = new FileWriter(outputFile);
            // Construct new PrintWriter object and pass it the fileWriter variable as a parameter.
            PrintWriter out = new PrintWriter(fileWriter);

            // Loop through the String List, printing out each line.
            for (String outputLine : lineList) {
                out.println(outputLine);
            }

            // Flush the PrintWriter stream.
            out.flush();
            // Close the PrintWriter stream.
            out.close();
            // Close the fileWriter stream.
            fileWriter.close();

        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    private void outputFilePrompt(){
        System.out.print("Enter output file name. ");
    }
}
