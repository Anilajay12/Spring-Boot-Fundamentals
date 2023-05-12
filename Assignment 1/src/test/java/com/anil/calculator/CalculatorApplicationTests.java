package com.anil.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CalculatorApplicationTests {

    @Autowired
    private AdditionService additionService;

    @Test
    void testAdditionClassDependency(){
        assertNotNull(additionService);
        assertEquals(5, additionService.add(2, 3));
        assertNotEquals(7, additionService.add(2, 4));
    }
}
