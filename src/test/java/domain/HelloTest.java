package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloTest {

    Hello hello = new Hello();

    @Test
    void testHello() {
        final String actual = this.hello.hello();

        assertEquals("hello", actual);
    }
}
