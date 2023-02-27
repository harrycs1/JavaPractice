public class classGaugeMain {
    public static void main(String[] args) {
        classGauge gauge = new classGauge();

        while (!gauge.full()) {
            System.out.println("Not full! Value: " + gauge.value());
            gauge.increase();
        }

        System.out.println("Full! Value: " + gauge.value());
    }
}
