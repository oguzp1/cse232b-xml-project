import org.junit.jupiter.api.Test;

public class TestMS2Examples extends BaseTest {
    @Test
    public void testFindActSceneSpeaker() {
        testQuery("MS2FindActSceneSpeaker");
    }

    @Test
    public void testFindActSpeakerGroupBy() {
        testQuery("MS2FindActSpeakerGroupBy");
    }
}
