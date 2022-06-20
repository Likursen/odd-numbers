import java.util.Random;

class Utils {

    public static int[] createRandomArray(int arraySize) {
        Random random = new Random();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = -50 + random.nextInt(100);
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("Source array:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printPositiveOddNumberCount(int[] array) {
        int positiveOddNumberCount = 0;
        for (int j : array) {
            if (j % 2 != 0 && j > 0)
                positiveOddNumberCount++;
        }
        System.out.println("Count of positive odd number: " + positiveOddNumberCount);
    }
}