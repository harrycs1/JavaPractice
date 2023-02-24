public class methodsParameters {
    public static void main(String[] args) {
        printUntilNumber(5);
    }
    
    public static void printUntilNumber(int maxNumber) {
        int i = 1;
        while (i <= maxNumber) {
            System.out.println(i);
            i++;
        }
    }
}
