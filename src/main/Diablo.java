package main;//Д/з классы - обьекты //Ctrl + ALT + L - выравнивание кода

import inventory.Arrows;
import inventory.ItemType;
import inventory.Weapon;
import unit.Enemy;
import unit.Hero;

public class Diablo {

    private static Object Arrows;
    private static Object Weapon;

    public static void main(String[] args) {
        Hero boris = new Hero("Boris", "Warrior");
        Hero ivan = new Hero ("Ivan", "Mage");
        Enemy fallen = new Enemy("Падший", "Резчик", 5, 5, 0);
        Enemy diablo = new Enemy("Demon", "Воплощение ужаса", 1000, 1000, 1000); //Переменные с маленькой буквы


        /**boris.attackMelee(fallen);
        boris.attackMelee(fallen);
        boris.attackMelee(boris);
        System.out.println(boris.getHealth());
        //System.out.println(fallen.getHealth());
        boris.spellHealth(boris);
        System.out.println(boris.getHealth());
        System.out.println(boris.getEnergy());
         */
        ivan.move(0,0);
        diablo.move(3,4);
    }

}





