package com.models;

public class Rectangle implements ClosedShape {

    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int area() {
        return length * width;
    }

    @Override
    public int perimeter() {
        return 2 * (length + width);
    }
}
