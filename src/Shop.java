import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shop {

    private final HashMap<String, Gifts> gifts;
    private String[] cart;
    private double total = 0.0;
    private int numOfGifts = 0;
    private String names;
    public Shop() {
        gifts = new HashMap<>();
    }

    public void addGift(String type, String name, int price) {
        gifts.put(name.toLowerCase(), new Gifts(name, type, price));
    }

    public void displayGifts() {
        System.out.println("Gift Shop");
        int index = 0;
        for(Map.Entry<String, Gifts> entry : gifts.entrySet()) {
            System.out.println(++index+ ") " + entry.getValue().name + " :- " + entry.getValue().price);
        }
    }

    public void getInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of gifts you wish to add: ");
            numOfGifts = scanner.nextInt();
            if (numOfGifts <= 0) {
                throw new Exception("Number of gifts must be greater than 0");
            }
            System.out.println("Enter the gift name you wish to add: ");
            scanner.nextLine();
            names = scanner.nextLine();
            if(names.isEmpty()) {
                throw new Exception("Choice cannot be empty");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public void validateGifts() {
        names = names.replaceAll("\\s+", "");
        cart = names.split(",");
    }

    public void displayBill() {
        System.out.println("Total Bill: Rs. " + total);
    }

    public void generateBill() {
        total += calculateGst() - getDiscount();
    }

    public double calculateGst() {
        return total*0.05;
    }

    public double getDiscount() {
        return total >= 2500 ? (total*.10) : 0;
    }

    public void calculateTotal() {
        try {
            if (cart.length != numOfGifts) {
                throw new Exception("Number of gifts must be " + numOfGifts);
            }
            for (String gift : cart) {
                Gifts g = gifts.get(gift.toLowerCase());
                if (g == null) {
                    throw new Exception("Gift " + gift + " is not found");
                }
                total += g.price;
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public void startShopping() {

        displayGifts();
        getInput();
        validateGifts();
        calculateTotal();
        generateBill();
        displayBill();

    }
}
