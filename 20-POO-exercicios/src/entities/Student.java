package entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double FinalGrade() {
        return grade1 + grade2 + grade3;
    }

    public String Status() {
        if (FinalGrade() < 60.0) {
            return "FAILED\nMISSING " + String.format("%.2f", 60.0 - FinalGrade()) + " POINTS";
        } else {
            return "PASS";
        }
    }
}
