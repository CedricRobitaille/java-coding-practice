// Input array containing n items
// look for the pivot point that divides the array in 2
// The array is divided into 2 parts at the pivot point.
// The pivot point is considered being a part of the later part.

// The goal:
// Find the pivot point where there difference between the 2 parts are at a minimum.

// Notes:
// Write a function named solution(int[] a)
// Return the abs difference, where difference between left and right (split at P) is at a minimum.



public class Main {
  
  public static void main(String[] args) {
    int[] testArr = {5,2,3,6,1,2};
    solution(testArr);
  }

  public static int solution(int[] a) {
      return a[0];
  }
}