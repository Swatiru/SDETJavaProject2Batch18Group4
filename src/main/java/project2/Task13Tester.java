package project2;

public class Task13Tester {
    public static void main(String[] args) {
        Truck t=new Truck(2000,"black",2000);
        double sale =t.CalculateSalePrice();
        System.out.println("Truck price after sale_price: $"+sale);

        Seadan s=new Seadan(4000,"red",15);
        double sale2=s.CalculateSalePrice();
        System.out.println("Seadan price after sale_price: $"+sale2);
    }
}
