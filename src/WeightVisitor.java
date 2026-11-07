
public class WeightVisitor implements ItemVisitor {
    private double totalWeight = 0;

    @Override
    public void visitWeapon(Weapon weapon) {
        System.out.println("Weapon: " + weapon.getName()
                + " - " + weapon.getWeight() + " kg");
        totalWeight += weapon.getWeight();
    }

    @Override
    public void visitArmor(Armor armor) {
        System.out.println("Armor: " + armor.getName()
                + " - " + armor.getWeight() + " kg");
        totalWeight += armor.getWeight();
    }

    @Override
    public void visitPotion(Potion potion) {
        System.out.println("Potion: " + potion.getName()
                + " - " + potion.getWeight() + " kg");
        totalWeight += potion.getWeight();
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
