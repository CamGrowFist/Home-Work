public class Cat extends Animal {

    int hungry;
    static int sumCat = 0;
    int bowlMeal = 7;

    public Cat(String name, int run, int swim, int hungry) {
        super(name, run, swim);
        this.hungry = hungry;
        sumCat += 1;
    }

    public void runCat() {
        if (run <= 0) {
            System.out.println("Кот не бегал");
        } else if (run > 0 && run <= 200) {
            System.out.println("Кот " + name + " пробежал " + run + " м");
        } else {
            System.out.println("Вы указали верные данные?");
        }
    }

    public void swimCat() {
        System.out.println("Кот " + name + " не умеет плавать");
    }

    public void eatCat() {
        if (bowlMeal >= hungry) {
            bowlMeal = bowlMeal - hungry;
            System.out.println("Кот поел");
        } else {
            System.out.println("Кот голоден");
        }

    }

    static void catInfo() {
        Cat barsikCat = new Cat("Барсик", 150, 1, 10);
        Cat murzikCat = new Cat("Мурзик", 200, 0, 5);
        barsikCat.runCat();
        barsikCat.swimCat();
        barsikCat.eatCat();
        murzikCat.runCat();
        murzikCat.swimCat();
        murzikCat.eatCat();
        System.out.println("Котов: " + sumCat);
    }
}


