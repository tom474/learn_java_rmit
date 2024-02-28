package w9_polymorphism;

public class WesternBooking extends Booking {
    private static final double TIP_PERCENT = 0.15;

    @Override
    public double bookingSum() {
        double sum = super.bookingSum();
        double tip = sum * TIP_PERCENT;
        return discount.calculateDiscountedAmount(sum) + tip;
    }
}
