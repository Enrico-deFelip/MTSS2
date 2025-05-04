import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AppTest {
    
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertTrue("app should have a greeting", classUnderTest.getGreeting().length() > 0);
    }
}