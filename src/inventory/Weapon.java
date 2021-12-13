package inventory;

public class Weapon extends Item{
    private int damage;

    public Weapon(String name, int price, int damage) {
        super(name, price, ItemType.WEAPON);
        this.damage = damage;

    }

    public int getDamage() {
        return damage;
    }
}
