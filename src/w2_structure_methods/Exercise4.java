package w2_structure_methods;

public class Exercise4 {
    public static void shareMoney(double money) {
        double moneyPaid = Math.floor(money * 100 / 3) / 100;
        System.out.println(moneyPaid);

        int intMoney = (int) (money * 100);
        int remainder = intMoney % 3;

        if (remainder == 0){
            System.out.printf("Each person has to pay: %.2f ", moneyPaid);
        }

        if (remainder == 1){
            System.out.printf("You and your friend pay: %.2f, the other friend pays %.2f"
                    ,moneyPaid, moneyPaid + 1 / 100.0);
        }

        if (remainder == 2) {
            System.out.printf("You pay: %.2f, the other friend pays %.2f", moneyPaid, moneyPaid + 1 / 100.0);
        }
    }

    public static void main(String[] args) {
        shareMoney(10);
    }
}
