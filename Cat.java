import java.util.Scanner;

public class Cat extends Animal {

    private int hungry;
    private static int sumCat = 0;
    private int bowlMeal = 5;

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

    void eatCat () {
        if (bowlMeal < hungry) {
            for (int i = bowlMeal;i < hungry ; i++) {
                i = bowlMeal + fillBowlCat();
                if (i > hungry)
                    continue;
                System.out.println("Добавьте еще: ");
            }
        } else {
            bowlMeal = bowlMeal - hungry;
            System.out.print("Кот поел");
        }
    }
    
    int fillBowlCat () {
        System.out.println("Кот голоден");
        Scanner fillBowl = new Scanner(System.in);
        System.out.println("Сколько хотите положить корма (целые числа): ");
        int bowl = bowlMeal + fillBowl.nextInt();
        return bowl;
    }
    
    void catActivity() {
        runCat();
        swimCat();
        eatCat();
    }
    
    
     
   static void catsArray () {
         Cat[] cats = new Cat[] {new Cat("Барсик", 150, 1, 10),new Cat("Мурзик", 200, 0, 5)};
         cats[0].catActivity();
         cats[1].catActivity();
     }
    
    static void catInfo() {
        catsArray();
        System.out.println("\nКотов: " + sumCat);
    }
}

