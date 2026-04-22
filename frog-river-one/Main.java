// Problem:
// Given an assorted array like [1,3,1,4,5,3,2,1]...
// Where the index of the array represents time, how long it will take for every int between 1 and n to appear.

// Notes:
// Will need function: solution(x, a)
// x is the size of the river
// a is the input list
// x and n have a limit of 100,000.
// If every int is not found, return -1

// Can be solved O(n)

public class Main {
  public static void main(String[] args) {
    int[] inputArr = {4,1,2,3,5,2};
    System.out.println(solution(5, inputArr));
  }

  public static int solution(int x, int[] a) {
    boolean[] arrStatus = new boolean[x+1];
    int foundCount = 0;

    for (int i = 0; i < a.length; i++) {
      if (!arrStatus[a[i]]) {
        foundCount ++;
        if (foundCount == x) {
          return i;
        }
        arrStatus[a[i]] = true;
      }
    }
    return -1;
  }
}