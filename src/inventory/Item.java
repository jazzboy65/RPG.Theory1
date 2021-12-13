package inventory;

public class Item {
    private String name;
    private int price;
    private final ItemType type;

    public Item(String name, int price, ItemType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        this.type = ItemType.NONE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ItemType getType() {
        return type;
    }

}

