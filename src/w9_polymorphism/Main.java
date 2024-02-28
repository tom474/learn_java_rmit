package w9_polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Item i1 = new Item("Chicken", 10.5);
        Item i2 = new Item("Beef", 8.5);
        Item i3 = new Item("Soup", 10);

        ArrayList<Booking> bookings = new ArrayList<Booking>();
        bookings.add(new Booking());
        bookings.add(new WesternBooking());
        bookings.add(new OtherBooking());
        for (Booking b: bookings){
            b.addItem(i1);
            b.addItem(i2);
            b.addItem(i3);
            // b.addDiscount(new PercentOffDiscount("GREAT", 50));
            // b.addDiscount(new VoucherDiscount("GREAT", 30));
            b.addDiscount(new SpecialEventDiscount("GREAT", 40));
            System.out.println(b.bookingSum());
            System.out.println("-----------");
        }
    }
}
