package model;

public class Square implements Geometry{

    int side = 10;

    @Override
    public double calculateArea() {
        return side*side;
    }
}
