import java.util.Arrays;

public class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    int wages;
    int age;

    public Employee(String fullName, String position, String email, String phone, int wages, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.wages = wages;
        this.age = age;
    }

    public String toInfo() {
        return "ФИО: " + fullName + "\nДолжность: " + position + "\nЭл.почта: " + email + "\nТелефон: " + phone + "\nЗарплата: " + wages + "\nВозраст: " + age;
    }

    public static void main(String[] args) {
        Employee[] employyArray = new Employee[5];
        employyArray[0] = new Employee("Иванов Иван Иванович", "Менеджер", "ivanovi@mail.ru", "+79991112233", 50000, 25);
        employyArray[1] = new Employee("Сергеев Сергей Сергеевич", "Директор", "sergeys@mail.ru", "+79992225444", 105500, 45);
        employyArray[2] = new Employee("Дмитриев Дмитрий Дмитриевич", "Продавец", "dmitryd@mail.ru", "+79993338588", 35000, 21);
        employyArray[3] = new Employee("Беглая Анна Сергеевна", "Бухгалтер", "annad@mail.ru", "+79994449858", 45000, 38);
        employyArray[4] = new Employee("Юрьева Диана Юрьевна", "Заместитель", "dianayu@mail.ru", "+79995557465", 78000, 40);
        System.out.println(employyArray[4].toInfo());
    }
}