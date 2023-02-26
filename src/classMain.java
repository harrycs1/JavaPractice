public class classMain {
    public static void main(String[] args) {
        // the "static" modifier above indicates that this method does not belong to an object
        // --------
        classPerson ada = new classPerson("Ada");
        ada.printPerson();
        ada.growOlder();
        ada.printPerson();

        // --------
        classProduct banana = new classProduct("Banana", 1.1, 13);
        banana.printProduct();

        // --------
        classDebt mortgage = new classDebt(120000.0, 1.01);
        mortgage.printBalance();
        mortgage.waitOneYear();
        mortgage.printBalance();
    }
}
