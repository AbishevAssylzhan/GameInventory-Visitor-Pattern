
public class DescriptionVisitor implements ItemVisitor {

    @Override
    public void visitWeapon(Weapon weapon) {
        System.out.println("Weapon: " + weapon.getName()
                + " is used for attacking enemies.");
    }

    @Override
    public void visitArmor(Armor armor) {
        System.out.println("Armor: " + armor.getName()
                + " protects the player.");
    }

    @Override
    public void visitPotion(Potion potion) {
        System.out.println("Potion: " + potion.getName()
                + " is a consumable item.");
    }
}
