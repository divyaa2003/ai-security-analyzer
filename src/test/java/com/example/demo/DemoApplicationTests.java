package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoApplication.class)  // Explicitly specify the main application class
class DemoApplicationTests {

    @Test
    void contextLoads() {
        // This will test if the Spring Boot application context loads properly
    }

}
