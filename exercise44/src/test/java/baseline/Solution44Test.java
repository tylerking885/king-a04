package baseline;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution44Test {
    Solution44 test = new Solution44();

    @Test
    public void readFileDisplaysCorrectInputTest() throws FileNotFoundException {

        Object expected_value = "{\"products\":[" +
                "{\"name\":\"Widget\",\"price\":25.00,\"quantity\":5}," +
                "{\"name\":\"Thing\",\"price\":15.00,\"quantity\":5}," +
                "{\"name\":\"Doodad\",\"price\":5.00,\"quantity\":10}]}";

        Object actual_value = test.readFile("exercise44_input.json");


        assertEquals(expected_value,actual_value.toString());
    }

    @Test
    public void getArrayCorrectlyTest() throws FileNotFoundException {
        JsonObject jsonObject = test.readFile("exercise44_input.json");

        JsonArray actual_jArray = test.getArray(jsonObject);

        String expected_jArray = "[{\"name\":\"Widget\",\"price\":25.00,\"quantity\":5}," +
                "{\"name\":\"Thing\",\"price\":15.00,\"quantity\":5}," +
                "{\"name\":\"Doodad\",\"price\":5.00,\"quantity\":10}]";

        assertEquals(expected_jArray,actual_jArray.toString());
    }
}