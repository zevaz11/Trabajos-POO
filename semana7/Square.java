package Shapes;

public class Square implements IShape {
    private int side1, side2, side3, side4;
    public Square(int l1, int l2, int l3, int l4) {
        this.side1 = l1;
        this.side2 = l2;
        this.side3 = l3;
        this.side4 = l4;
    }
    @Override
    public float calculateArea() {
        return (side1 * side2);
    }
    @Override
    public  float calculatePerimeter(){
        return side1 + side2 + side3 + side4;
    }
}
