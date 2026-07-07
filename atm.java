public class atm {
    private int pin;

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
}

class atmDriver {
    public static void main(String[] args) {
        atm a1 = new atm();

        a1.setPin(1234);
        System.out.println(a1.getPin());
    }
}