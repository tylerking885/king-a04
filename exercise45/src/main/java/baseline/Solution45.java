/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution 45
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.io.IOException;
import java.util.List;

public class Solution45 {
    // Introduce a Scanner object.

    // Declare String variable for outputFile.

    public static void main(String[] args) throws Exception {
        // Declare new super class object.

        // Call prompt method (Ask the user for an output file name).
        // Assign user input to String variable.

        // Assign the result of input method to List String variable.

        // Call writeOutput method which takes the users output file and the List String as parameters.
    }

    public List<String> readInput(String inputFile) throws IOException {
        // Construct new fileReader object with inputFile String as a parameter.

        // Construct new BufferedReader object with fileReader as a parameter.

        // Declare new String variable.
        // Construct a new ArrayList and assign it to a List String variable.

        // Loop through each line of input assigning it to the previous created string.

        // Replace every occurrence of "utilize" with "use" and assign this result to a new String.
        // Add the modded String to the String List.

        // Close the fileReader stream.

        // return the String List.
    }

    public void writeOutput(String outputFile, List<String> lineList) {
        // Construct new FileWriter object and pass it the users output file string as a parameter.
        // Construct new PrintWriter object and pass it the fileWriter variable as a parameter.

        // Loop through the String List, printing out each line.

        // Flush the PrintWriter stream.
        // Close the PrintWriter stream.
        // Close the fileWriter stream.
    }
}
