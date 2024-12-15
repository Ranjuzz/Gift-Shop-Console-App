import java.util.*;

public class Main {
    public static void main(String[] args) {
        Shop Gold = new Shop();
        Gold.addGift("Premium","Ornaments",2000);
        Gold.addGift("Standard", "TeddyBear", 600);
        Gold.addGift("Standard","Chocolates",1000);
        Gold.addGift("Standard","Novel",800);
        Gold.addGift("Premium","PhotoFrame",1500);
        Gold.startShopping();
    }
}