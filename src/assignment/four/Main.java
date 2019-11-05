package assignment.four;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter an integer n: ");
        int input = key.nextInt();
        int[] arr = makeArray(input);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] makeArray(int x) {
        int[] retArray = new int[x];
        int num = 1;
        for(int i = 0; i < retArray.length; i++) {
            retArray[i] = num;
            num ++;
        }
        return retArray;
    }

    public static void permute(int[] array) {
        
    }
}
