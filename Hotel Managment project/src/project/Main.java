package project;


import java.util.Scanner;

public class Main implements Hoteloperations {

    private Menu menu;
    private Customer customer;
    private Order order;
    private Bill bill;

    public Main() {
        menu = new Menu();
        bill = new Bill();
    }

    @Override
    public void displayMenu() {
        menu.displayMenu();
    }

    @Override
    public void placeOrder() {
        order = new Order(menu);
        order.placeOrder();
    }

    @Override
    public void generateBill() {
        bill.generateBill(customer, order);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Main hotel = new Main();

        try {
            System.out.print("Enter customer name: ");
            String name = sc.nextLine();

            System.out.print("Enter phone number: ");
            String phone = sc.nextLine();

            hotel.customer = new Customer(name, phone);

            hotel.displayMenu();
            hotel.placeOrder();
            hotel.generateBill();

        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        System.out.println("Thank you for visiting Hotel Laibhari!");

        sc.close();
    }



	}


