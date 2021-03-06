package theory;

public class OOP {

/** Коммент для документации*
 * Принципы ООП:
 * 1) Наследование - принцип, который позволяет переиспользовать уже написанные части кода, создавая отношения между классами
 * родитель - потомок. Потомок - тот класс, который наследуется от родителя (базового класса). Меняешь что - то в базовом классе,
 * меняется логику и у потомков.
 *
 * Пример: class theory.Cat extends theory.Animal (класс Кот наследуется от класса Животные)
 * 2) Полиморфизм - принцип, "Много форм - один интерфейс взаимодействия". Сущностей много, но взаимодействовать можно
 * одинаково.
 *
 * Пример 1: машина может ехать или любой водитель знает как можно ехать. У всех машин в одном месте руль, колёса и т.д.
 * и по сути со всеми машинами можно взаимодействовать одинаково.
 *
 * Пример 2: cast (преобразование типов) theory.Animal animal = (theory.Animal) cat;
 *
 * Пример 3: тип ссылки, тип обьекта
 * формула: <Тип ссылки> <Название переменной> = new <Тип обьекта>();
 * кейс 1: theory.Cat cat  = new theory.Cat();
 * кейс 2: theory.Animal vasya = new theory.Cat(); ссылка - ячейка, на один обьект может быть несколько ссылок.
 *
 * 3) Инкапсуляция - принцип (в защитной оболочке), который позволяет организовать разные уровни доступа к данным и скрыть
 * реализацию для тех, кому она не интересна.
 *
 * Пример 1: есть часы, показывают время, и мы не знаем как они это делают, т.е. скрыта реализация.
 *
 * Ключевые слова: public, private, protected, default package (если ничего не ставить то будет default package)
 * protected - модификатор "защищён", доступ есть только у классов потомков и в классах, которые содержатся в этом пакете
 * private - видимость только в самом классе
 * public - видимость везде
 * метод "Помыть кошку" - чел даёт животное, например собаку значит не фартануло..., а если кошку то удача 100.
 *
  */
}
/**class Animal {
    public int age;
    public String name; //int - примитив (всегда создают свой экземпляр в памяти), String - это ссылка (с большой буквы)

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Animal(String name) {
        this.age = 1;
        this.name = name;
    }
}

class Cat extends Animal {

    public Cat(int age, String name) {
        super(age, name);
    }

    public Cat(String name) {
        super(name); //Super - вызывает базовый конструктор
    }
}

/** Final - финальное поле класса, а для класса - класс от которого нельзя наследоваться (Бесплодный класс)
 * Пример: функция вычисления квадрата (всегда константа)
 */

/**
 * ДЗ - Заклинания, Геттеры, Сеттеры, Дальность атаки (Лук)
 */



