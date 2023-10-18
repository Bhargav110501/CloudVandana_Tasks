// 1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {
    public static int[] shuffleArray(int[] arr) {
        int[] shuffledArray = Arrays.copyOf(arr, arr.length);
        Random random = new Random();

        for (int i = shuffledArray.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = shuffledArray[i];
            shuffledArray[i] = shuffledArray[j];
            shuffledArray[j] = temp;
        }

        return shuffledArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        int[] shuffledArray = shuffleArray(ar);

        for (int i = 0; i < shuffledArray.length; i++) {
            System.out.print(shuffledArray[i] + " ");
        }
        sc.close();
    }
}
