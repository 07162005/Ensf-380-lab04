public class Rider {
    private String name;
    private int id;
    private int age;
    
    // Regular constructor
    public Rider(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    
    // Copy constructor
    public Rider(Rider other) {
        this.name = other.name;
        this.id = other.id;
        this.age = other.age;
    }
    
    public String getRiderName() { return name; }
    public void setRiderName(String name) { this.name = name; }
    public int getRiderId() { return id; }
    public void setRiderId(int id) { this.id = id; }
    public int getRiderAge() { return age; }
    public void setRiderAge(int age) { this.age = age; }
}