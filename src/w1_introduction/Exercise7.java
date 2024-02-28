package w1_introduction;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("Miles \t\t Kilometers");
        for(int i = 1; i < 10; i++){
            double kilometer = i * 1.61;
            System.out.printf(" %n %d \t\t\t %.2f", i, kilometer);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Kilometers \t Miles");
        for(int j = 20; j <= 65; j = j + 5){
            double miles = j * 0.62137119;
            System.out.printf(" %n %d \t\t %.2f", j, miles);
        }
    }
}
