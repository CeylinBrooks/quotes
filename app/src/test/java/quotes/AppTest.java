/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
//        App classUnderTest = new App();
//        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test
    public void JsonTest() throws IOException {
        boolean result = App.main();
        assertTrue(result);

    }
}
