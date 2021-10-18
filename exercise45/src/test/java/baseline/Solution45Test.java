package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;

class Solution45Test {
    Solution45 test = new Solution45();
    
    @Test
    public void readCorrectInputTest() throws IOException {

        List<String> expected_value = List.of(new String[]{"One should never use the word \"use\" in writing." +
                " Use \"use\" instead.", "For example, \"She uses an IDE to write " +
                "her Java programs\" instead of \"She",
                "uses an IDE to write her Java programs\"."});

        List<String> actual_value = test.readInput("exercise45_input.txt");

        Assertions.assertEquals(expected_value, actual_value, String.valueOf(0));
    }
}