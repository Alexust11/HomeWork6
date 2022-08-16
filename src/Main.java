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
        int Summa = 0;
        for (int i = 0; i < arr.length; i++) {
            Summa = Summa + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + Summa + " рублей");
        // Задача 2
        int WasteMin = arr[0];
        int WasteMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>WasteMax) {WasteMax=arr[i];}
            if (arr[i]<WasteMin) {WasteMin=arr[i];}
                }
             System.out.println("Минимальная сумма трат за день составила "+WasteMin+" рублей. Максимальная сумма трат за день составила "+WasteMax+" рублей");
        // Задача 3
             float sred=Summa/30;
            System.out.println("Средняя сумма трат за месяц составила "+sred+" рублей");
        // Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i=reverseFullName.length-1; i>=0; i--)  {System.out.print(reverseFullName[i]);}
        }
    }



