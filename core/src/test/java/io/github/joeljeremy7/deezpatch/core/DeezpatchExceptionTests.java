package io.github.joeljeremy7.deezpatch.core;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeezpatchExceptionTests {
    @Nested
    class Constructors {
        @Test
        @DisplayName("should set exception message")
        void test1() {
            DeezpatchException ex = 
                new DeezpatchException("My message");
            assertEquals("My message", ex.getMessage());
        }

        @Test
        @DisplayName("should set exception message and cause")
        void test2() {
            Throwable cause = new RuntimeException();
            DeezpatchException ex = 
                new DeezpatchException("My message", cause);
            assertEquals("My message", ex.getMessage());
            assertEquals(cause, ex.getCause());
        }
    }
}
