package w9_polymorphism;

public class OtherBooking extends Booking {
    private static final double MAX_PERCENT = 0.1;

    @Override
    public double bookingSum() {
        double sum = super.bookingSum();
        double tip = sum * MAX_PERCENT * Math.random();
        return discount.calculateDiscountedAmount(sum) + tip;
    }
}
