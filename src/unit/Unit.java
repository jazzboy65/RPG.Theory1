package unit;

import inventory.Inventory;

public abstract class Unit { //abstract - ключевое слово
    private int force;
    private int health;
    private int energy;
    private int radius;
    private int x;
    private int y;
    private Inventory inventory;


    public Unit(int force, int health, int energy, int radius) {
        this.force = force; //this - ссылка на текущий экземпляр класса
        this.health = health;
        this.energy = energy;
        this.radius = radius;
    }

    public Unit(int force, int health, int energy) {
        this(force, health, energy, 1);
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public boolean checkAttackAvailable(Unit target) {
        return true;
    }


    public void attackMelee(Unit target) { //Атака базовая, атака дальнобойная
        if (target == this) {
            return;
        }
        if (!checkAttackAvailable(target)) return; //! - Отрицание
        int dx = target.x - x; //CTRL + D - дупликация текущей строчки
        int dy = target.y - y;
        int distance = (int) Math.sqrt(dx * dx + dy * dy);
        if (distance <= radius) {
            target.health -= force;
        } else return;

        if (target.health < 0) {
            target.health = 0;
        }
        postAttack(target);
    }


    /**
     * public void bowShot(unit.Unit target) {
     * if (target == this) {
     * this.arrows -= 1;
     * return;
     * }
     * if (radius <= 90) {
     * target.health -= 2;
     * this.arrows -= 1;
     * } else return;
     * <p>
     * if (target.health <= 0) {
     * target.health = 0;
     * }
     * <p>
     * }
     */


    public void spellHealth() {
        this.health += 5;
        this.energy -= 5;

    }

    public void spellFireball(Unit target) {
        if (target == this) {
            return;
        }
        if (radius <= 90) {
            target.health -= 10;
            this.energy -= 10;
        } else return;
        if (target.health < 0) {
            target.health = 0;
        }
        postAttack(target);
    }

    public void healthBottle(Unit target) {
        if (target == this) {
            target.health += 20;
        } else return;
    }

    public void manaBottle(Unit target) {
        if (target == this) {
            target.energy += 20;
        } else return;
    }


    public abstract void postAttack(Unit target);

    public int getHealth() { //Возвращает текущее значение выбранного поля, "Getter"
        return health;

    }

    public void setEnergy(int energy) { //"Setter" - функция, которая устанавливает значение выбранного поля
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public Inventory getInventory() {
        return inventory;
    }

}
/**
 * "Getter" и "Setter" - контроль доступа к данным (Инкапсуляция)
 */