package com.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void CalculateArea() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(2, rectangle.area());
    }

    @Test
    void calculatesAreaHasZeroWidth() {
        Rectangle rectangle = new Rectangle(1, 0);
        assertEquals(0, rectangle.area());
    }

    @Test
    void calculatesAreaHasZeroLength() {
        Rectangle rectangle = new Rectangle(0, 2);
        assertEquals(0, rectangle.area());
    }

    @Test
    void calculatesPerimeter() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(10, rectangle.perimeter());
    }

    @Test
    void calculatesPerimeterHasZeroLength() {
        Rectangle rectangle = new Rectangle(0, 2);
        assertEquals(4, rectangle.perimeter());
    }

    @Test
    void calculatesPerimeterHasZeroWidth() {
        Rectangle rectangle = new Rectangle(2, 0);
        assertEquals(4, rectangle.perimeter());
    }
}