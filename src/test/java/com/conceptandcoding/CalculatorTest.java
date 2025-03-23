package com.conceptandcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4,Calculator.add(2,2));
    }

    @Test
    @DisplayName("Subtract two numbers")
    void subtract() {
        assertEquals(3,Calculator.subtract(6,3));
    }
}