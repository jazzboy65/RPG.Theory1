package inventory;

public class Arrows extends Item{
    private int count;

    public Arrows(String name, int price) {
        super(name, price, ItemType.ARROWS);
        this.count = 30;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
