
import java.util.Arrays;

// Problem:
// Given 2 inputs:
// n - size of our counters
// a - list of instructions to perform on the counters

// Instructions:
// increase[n] - Increase counter at index n by 1
// max counter - Set all counters to the highest value of all counters
// Given... n = 3,  [1,2,3,4]
// 1 - 3 = counters to increase
// 4 = max counter

// Goal:
// Return the final list of counters where all the instructions have been peformed.

// Note:
// Function solution (n, a)
// Return [] with counter results

// CPU = O(n + m)
// MEM = O(n)

public class Main {
  public static void main(String[] args) {
    int[] testArr = {1,1,3,5,1};
    System.out.println(Arrays.toString(solution(4, testArr)));
  }

  public static int[] solution(int n, int[] a) {
    int[] counters = new int[n];


    return counters;
  }
}