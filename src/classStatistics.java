public class classStatistics {
    private int count;
    private int sum;

    // constructor
    public classStatistics() {
        this.count = 0;
    }

    // addNumber() method
    public void addNumber(int number) {
        this.sum += number;
        this.count++;
    }

    // getCount() method
    public int getCount() {
        return this.count;
    }

    // sum() method
    public int sum() {
       return this.sum;
    }

    // average() method
    public double average() {
        return 1.0 * sum()/getCount();
    }
}
