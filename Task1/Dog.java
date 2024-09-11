public class Dog extends Animal {
    static int sumDog = 0;

    public Dog(String name, int run, int swim) {
        super(name, run, swim);
        sumDog += 1;
    }

    public void runDog() {
        if (run <= 0) {
            System.out.println("Собака " + name + " не бегала");
        } else if (run > 0 && run <= 500) {
            System.out.println("Собака " + name + " пробежала " + run + " м");
        } else {
            System.out.println("Вы указали верные данные?");
        }
    }

    public void swimDog() {
        if (swim <= 0) {
            System.out.println("Собака " + name + " не плавала");
        } else if (swim > 0 && swim <= 10) {
            System.out.println(("Собака " + name + " проплыла " + swim + " м"));
        } else {
            System.out.println("Вы указали верные данные?");
        }
    }

    void dogsActivity() {
        runDog();
        swimDog();
    }

    static void dogInfo() {
        Dog[] dogs = new Dog[]{new Dog("Раф", 150, 1), new Dog("Гаф", 200, 0)};
        dogs[0].dogsActivity();
        dogs[1].dogsActivity();
        System.out.println("Собак: " + sumDog);
    }
}
