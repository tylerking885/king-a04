/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution43
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution43 {

    private static final Scanner in = new Scanner(System.in);

    private String nameSite;
    private String nameAuthor;
    private String myPath;
    private String ansQuestion1;
    private String ansQuestion2;

    public static void main(String[] args) {
        Solution43 app = new Solution43();

        // Prompt User for Site.
        app.promptUser("Site name: ");
        app.nameSite = in.nextLine();

        // Prompt user for author.
        app.promptUser("Author: ");
        app.nameAuthor = in.nextLine();

        // Ask user a question.
        app.promptUser("Do you want a folder for JavaScript? ");
        app.ansQuestion1 = in.next();

        // Ask user another question.
        app.promptUser("Do you want a folder for CSS? ");
        app.ansQuestion2 = in.next();

        // Set string path variable to root directory.
        app.myPath = System.getProperty("user.dir");

        // Add site name to path.
        app.myPath += "\\" + app.nameSite;

        // Call createWebsiteFolder method with String myPath as a parameter.
        app.createWebsiteFolder(app.myPath);

        // If user wants a JS folder
        if (app.ansQuestion1.equals("y") || app.ansQuestion1.equals("Y")){

            // Call method createJavaScriptFolder with String myPath as a parameter.
            app.createJavaScriptFolder(app.myPath);
        }

        // If user wants a CSS folder
        if (app.ansQuestion2.equals("y") || app.ansQuestion2.equals("Y")){

            // Call method createCssFolder with String myPath as a parameter.
            app.createCssFolder(app.myPath);
        }
        // Close the scanner object.
        in.close();
    }

    // Method for prompting User for input.
    private void promptUser(String prompt) {
        System.out.print(prompt);
    }

    public void createJavaScriptFolder(String myPath) {

        // Create a File object variable and set it to new jspath variable.
        File jScriptFolder = new File(myPath + "\\js");

        // Create the new directory with the jScriptFolder.
        boolean jScriptCreated = jScriptFolder.mkdir();

        // If directory is created print out its creation path.
        if (jScriptCreated) {
            System.out.println("Created " + jScriptFolder + "\\");
        }
    }

    public void createCssFolder(String myPath){

        // Create a File object variable and set it to new csspath variable.
        File CSSFolder = new File(myPath + "\\css");

        // Create the new directory with the CSSFolder.
        boolean cssExists = CSSFolder.mkdir();

        // If directory is created print out its creation path.
        if (cssExists) {
            System.out.println("Created " + CSSFolder + "\\");
        }
    }

    public void createWebsiteFolder(String myPath){

        // Create a File object variable and
        // set it to String Path variable
        File site = new File(myPath);

        // Create the new directory with the website folder.
        boolean siteExists = site.mkdir();

        if (siteExists) {

            System.out.println("Created " + myPath);

            try {
                // Create a File Writer object to write in html file.
                FileWriter webWriter = new FileWriter(myPath + "\\index.html");

                // The html file contents with the name of the site inside
                // the <title> tag and the author in a <meta> tag.
                webWriter.write("<!DOCTYPE HTML>\n<html> lang=\"en\">\n<head>\n");
                webWriter.write("\t<title>" + nameSite + "</title>\n");
                webWriter.write("\t<meta author=\"" + nameAuthor + "\">\n");
                webWriter.write("</head>\n<body>\n\n</body>\n</html>");

                // Close the File object.
                webWriter.close();

                System.out.println("Created " + myPath + "\\index.html");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
