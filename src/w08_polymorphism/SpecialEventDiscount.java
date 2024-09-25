package w08_polymorphism;

public class SpecialEventDiscount extends Discount {
    private int value;

    public SpecialEventDiscount(String code, int value) {
        super(code);
        this.value = value;
    }

    @Override
    public double calculateDiscountedAmount(double sum) {
        double discountedAmount = sum * value / 100;
        if (discountedAmount > value) {
            return discountedAmount > sum ? 0: sum - discountedAmount;
        } else
            return value > sum ? 0: sum - value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
