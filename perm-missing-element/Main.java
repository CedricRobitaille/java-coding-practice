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
    // Optimal solution
    // Add up all elems in the arr
    // Compare elems to factorial of expected size
    
    long arrSum = 0;
    for (int num: arr) {
      arrSum += num;
    }

    long maxNum = arr.length + 1;
    long expectedSum = (maxNum * (maxNum + 1) / 2);

    return (int) (expectedSum - arrSum);
  }
}