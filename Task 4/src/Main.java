//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5.0);
        System.out.println("Arealet af cirklen er : " + circle.getArea());

        Shape square = new Square(3,6);
        System.out.println("Arealet af firkanten : " + square.getArea());

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);

        System.out.println(shapeBuilder.getTotalArea());
    }
}