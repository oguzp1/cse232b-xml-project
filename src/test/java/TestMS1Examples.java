import org.junit.jupiter.api.Test;

public class TestMS1Examples extends BaseTest {
    @Test
    public void testFindAllPersonsInPlay() {
        testQuery("MS1FindAllPersonsInPlay");
    }

    @Test
    public void testFindScenesCaesar() {
        testQuery("MS1FindScenesCaesar");
    }

    @Test
    public void testFindActsBrutusCaesar() {
        testQuery("MS1FindActsBrutusCaesar");
    }

    @Test
    public void testFindActsBrutusCaesar2() {
        testQuery("MS1FindActsBrutusCaesar2");
    }

    @Test
    public void testFindActsNoCaesar() {
        testQuery("MS1FindActsNoCaesar");
    }
}
