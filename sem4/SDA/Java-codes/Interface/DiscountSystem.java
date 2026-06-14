import java.util.Scanner;
public class DiscountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Discount Strategy Demo ===");
        System.out.print("Enter customer type (regular / premium / festival): ");
        String type = sc.nextLine();

        System.out.print("Enter total bill amount: ");
        double amount = sc.nextDouble();

        // Create a reference of interface type
        DiscountStrategy discount;

        // Decide which object to create at runtime
        switch (type) {
            case "regular":
                discount = new RegularCustomerDiscount();
                break;
            case "premium":
                discount = new PremiumCustomerDiscount();
                break;
            case "festival":
                discount = new FestivalDiscount();
                break;
            default:
                System.out.println("Invalid customer type!");
                return;
        }

        // Use the chosen strategy
        double finalBill = discount.applyDiscount(amount);
        System.out.printf("Final Bill after discount:" + finalBill);

    }
}