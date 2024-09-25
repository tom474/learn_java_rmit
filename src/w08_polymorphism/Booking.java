package w08_polymorphism;

import java.util.ArrayList;

public class Booking {
    private ArrayList<Item> itemList;
    Discount discount;

    public Booking() {
        this.itemList = new ArrayList<Item>();
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public void addItem(Item i) {
        itemList.add(i);
    }

    public void addDiscount(Discount discount) {
        this.discount = discount;
    }
    public double bookingSum() {
        double sum = 0;
        for (Item i: itemList){
            sum += i.getPrice();
        }
        return sum;
    }
}
