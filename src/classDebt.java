public class classDebt {
    private double balance;
    private double interestRate;

    public classDebt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println("Balance: " + this.balance);
    }

    public void waitOneYear() {
        this.balance = this.balance * this.interestRate;
    }

    // if we want a method to return a value, we need to replace the "void" keyword with the type of the variable to be returned
    public int returnTen() {
        return 10;
    }
}
