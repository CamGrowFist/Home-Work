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

    static void dogInfo() {
        Dog rafDog = new Dog("Раф", 150, 1);
        Dog gafDog = new Dog("Гаф", 200, 0);
        rafDog.runDog();
        rafDog.swimDog();
        gafDog.runDog();
        gafDog.swimDog();
        System.out.println("Собак: " + sumDog);
    }
}
