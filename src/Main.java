public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 5),
                new Cat("Мурзик", 8),
                new Cat("Том", 12)
        };

        Plate plate = new Plate(15);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        System.out.println("\nИнформация о сытости котов:");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + ": " + (cat.isSatiety() ? "сыт" : "голоден"));
        }

        // Добавим еду в тарелку
        plate.addFood(10);
        plate.info();
    }
}
