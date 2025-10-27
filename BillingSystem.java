// BillingSystem.java
import java.util.Scanner;

class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();
            total += price;
        }

        System.out.println("Total Bill = ₹" + total);
        System.out.println("GST (5%) = ₹" + total * 0.05);
        System.out.println("Final Amount = ₹" + (total * 1.05));
    }
}
