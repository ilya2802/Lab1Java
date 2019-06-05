package lab1java;

public class Main {
    public static void main(String[] args) {
        Coupon coupon1 = new Coupon();
        Coupon coupon2 = new Coupon("Illya", 23, 7, 90);
        Coupon coupon3 = new Coupon("Illya", 23, 7, 90, "Mrs Svitlana", "Monday", 2, 608, "Petro Petrenko");
        System.out.println(coupon1.toString());
        System.out.println(coupon2.toString());
        System.out.println(coupon3.toString());
        coupon1.toString();
        coupon2.toString();
        coupon3.toString();
    }
}