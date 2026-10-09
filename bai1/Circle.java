package bai1;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = 1.0;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
