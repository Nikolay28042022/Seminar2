public class Plate {
    private int food;

    public Plate(int food) {
        this.food = Math.max(0, food); // Отрицательное количество еды не допускается
    }

    public void info() {
        System.out.println("Тарелка: " + food);
    }

    public void decreaseFood(int amount) {
        food = Math.max(0, food - amount); // Не допускаем отрицательное количество еды
    }

    public void addFood(int amount) {
        food += Math.max(0, amount); // Не допускаем добавление отрицательного количества еды
        System.out.println("В тарелку добавлено " + amount + " еды.");
    }

    public int getFood() {
        return food;
    }
}

