package unit;

import inventory.Arrows;
import inventory.Inventory;
import inventory.Item;
import inventory.ItemType;

import java.util.Optional;

public class RangeUnit extends Unit {


    public RangeUnit(int force, int health, int energy, int radius) {
        super(force, health, energy, radius);
    }

    private Optional<Arrows> findArrows() {
        //Optional это обёртка над обьектом, который реализует 2 состояния: обьект есть ИЛИ обьект пустой, вызывается Optional<>;

        Inventory inv = getInventory();
        for (int i = 0; i < inv.getSize(); i++) {
            if (inv.getItem(i).getType() == ItemType.ARROWS) {
                if (inv.getItem(i) instanceof Arrows) {
                    Arrows a = (Arrows) inv.getItem(i);
                    if (a.getCount() > 0) {
                        return Optional.of(a); //Возвращаем сам обьект
                    }
                }
            }
        }
        return Optional.empty(); //Возвращаем пустоту
    }

    @Override
    public boolean checkAttackAvailable(Unit target) {
        return findArrows().isPresent(); //Возвращает "true" если обьект есть
    }

    @Override
    public void postAttack(Unit target) {
        Optional<Arrows> a = findArrows(); //Generic'и...(
        if (a.isPresent()) {
            Arrows b = a.get(); //Получить сам обьект (в нашем случае Arrows)
            b.setCount(b.getCount() - 1);
            if (b.getCount() == 0) {
                getInventory().removeItem(b);
            }
        }
    }
}
