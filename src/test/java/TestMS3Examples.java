import org.junit.jupiter.api.Test;

public class TestMS3Examples extends BaseTest {
    @Test
    public void testImplicitJoin1() {
        testRewrite("MS3ImplicitJoin1");
    }

    @Test
    public void testImplicitJoin2() {
        testRewrite("MS3ImplicitJoin2");
    }

    @Test
    public void testImplicitJoin3() {
        testRewrite("MS3ImplicitJoin3");
    }

    @Test
    public void testExplicitJoin1() {
        testQuery("MS3ExplicitJoin1");
    }

    @Test
    public void testExplicitJoin2() {
        testQuery("MS3ExplicitJoin2");
    }

    @Test
    public void testExplicitJoin3() {
        testQuery("MS3ExplicitJoin3");
    }

    @Test
    public void testExplicitJoin4() {
        testQuery("MS3ExplicitJoin4");
    }

    @Test
    public void testEndToEndJoin1() {
        testRewrite("MS3EndToEndJoin1");
        testQuery("MS3EndToEndJoin1");
    }

    @Test
    public void testEndToEndJoin2() {
        testRewrite("MS3EndToEndJoin2");
        testQuery("MS3EndToEndJoin2");
    }

    @Test
    public void testEndToEndJoin3() {
        testRewrite("MS3EndToEndJoin3");
        testQuery("MS3EndToEndJoin3");
    }
}
