package com.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void calculatesArea() {
        Square square = new Square(12);
        assertEquals(144,square.area());
    }

    @Test
    void calculatesPerimeter() {
        Square square = new Square(2);
        assertEquals(8,square.perimeter());
    }

    @Test
    void calculatesAreaHasSideZero() {
        Square square = new Square(0);
        assertEquals(0,square.area());
    }

    @Test
    void calculatesPerimeterHasSideZero() {
        Square square = new Square(0);
        assertEquals(0,square.perimeter());
    }
}