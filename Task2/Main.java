public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Красный", "Черный");
        Rectangle rectangle = new Rectangle(4, 6, "Голубой", "Зеленый");
        Triangle triangle = new Triangle(3, 4, 5, "Желтый", "Фиолетовый");

        System.out.println("Круг:");
        System.out.println("Периметр: " + circle.getPerimeter());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Цвет заливки: " + circle.getFillColor());
        System.out.println("Цвет границ: " + circle.getBorderColor());

        System.out.println("\nПрямоугольник:");
        System.out.println("Периметр: " + rectangle.getPerimeter());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Цвет заливки: " + rectangle.getFillColor());
        System.out.println("Цвет границ: " + rectangle.getBorderColor());

        System.out.println("\nТреугольник:");
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Цвет заливки: " + triangle.getFillColor());
        System.out.println("Цвет границ: " + triangle.getBorderColor());
    }
}