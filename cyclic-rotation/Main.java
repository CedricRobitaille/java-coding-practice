
import java.util.Arrays;

// Problem:
// Input array where we need to preform a cyclic operation.
// Shift every element of the array to the right.
// The last element in the array should return to the beginning of the list.

// Each cycle is defined by K.
// K = 1 performs 1 cyclic rotation

// Goal:
// The function solution (a, k)
// This function reutns an array with contents rotated k times to the right.



public class Main {
  public static void main(String[] args) {
    int[] inputArr = {1,2,3,4,5};
    System.out.println(Arrays.toString(solution(inputArr, 3)));
  }

  public static int[] solution(int[] a, int k) {
    int[] cycledArr = {};
    return cycledArr;
  }
}