package Shapes;

public class Circle implements IShape {

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public float calculateArea(){
        return 3.14f * (radius * radius);
    }
    @Override
    public float calculatePerimeter(){
        return 2 * radius;
    }

}
