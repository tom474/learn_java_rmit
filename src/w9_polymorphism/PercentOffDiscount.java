package w9_polymorphism;

public class PercentOffDiscount extends Discount{
    private int percent;

    public PercentOffDiscount(String code, int percent) {
        super(code);
        this.percent = percent;
    }

    @Override
    public double calculateDiscountedAmount(double sum) {
        return sum * (100 - percent) / 100;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
