import org.raaghavoguz.xmlproject.Main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BaseTest {
    private static final Path TEST_PATH = Paths.get("src", "main", "resources", "testcases");

    private void testFileContentsEqual(String results, String fileName) {
        try {
            String expectedResults = new String(Files.readAllBytes(TEST_PATH.resolve(fileName)),
                    StandardCharsets.UTF_8);

            assert results.equals(expectedResults);
        } catch (IOException e) {
            e.printStackTrace();
            assert false;
        }
    }

    void testQuery(String testcaseName) {
        String results = Main.getResults(TEST_PATH.resolve(testcaseName + "Query.txt").toString());
        testFileContentsEqual(results, testcaseName + "Results.txt");
    }

    void testRewrite(String testcaseName) {
        Main.getResults(TEST_PATH.resolve(testcaseName + "Query.txt").toString());
        try {
            String results = new String(Files.readAllBytes(TEST_PATH.resolve(testcaseName + "OptimizedQuery.txt")),
                    StandardCharsets.UTF_8);
            testFileContentsEqual(results, testcaseName + "Query_optimized.txt");
        } catch (IOException e) {
            e.printStackTrace();
            assert false;
        }
    }
}
