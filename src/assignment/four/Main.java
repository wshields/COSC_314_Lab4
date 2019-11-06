package assignment.four;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter an integer n: ");
        int input = key.nextInt();
        Permutation permute = new Permutation(input);
        String output = "";
        while(permute.hasMorePermutations()){
            int[] temp = permute.makePermutation();
            output += ", " + Arrays.toString(temp);
        }
        System.out.println("Permutations of the array 1 to n are: ");
        System.out.println(output);
    }
}
