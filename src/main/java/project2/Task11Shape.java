package project2;
//Create an Interface 'Shape' with undefined methods as calculateArea and
//calculatePerimeter. Create 2 classes Circle & Square that implements
//functionality defined in the Shape Interface. Test your code
public interface Task11Shape {
  double calculateAria();

    double calculatePerimeter();
}
class Circle implements Task11Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public double calculateAria() {
        return Math.PI*radius*radius;

    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI*radius;
    }
}
class Square implements Task11Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateAria() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;

    }
}
