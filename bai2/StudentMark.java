package bai2;

public class StudentMark {
    private String fullName;
    private double theoryMark; // thang diem 100
    private double practicalMark;// thang diem 100
    private double assignmentMark; // thang diem 10
    // Constructor
    public StudentMark(String fullName, double theoryMark, double practicalMark, double assignmentMark) {
        this.fullName = fullName;
        this.theoryMark = theoryMark;
        this.practicalMark = practicalMark;
        this.assignmentMark = assignmentMark;
    } 
    public String getFullName() {
        return fullName;
    }
    public double getTheoryMark() {
        return theoryMark;
    }
    public double getPracticalMark() {
        return practicalMark;
    }
    public double getAssignmentMark() {
        return assignmentMark;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setTheoryMark(double theoryMark) {
        this.theoryMark = theoryMark;
    }
    public void setPracticalMark(double practicalMark) {
        this.practicalMark = practicalMark;
    }
    public void setAssignmentMark(double assignmentMark) {
        this.assignmentMark = assignmentMark;
    }

    public void displayResult(double assignmentMark, double practicalMark, double theoryMark){
        this.assignmentMark = assignmentMark;
        this.practicalMark = practicalMark;
        this.theoryMark = theoryMark;
    }
    @Override
    public String toString() {
        return "StudentMark [fullName=" + fullName + ", theoryMark=" + theoryMark + ", practicalMark=" + practicalMark
                + ", assignmentMark=" + assignmentMark + "]";
    }
   
}

