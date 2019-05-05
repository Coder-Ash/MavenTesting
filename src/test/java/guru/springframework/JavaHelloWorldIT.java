package guru.springframework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by jt on 2018-12-14.
 */
public class JavaHelloWorldIT {

    @Test
    void myFauxIntegrationTest() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assertEquals("Hello World", javaHelloWorld.getHello());

    }
}
