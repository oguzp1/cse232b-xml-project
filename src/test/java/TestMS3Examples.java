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
}
