package tddBase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnit5ExampleTest {

    @Test
    void justAnExample() {
        assertEquals("", Main.foo());
    }
}