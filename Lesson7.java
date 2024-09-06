import java.util.Arrays;

public class Lesson7 {
        public static void main(String[] args) {
        //задание 1
        printThreeWords("Orange, Banana, Apple");
        //задание 2
        checkSumSing();
        //задание 3
        printColor();
        //задание 4
        compareNumbers();
        //задание 5
        System.out.println(rs(20,5));
        //задание 6
        cycle(-1);
        //задание 7
        System.out.println(cycleRs(0));
        //задание 8
        rsCycle("q", 10);
        //задание 9
        System.out.println(raidBoo(1700));
        //задание 10
        System.out.println(Arrays.toString(arrayCycle()));
        //задание 11
        System.out.println(Arrays.toString(arrArray()));
        //задание 12
        System.out.println(Arrays.toString(devArray()));
        //задание 13
        twoArray();
        //задание 14
        System.out.println(Arrays.toString(met(10, 5)));
    }

        //задание 1
        static void printThreeWords(String words) {
        System.out.println(words);
    }
        
        //Задание 2
        public static void checkSumSing() {
        int a = 5;
        int b = 5;
        if (a + b < 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }
    }
        
        //задание 3
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
        
        //задание 4
        public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
        
        //задание 5
        static boolean rs(int a,int b) {
        return 10 <= (a + b) && (a + b) <= 20;
    }
        
        //задание 6
        public static void cycle(int a) {
        if (a < 0 ) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
        
        //задание 7
        static boolean cycleRs(int a) {
        return a < 0;
    }
        
        //задание 8
        public static void rsCycle(String i, int j) {
        String ar = "";
        for (int a = 0; a < j; ++a) {
            ar += i;
            System.out.println(i);
        }
    }
        
        //задание 9
        static boolean raidBoo(int a) {
        return (a % 4 == 0 && a % 100 != 0 || a % 400 == 0);
    }
        
        //задание 10
        public static int[] arrayCycle() {
        int[] numb = {1, 0, 1, 1, 0, 0, 0, 1, 0, 1};
        for (int i=0;i<10;i++){
            if (numb[i] == 0) {
                numb[i] = 1;
            } else {
                numb[i] = 0;
            }
        }
        return numb;
    }
        
        //задание 11
        public static int[] arrArray() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; ++i ) {
            arr [i] = i + 1;
        }
        return arr;
    }
        
        //задание 12
        public static int[] devArray() {
        int[] arrDev = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (arrDev[i] < 6) {
                arrDev[i] = arrDev[i] * 2;
            }
        }
        return arrDev;
    }
        
        //задание 13
       public static void twoArray() {
       int[][] arrTwo = new int[5][5];
        for (int i = 0; i < arrTwo.length; i++) {
            for (int j = 0, x = arrTwo[i].length - 1; j < arrTwo[i].length; j++, x--) {
                if (i == j || i == x) {
                    arrTwo[i][j] = 1;
                } else {
                    arrTwo[i][j] = 0;
                }
                System.out.print(arrTwo[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
        //задание 14
        public static int[] met(int len, int initialValue) {
        int[] arrMet = new int[len];
        for (int i = 0; i < len; i++) {
            arrMet[i] = initialValue;
        }
        return arrMet;
    }
}                
