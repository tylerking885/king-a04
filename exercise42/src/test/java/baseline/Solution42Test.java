
package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;

class Solution41Test {

    @Test
    public void readCorrectInputTest() throws IOException {
        Solution42 test = new Solution42();

        List<String> expected_value = List.of("Ling", "Mai","55900",
                "Johnson","Jim","56500", "Jones","Aaron","46000", "Jones","Chris","34500",
                "Swift", "Geoffrey", "14200","Xiong","Fong","65000","Zarnecki","Sabrina","51500");

        List<String> actual_value = test.readInput("exercise42_input.txt");

        Assertions.assertEquals(expected_value, actual_value);
    }
}