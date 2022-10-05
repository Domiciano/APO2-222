package model;

public class Circle implements Geometry{

    int radius = 10;

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

}
