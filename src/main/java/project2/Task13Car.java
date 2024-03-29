package project2;
//Create a Class Car that would have the following fields: carPrice and color
//and method calculateSalePrice() which should be returning a price of the car.
//Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own
// implementation of calculateSalePrice() method in which
//returned price is calculated as following: if weight>2000 then returned price
//car should include 10% discount, otherwise 20% discount.
//The Sedan class has field as length and also does it is own implementation
//of calculateSalePrice(): if length of sedan is >20 feet then returned car price
//should include 5% discount, otherwise 10% discount

public abstract class Task13Car {
    private double carPrice;
    private String color;

    public Task13Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double getCarPrice(){
       return carPrice;
    }
        public abstract double CalculateSalePrice();
    }
     class Truck extends Task13Car{
         private double weight;

        public Truck(double carPrice, String color,double weight) {
            super(carPrice, color);
            this.weight=weight;
        }

        @Override
        public double CalculateSalePrice() {
            if (weight >= 2000) {
                return getCarPrice() - getCarPrice() * .10;
            } else {
                System.out.println("truck discount will be 20%");
            }
            return 0;
        }}
class Seadan extends Task13Car{
    private double length;

    public Seadan(double carPrice, String color,double length) {
        super(carPrice, color);
        this.length=length;
    }

    @Override
    public double CalculateSalePrice() {
        if (length <= 20) {
            return getCarPrice() - getCarPrice() * .005;
        } else {
            System.out.println("truck discount will be 20%");
        }
        return 0;

    }}









