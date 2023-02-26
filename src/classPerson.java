// a class defines the attributes and behaviours of objects that are created from it
// lets create an object called classPerson
// each object has a name and an age

public class classPerson {
    // specify that each objected created from the classPerson class has a name and an age
    // variables defined inside a class are called instance variables, or object fields, or object attributes
    // each variable is preceded by the word "private", meaning the variables are hidden inside the object
        // this is known as encapsulation
    private String name;
    private int age;

    // now each new classPerson object has the variables name and age
    // the state of a person consists of the values assigned to their name and age

    // define the method that creates the object, i.e. its constructor.
    // the constructor is defined after the instance variables:
    public classPerson(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    // the constructor sets the age of the object being created to 0, and the string passed to the constructor as a parameter as its name
    // the constructors name is always the same as the class name

    // how to create methods for an object
    // a method is a named section of source code inside a class which can be invoked
    // a method is written inside of the class, beneath the constructor
    // the method name is preceded by "public void", since the method is intended to be visible to the outside world, and does not return a value


    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        this.age++;
    }

    public int returnAge() {
        return this.age;
    }
    
}
