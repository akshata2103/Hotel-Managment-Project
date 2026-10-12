package project;

public class Menu {



    private String[] foodItems = {
        "Misal Pav",
        "Paneer Thali",
        "Veg Biryani",
        "Tea"
    };

    private int[] prices = {80, 180, 150, 20};

    
    public Menu() {
        System.out.println("Welcome to Hotel Laibhari!");
    }

    
    public Menu(String[] foodItems, int[] prices) {
        this.foodItems = foodItems;
        this.prices = prices;
    }

    public void displayMenu() {

        System.out.println("\n===== FOOD MENU =====");

        for (int i = 0; i < foodItems.length; i++) {
            System.out.println(
                (i + 1) + ". " + foodItems[i]
                + " - Rs. " + prices[i]
            );
        }
    }

    public String getFoodItem(int index) {
        return foodItems[index];
    }

    public int getPrice(int index) {
        return prices[index];
    }

    public int getSize() {
        return foodItems.length;
    }
}



