public class Circle implements Shape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI *Math.pow(this.radius,2);
    }
}
