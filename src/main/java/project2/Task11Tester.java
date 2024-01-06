package project2;

public class Task11Tester {
    public static void main(String[] args) {
       double radius=2.0;
        Circle c=new Circle(radius);
        //c.calculateAria();
        System.out.println("circle aria: "+c.calculateAria());
        System.out.println("circle perimeter: "+c.calculatePerimeter());

        double sides=8.0;
        Square s=new Square(sides);
        System.out.println("Square aria: "+s.calculateAria());
        System.out.println("Square perimeter: "+s.calculatePerimeter());


    }
}
