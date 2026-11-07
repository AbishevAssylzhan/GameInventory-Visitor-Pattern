
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Item> inventory = new ArrayList<>();

        inventory.add(new Weapon("Sword", 500, 5.0));
        inventory.add(new Armor("Iron Armor", 800, 15.0));
        inventory.add(new Potion("Health Potion", 100, 1.0));

        PriceVisitor priceVisitor = new PriceVisitor();
        WeightVisitor weightVisitor = new WeightVisitor();
        DescriptionVisitor descriptionVisitor = new DescriptionVisitor();

        System.out.println("=== GAME INVENTORY ===");

        for (Item item : inventory) {
            System.out.println(item.getClass().getSimpleName());
        }

        System.out.println("\n=== PRICE CALCULATION ===");

        for (Item item : inventory) {
            item.accept(priceVisitor);
        }

        System.out.println("Total Price: "
                + priceVisitor.getTotalPrice() + " Gold");

        System.out.println("\n=== WEIGHT CALCULATION ===");

        for (Item item : inventory) {
            item.accept(weightVisitor);
        }

        System.out.println("Total Weight: "
                + weightVisitor.getTotalWeight() + " kg");

        System.out.println("\n=== ITEM DESCRIPTIONS ===");

        for (Item item : inventory) {
            item.accept(descriptionVisitor);
        }
    }
}
