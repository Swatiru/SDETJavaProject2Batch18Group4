package project2;

public class Task12Tester {
    public static void main(String[] args) {
        StudentA a=new StudentA(70,75,80);
        StudentB b=new StudentB(69,70,80,78);
        double stuAPercentage=a.getPercentage();
        double stuBPercentage=b.getPercentage();
        System.out.println("Student A subjects percentage: "+stuAPercentage);
        System.out.println("Student A subjects percentage :"+stuBPercentage);
    }
}
