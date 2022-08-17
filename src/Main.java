public class Main {
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }

    public static void main(String[] args) {
        //System.out.println("Hello world!");

        // Задача 1
        int summa = 0;
        for (int j : arr) {
            summa = summa + j;
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");
        // Задача 2
        int wasteMin = arr[0];
        int wasteMax = arr[0];
        for (int j : arr) {
            if (j > wasteMax) {
                wasteMax = j;
            }
            if (j < wasteMin) {
                wasteMin = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + wasteMin + " рублей. Максимальная сумма трат за день составила " + wasteMax + " рублей");
        // Задача 3
        var sred = summa / 30;
        System.out.println("Средняя сумма трат за месяц составила " + sred + " рублей");
        // Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}



