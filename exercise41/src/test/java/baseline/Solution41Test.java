package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;

class Solution41Test {

    @Test
    public void readCorrectInputTest() throws IOException {
        Solution41 test = new Solution41();

        List<String> expected_value = List.of(new String[]{"Ling, Mai", "Johnson, Jim",
                "Zarnecki, Sabrina", "Jones, Chris", "Jones, Aaron",
                "Swift, Geoffrey", "Xiong, Fong"});

        List<String> actual_value = test.readInput("exercise41_input.txt");

        Assertions.assertEquals(expected_value, actual_value, String.valueOf(0));
    }
}