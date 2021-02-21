import org.raaghavoguz.xmlproject.Main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BaseTest {
    private static final Path TEST_PATH = Paths.get("src", "main", "resources", "testcases");

    void testQuery(String testcaseName) {
        String results = Main.getResults(TEST_PATH.resolve(testcaseName + "Query.txt").toString());

        try {
            String expectedResults = new String(Files.readAllBytes(TEST_PATH.resolve(testcaseName + "Results.txt")),
                    StandardCharsets.UTF_8);

            assert results.equals(expectedResults);
        } catch (IOException e) {
            e.printStackTrace();
            assert false;
        }
    }
}
