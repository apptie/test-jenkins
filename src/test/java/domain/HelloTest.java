package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloTest {

    Hello hello;

    @BeforeEach
    void setUp() {
        hello = new Hello();
    }

    @Test
    void hello() {
        assertEquals(hello.hello(), "hello");
    }

    @Test
    void hi() {
        assertEquals(hello.hi(), "hi");
    }
}
