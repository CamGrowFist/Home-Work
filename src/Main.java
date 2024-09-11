public class Main {

    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"},{"9", "10", "11", "12"}};

        try {
            int result = sumArrayElements(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива не соответствует 4x4");
        } catch (MyArrayDataException e) {
            System.out.println("Неверные данные в ячейке: " + e.getRow() + ", " + e.getColumn());
        }
    }

    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}