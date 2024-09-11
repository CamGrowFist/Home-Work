public class Cat extends Animal {

    private int hungry;
    private static int sumCat = 0;
    private int bowlMeal = 23;

    public Cat(String name, int run, int swim, int hungry) {
        super(name, run, swim);
        this.hungry = hungry;
        sumCat += 1;
    }

    void runCat() {
        if (run <= 0) {
            System.out.println("Кот не бегал");
        } else if (run > 0 && run <= 200) {
            System.out.println("Кот " + name + " пробежал " + run + " м");
        } else {
            System.out.println("Вы указали верные данные?");
        }
    }

    void swimCat() {
        System.out.println("Кот " + name + " не умеет плавать");
    }

    void catActivity() {
        runCat();
        swimCat();
        eatingCat();
    }

    public int meal() {
        return bowlMeal = 100;
    }

    public boolean hungryMeal() {
        return bowlMeal >= hungry;
    }

    void eatingCat() {
        if (!hungryMeal()) {
            System.out.println("Кот голоден.\nСейчас добавим еды");
            meal();
            int i = meal() - hungry;
            if (i == 0) {
                System.out.println("Кот поел. В миске не осталось еды");
            } else {
                System.out.println("Кот поел. В миске осталась еда");
            }
        } else {
            int a = bowlMeal - hungry;
            if (a == 0) {
                System.out.println("Кот поел. В миске не осталось еды");
            } else {
                System.out.println("Кот поел. В миске осталась еда");
            }
        }
    }

    static void catsArray() {
        Cat[] cats = new Cat[]{new Cat("Барсик", 150, 1, 24), new Cat("Мурзик", 200, 0, 12)};
        cats[0].catActivity();
        cats[1].catActivity();
    }

    static void catInfo() {
        catsArray();
        System.out.println("Котов: " + sumCat + "\n");
    }
}


