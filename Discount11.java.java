import java.util.Scanner;

public class Discount {
    static void print(String line) {
        System.out.println(line);
    }

 public static void main(String[] args) {
        int price;
        int discount;

        Scanner sc = new Scanner(System.in);

        print("Enter price of the product :");
        price = sc.nextInt();

        print("Enter Discount of the product in %:");
        discount = sc.nextInt();

        int finalPrice =price-( (price * discount) / 100);

        print("Final price is " + finalPrice);
    }
}