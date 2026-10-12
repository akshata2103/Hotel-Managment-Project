package project;

import java.util.Scanner;

public class Order {

    private int total;
    private Menu menu;

    // Zero-parameter constructor
    public Order() {
        total = 0;
    }

    // Parameterized constructor
    public Order(Menu menu) {
        this.menu = menu;
        total = 0;
    }

    public void placeOrder() {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            menu.displayMenu();

            System.out.println("5. Finish Ordering");
            System.out.print("Select food item: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                    case 2:
                    case 3:
                    case 4:

                        System.out.print("Enter quantity: ");
                        int quantity =
                            Integer.parseInt(sc.nextLine());

                        if (quantity > 0) {
                            int amount =
                                menu.getPrice(choice - 1) * quantity;

                            total += amount;

                            System.out.println(
                                menu.getFoodItem(choice - 1)
                                + " added. Amount: Rs. " + amount
                            );
                        } else {
                            System.out.println(
                                "Quantity must be greater than zero."
                            );
                        }
                        break;

                    case 5:
                        System.out.println("Ordering completed.");
                        break;

                    default:
                        System.out.println("Invalid food choice.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }

        } while (choice != 5);
    }

    public int getTotal() {
        return total;
    }
}



