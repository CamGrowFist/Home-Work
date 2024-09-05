public class Park {
    String namePark;
    String adressPark;

    public Park(String namePark, String adressPark) {
        this.namePark = namePark;
        this.adressPark = adressPark;
    }

    public static class Attraction {
        public String nameAttraction;
        public int age;
        public int growth;
        public String workingHours;
        public int priceInRub;

        public Attraction(String nameAttraction, int age, int growth, String workingHours, int priceInRub)  {
            this.nameAttraction = nameAttraction;
            this.age = age;
            this.growth = growth;
            this.workingHours = workingHours;
            this.priceInRub = priceInRub;
        }
        public String toInfoAttraction() {
            return "\nНазвание аттракциона " + nameAttraction + "\nМинимальный возраст: " + age + "\nДопуйстимый рост: " + growth + "\nЧасы работы: " + workingHours + "\nЦена: " + priceInRub;
        }
    }
    public String toInfoPark() {
        return "\nНазвание парка: " + namePark + "\nАдрес парка: " + adressPark;
    }
}
