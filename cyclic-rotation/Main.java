
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
    int[] cycledArr = new int[a.length]; // create a new arr at the length of the arr.

    for (int i = 0; i < a.length; i++) {
      int newIndex = (i + k) % 5; // Get the new position this elem needs to move to
      cycledArr[newIndex] = a[i];
    }

    return cycledArr;
  }
}