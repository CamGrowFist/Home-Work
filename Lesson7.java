import java.util.Arrays;

//задание 1
public class Lesson7 {
        public static void main(String[] args) {
        printThreeWords("Orange, Banana, Apple");
    }

        static void printThreeWords(String words) {
        System.out.println(words);
    }
}


//Задание 2
/*public class Lesson7 {
    public static void main(String[] args) {
        checkSumSing();
    }

    public static void checkSumSing() {
        int a = 5;
        int b = 5;
        if (a + b < 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }
    }
}*/


//задание 3
/*public class Lesson7 {
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = 1000;
        if (value <= 0 ) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}*/


//задание 4
/*public class Lesson7 {
    public static void main(String[] args) {
        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}*/


//задание 5
/*public class Lesson7 {
    public static void main(String[] args) {
        System.out.println(rs(20,5));
    }

    static boolean rs(int a,int b) {
        return 10 <= (a + b) && (a + b) <= 20;

    }
}*/


//задание 6
/*public class Lesson7 {
    public static void main(String[] args) {
        rs(-1);
    }

    public static void rs(int a) {
        if (a < 0 ) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
}*/


//задание 7
/*public class Lesson7 {
    public static void main(String[] args) {
        System.out.println(rs(0));
    }

    static boolean rs(int a) {
        return a < 0;
    }
}*/


//задание 8
/*public class Lesson7 {
    public static void main(String[] args) {
        rs("q", 10);
    }

    public static void rs(String i, int j) {
        String ar = "";
        for (int a = 0; a < j; ++a) {
            ar += i;
            System.out.println(i);
        }
    }
}*/


//задание 9
/*public class Lesson7 {
    public static void main(String[] args) {
        System.out.println(rs(1700));
    }

    static boolean rs(int a) {
        return (a % 4 == 0 && a % 100 != 0 || a % 400 == 0);
    }
}*/


//задание 10
/*public class Lesson7 {
    public static void main(String[] args) {
        int[] numb = {1, 0, 1, 1, 0, 0, 0, 1, 0, 1};
        for (int i=0;i<10;i++){
            if (numb[i] == 0) {
                numb[i] = 1;
            } else {
                numb[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numb));
    }
}*/


//задание 11
/*public class Lesson7 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; ++i ) {
            arr [i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}*/


//задание 12
/*public class Lesson7 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}*/


//задание 13
/*public class Lesson7 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}*/


//задание 14
/*public class Lesson7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(met(10, 5)));
    }

    public static int[] met(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}*/