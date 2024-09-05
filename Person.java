import java.util.Arrays;

public class Person {
    String fullName;
    String position;
    String email;
    String phone;
    int wages;
    int age;

   public Person(String fullName, String position, String email, String phone, int wages, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.wages = wages;
        this.age = age;
    }

    public String toInfoPerson() {
        return "ФИО: " + fullName + "\nДолжность: " + position + "\nЭл.почта: " + email + "\nТелефон: " + phone + "\nЗарплата: " + wages + "\nВозраст: " + age;
    }
}