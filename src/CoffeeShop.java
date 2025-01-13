import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get name and shop name
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.print("What do you want to name your coffee shop? ");
        String shopname = scanner.nextLine();

        // Print response using the given name
        System.out.println("\nThanks, " + name + ". Let's set some initial pricing.");

        // Get initial price of a cup of coffee
        System.out.print("\nWhat do you want to charge per cup of coffee? ");
        double price = scanner.nextDouble();

        // Display what we have
        System.out.println("\nGreat. Here's what we've collected so far.");
        // Display name and shop name
        System.out.println("\nYour name is " + name + " and you're opening " + shopname + "!");
        // Display the price of one cup of coffee formatted in a monetary format
        System.out.printf("Your first cup of coffee will sell for $%.2f.\n", price);

        scanner.close();
    }
}