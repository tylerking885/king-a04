/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution 44
 *  Copyright 2021 Tyler King
 */

package baseline;

import com.google.gson.*;
import java.io.*;

public class Solution44 {

    // Declare string variable.
    private final String inFile = "exercise44_input.json";

    // Declare Json object variable.
    private JsonObject jsonObject;

    // Declare Json array variable.
    private JsonArray products;

    public static void main (String[]args) throws IOException {

        Solution44 app = new Solution44();

        // Set return value from readFile method call to the JsonObject variable.
        app.jsonObject = app.readFile(app.inFile);

        // Set return value from getArray method call to the JsonArray variable.
        app.products = app.getArray(app.jsonObject);

        // Call product search method with JsonArray variable as a parameter.
        app.productSearch(app.products);
    }

    public JsonObject readFile (String inFile) throws FileNotFoundException {

        // Read json file using parser and store it in obj.
        Object obj = JsonParser.parseReader(new FileReader(inFile));

        // Create json object to read internal values.
        return (JsonObject) obj;
    }

    public JsonArray getArray(JsonObject jsonObject){

        // Reading products array from the file.
        return (JsonArray)jsonObject.get("products");
    }

    public void productSearch(JsonArray products) throws IOException {

        // Buffered reader object for user input.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Flag drives how long the next loop lasts.
        boolean flag = true;

        // Loop until correct input is found.
        while (flag) {

            // Prompt User for input.
            System.out.print("What is the product name? ");

            // Set user input to a string variable.
            String input = bufferedReader.readLine();

            // Loop through the products array.
            for (JsonElement product : products) {

                // Set the element to a json object variable.
                JsonObject json = (JsonObject) product;

                // Grab the name and set it to element variable.
                JsonElement name = json.get("name");

                // Compare name element with user input.
                if (name.getAsString().equals(input)) {

                    // If found print corresponding item and it's contents.
                    System.out.printf("Name: %s%n", name.getAsString());
                    System.out.printf("Price: %s%n", json.get("price").getAsString());
                    System.out.printf("Quantity: %s%n", json.get("quantity").getAsString());

                    // Break out of loop here.
                    flag = false;
                }
            }
            // If flag is true, then value is not found and continue.
            if (flag) {

                System.out.println("Sorry, that product was not found in our inventory.");
            }
        }
    }
}