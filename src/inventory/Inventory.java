package inventory;



import java.util.ArrayList;

public class Inventory {
    private int gold;
    private ArrayList<Item> items;

    public Inventory() {
        this.gold = 100;
        this.items = new ArrayList<>();
    }

    public void addGold(int gold) {
        this.gold += gold;
    }

    public boolean addItem(Item item) {
        if (items.size() < 10) {
            this.items.add(item);
            return true;
        } else
            return false;
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public Item getItem(int index) { //Одеть - снять
        return items.get(index);
    }

    public int getSize() {
        return items.size(); //Метод "обёртка"
    }

}




