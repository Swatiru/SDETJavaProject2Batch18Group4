package project2;

public abstract class Task12Marks {
    public abstract double getPercentage();
}

class StudentA extends Task12Marks {
    private double math;
    private double science;
    private double java;

    public StudentA(double math, double science, double java) {
        this.math = math;
        this.science = science;
        this.java = java;
    }

    @Override
    public double getPercentage() {
        return (math + science + java / 3);

    }
}
class StudentB extends Task12Marks{
    private double math;
    private double science;
    private double java;
    private double english;

    public StudentB(double math, double science, double java, double english) {
        this.math = math;
        this.science = science;
        this.java = java;
        this.english = english;
    }

    @Override
    public double getPercentage() {
        return (math+science+java+english/4);
    }
}


