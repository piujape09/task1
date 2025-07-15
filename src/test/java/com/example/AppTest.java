package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void testApp() {
        String os = System.getProperty("os.name");
        String javaVersion = System.getProperty("java.version");

        System.out.println("Running on OS: " + os);
        System.out.println("Using Java version: " + javaVersion);

        assertTrue(os != null && javaVersion != null);
    }
}
