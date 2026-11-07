public class Weapon implements Item {
    private String name;
    private int price;
    private double weight;

    public Weapon(String name, int price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visitWeapon(this);
    }
}