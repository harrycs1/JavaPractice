public class classGauge {
    private int value;

    public void increase() {
        if (value < 5) {
            value++;
        }
    }

    public void decrease() {
        while (value > 0) {
            value--;
        }
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        if (value == 5) {
            return true;
        } else {
            return false;
        }
    }
}
