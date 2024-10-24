public class Square implements Shape{

    private double length;
    private double width;


    public Square(double length,double width){
        this.length = length;
        this.width = width;
    }


    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
