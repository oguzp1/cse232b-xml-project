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
}
