public class classStringRepresentation {
    private int age;
    private String name;

    // A preferred way to print an object is to define a method for the object that returns a "string representation" of the object
    // The method returning the string representation is always toString in Java.
    public String toString() {
        return this.name +", age " + this.age + " years";
    }
    // The toString method doesn't itself print anything but instead returns a string representation, which the calling method can execute for printing as needed
    
}
