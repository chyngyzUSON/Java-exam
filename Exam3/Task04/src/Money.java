public class Money implements Purchase{
    private String currency;
    private int value;

    public Money(String currency, int value) {
        this.currency = currency;
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void buy() {
        System.out.println("Покупаем ");
    }

    @Override
    public String toString() {
        return "Время расплачиваться, вытаскивай деньги из кармана";
    }
}
