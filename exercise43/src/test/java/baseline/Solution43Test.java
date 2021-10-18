package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {

    // My thought process was to test if the folder was created
    // or if the folder already existed.


    // Test creates a JS folder within the main directory.
    // Note running multiple tests results in folders
    // within folders up to a max of 2.
    @Test
    public void createJavaScriptFolderTest() {
        Solution43 test = new Solution43();
        String pathJS = System.getProperty("user.dir");
        pathJS = pathJS  + "\\" + "js";

        test.createJavaScriptFolder(pathJS);

        File jScriptFolder = new File(pathJS);

        boolean jScriptCreated = jScriptFolder.mkdir();

        boolean actualResult = jScriptFolder.exists();

        if (jScriptCreated) {
            System.out.println("Created " + jScriptFolder + "\\");
        }

        if (jScriptFolder.exists()){
            System.out.println(jScriptFolder + " exists.");
        }

        assertTrue(actualResult);
    }

    // My thought process was to test if the folder was created
    // or if the folder already existed.


    // Test creates a CSS folder within the main directory.
    // Note running multiple tests results in folders
    // within folders up to a max of 2.
    @Test
    public void createCssFolderTest() {
        Solution43 test2 = new Solution43();

        String pathCSS = System.getProperty("user.dir");
        pathCSS = pathCSS + "\\" + "css";

        test2.createCssFolder(pathCSS);

        File CssFolder = new File(pathCSS);

        boolean CssCreated = CssFolder.mkdir();

        boolean actualResult = CssFolder.exists();

        if (CssCreated) {
            System.out.println("Created " + CssFolder + "\\");
        }

        if (CssFolder.exists()) {
            System.out.println(CssFolder + " exists.");
        }

        assertTrue(actualResult);
    }
}