//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Animal {
    String name;
    int run;
    int swim;
    static int sumAnimals = 0;

    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        sumAnimals += 1;
    }

    public static void main(String[] args) {
        Cat.catInfo();
        Dog.dogInfo();
        System.out.println("Всего животных: " + sumAnimals);
    }
}
