package w08_polymorphism;

public class Discount {
    private String code;

    public Discount(String code) {
        this.code = code;
    }

    public double calculateDiscountedAmount(double sum) {
        return sum;
    }
}
