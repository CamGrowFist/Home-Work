public class Main {
    public static void main(String[] args) {
        person();
        park();
        attraction();
    }
    public static void person(){
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Иванов Иван Иванович", "Менеджер", "ivanovi@mail.ru", "+79991112233", 50000, 25);
        personArray[1] = new Person("Сергеев Сергей Сергеевич", "Директор", "sergeys@mail.ru", "+79992225444", 105500, 45);
        personArray[2] = new Person("Дмитриев Дмитрий Дмитриевич", "Продавец", "dmitryd@mail.ru", "+79993338588", 35000, 21);
        personArray[3] = new Person("Беглая Анна Сергеевна", "Бухгалтер", "annad@mail.ru", "+79994449858", 45000, 38);
        personArray[4] = new Person("Юрьева Диана Юрьевна", "Заместитель", "dianayu@mail.ru", "+79995557465", 78000, 40);
        System.out.println(personArray[1].toInfoPerson());
    }
    public static void park () {
        Park[] parkArray = new Park[2];
        parkArray[0] = new Park("Кольцо", "Ул.Кольцевая 7");
        parkArray[1] = new Park("Верх", "Ул.Верховая 4");
        System.out.println(parkArray[0].toInfoPark());
    }
    public static void attraction () {
        Park.Attraction[] attractionArray = new Park.Attraction[2];
        attractionArray[0] = new Park.Attraction("Корабль", 14,150,"11:00 - 17:00", 250);
        attractionArray[1] = new Park.Attraction("Комната страха", 12, 130,"12:00 - 21:00", 300);
        System.out.println(attractionArray[1].toInfoAttraction());
    }
}
