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
        // Get hours via loop and branch
        String givehours = scanner.nextLine();
        while (!givehours.equalsIgnoreCase("y") && !givehours.equalsIgnoreCase("n")) {
            System.out.print("Will your coffee shop be open 24 hours? (y/n)");
            givehours = scanner.nextLine();
        }
        boolean hours = false; // Declare the boolean variable outside the if statement
        if (givehours.equalsIgnoreCase("y")) {
            hours = true;
        } else if (givehours.equalsIgnoreCase("n")) {
            hours = false;
        }

        // Display what we have
        System.out.println("\nGreat. Here's what we've collected so far.");
        // Display name and shop name
        System.out.println("\nYour name is " + name + " and you're opening " + shopname + "!");
        // Display the price of one cup of coffee formatted in a monetary format
        if (hours) {
            System.out.println("\nYour coffee shop will be open 24/7!");
        } else {
            System.out.println("\nYour coffee shop will only be open during the day.");
        }
        System.out.printf("Your first cup of coffee will sell for $%.2f.\n", price);

        scanner.close();
    }
}