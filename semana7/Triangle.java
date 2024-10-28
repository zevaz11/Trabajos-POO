package Shapes;

public class Triangle implements IShape {
    private int side1, side2, base;
    private int height;
    public Triangle(int side1, int side2, int base, int height) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.height = height;
    }
    @Override
    public float calculateArea(){
        return (float) (base * height) /2;
    }
    @Override
    public float calculatePerimeter(){
        return base + side1 + side2;
    }
}
