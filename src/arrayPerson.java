public class arrayPerson {
    private String name;
    private int age;
    private int weight;
    private int height;

    // mulitple constructor parameters:
    public arrayPerson(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }
    // in this case, an object is created by calling the two-parameter constructor

    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
