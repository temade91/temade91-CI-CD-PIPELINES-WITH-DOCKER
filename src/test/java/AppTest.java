package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testGetStatus() {
        App app = new App();
        String result = app.getStatus();
        assertEquals("OK", result);
    }
    
}
