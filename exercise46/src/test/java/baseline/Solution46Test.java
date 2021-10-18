package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;

class Solution46Test {
    Solution46 test = new Solution46();

    @Test
    public void checkToSeeIfReadInputIsCorrect() throws IOException {

        String expected_value = """
                badger badger badger
                badger mushroom
                mushroom snake badger badger
                badger""";

        expected_value = expected_value.replaceAll("\n", "").replaceAll("\r", "");

        String actual_value = test.readFileIntoString("exercise46_input.txt");

        actual_value = actual_value.replaceAll("\n", "").replaceAll("\r", "");

        Assertions.assertEquals(actual_value,expected_value);
    }

    @Test
    public void checkToSeeIfAllInputIsOnOneLine() {

        String provided_text = """
                badger badger badger
                badger mushroom
                mushroom snake badger badger
                badger""";

        String expected_value = "badger badger badger badger mushroom mushroom snake badger badger badger";

        String actual_value = test.editString(provided_text);

        Assertions.assertEquals(expected_value, actual_value);
    }
}