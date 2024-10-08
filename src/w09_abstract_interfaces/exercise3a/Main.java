package w09_abstract_interfaces.exercise3a;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(2.5);
        System.out.println(myCircle);
        System.out.println(myCircle.getPerimeter());
        System.out.println(myCircle.getArea());

        Rectangle myRec = new Rectangle(4, 7);
        System.out.println(myRec);
        System.out.println(myRec.getPerimeter());
        System.out.println(myRec.getArea());
    }
}
