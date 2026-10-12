package project;

public class Bill {



    private double discountRate;

    
    public Bill() {
        discountRate = 0.10;
    }

    
    public Bill(double discountRate) {
        this.discountRate = discountRate;
    }

    public void generateBill(Customer customer, Order order) {

        int total = order.getTotal();
        double discount = 0;

        if (total >= 500) {
            discount = total * discountRate;
        }

        double finalAmount = total - discount;

        System.out.println("\n===== HOTEL LAIBHARI BILL =====");

        customer.displayCustomer();

        System.out.println("Food Total: Rs. " + total);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Amount: Rs. " + finalAmount);

        System.out.println("===============================");
    }
}



