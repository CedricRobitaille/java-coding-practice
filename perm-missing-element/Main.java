import java.util.Arrays;


// Given a list of numbers starting from 1
// In this list we have a missing element

// The aim:
// find the missing number

// Note: 
// the numbers are not in order

// Given:
// An array of size 'N'
// Between [1, n+1]

// Ie:
// [2,3,1,5]
// n = 4
// range = [1,5]

public class Main {

  public static void main(String[] args) {
      int[] arr = {3,2,1,5};
      int result = solution(arr);
      System.out.println(result);
  }

  public static int solution(int[] arr) {
    var sortedArr = arr;
    int missingElem = 0;
    Arrays.sort(sortedArr);
    for (int i = 0; i < sortedArr.length; i++) {
        if (sortedArr[i] != i+1) {
          missingElem = i;
          break;
        }
    }
    return missingElem;
  }
}