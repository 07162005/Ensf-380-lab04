package edu.ucalgary.oop;

public class Rider {
    private String riderName;
    private int riderRegNumber;
    private int age;
    
    public Rider() { }
            
    public Rider(String riderName, int riderRegNumber, int age) {
        this.riderName = riderName;
        this.riderRegNumber = riderRegNumber;
        this.age = age;
    }
    
    public Rider(Rider other) {
        this.riderName = other.riderName;
        this.riderRegNumber = other.riderRegNumber;
        this.age = other.age;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }
    
    public void setRiderRegNumber(int riderRegNumber) {
        this.riderRegNumber = riderRegNumber;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getRiderName() {
        return riderName;
    }

    public int getRiderRegNumber() {
        return riderRegNumber;
    }

    public int getAge() {
        return age;
    }
}