
public class PriceVisitor implements ItemVisitor {
    private int totalPrice = 0;

    @Override
    public void visitWeapon(Weapon weapon) {
        System.out.println("Weapon: " + weapon.getName()
                + " - " + weapon.getPrice() + " Gold");
        totalPrice += weapon.getPrice();
    }

    @Override
    public void visitArmor(Armor armor) {
        System.out.println("Armor: " + armor.getName()
                + " - " + armor.getPrice() + " Gold");
        totalPrice += armor.getPrice();
    }

    @Override
    public void visitPotion(Potion potion) {
        System.out.println("Potion: " + potion.getName()
                + " - " + potion.getPrice() + " Gold");
        totalPrice += potion.getPrice();
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
