/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution46
 *  Copyright 2021 Tyler King
 */
package baseline;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution46 {

    // Declare string variable.
    private String fileContent;

    public static void main(String[] args) {
        Solution46 app = new Solution46();

        try {
            // Set string variable to readFileIntoString methods return value.
            app.fileContent = app.readFileIntoString("exercise46_input.txt");

            // Update string variable to editString methods return value.
            app.fileContent = app.editString(app.fileContent);

        } catch (IOException e){
            e.printStackTrace();
        }

        // Call countWordsFrequency method with
        // a string fileContent as a parameter.
        assert app.fileContent != null;
        app.countWordsFrequency(app.fileContent);
    }

    // Read text file into a single string.
    public String readFileIntoString (String path) throws IOException {

        // Reads the txt file from directory.
        try (Scanner scanner = new Scanner(new File(path))) {

            // Match of the start of string.
            return scanner.useDelimiter("\\A").next();
        }
    }

    // Takes a multi-line string with spaces and reduces it to one line.
    public String editString (String fileContent){

        // Regular expression to put every word on the same line.
        fileContent = fileContent.replaceAll("([\\r|\\n\\t])", " ");

        // Regular expression to eliminate extra spaces.
        fileContent = fileContent.replaceAll("\\s+"," ");

        return fileContent;
    }

    // Counts the frequency of each word and prints a histogram.
    public void countWordsFrequency (String str){

        // Initialize a tree map variable.
        Map<String,Integer> wordMap = new TreeMap<>();

        // Split the string to find each word.
        String[] array = str.split(" ");

        // Loop to iterate over the words.
        for (String s : array) {

            // Check if the array element is present in the map.
            if (wordMap.containsKey(s)) {

                // If found, increase the count.
                wordMap.put(s, wordMap.get(s) + 1);
            }
            else {
                // Otherwise, count remains the same.
                wordMap.put(s, 1);
            }
        }

        // Loop to iterate over the elements of the map.
        for (Map.Entry<String,Integer> entry: wordMap.entrySet()) {

            System.out.printf("%-10s", entry.getKey() + ":");

            for (int i=0; i<entry.getValue(); i++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
