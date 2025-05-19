package com.models;

public class Square implements ClosedShape{
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side*side;
    }

    @Override
    public int perimeter() {
        return 2*2*side;
    }
}
