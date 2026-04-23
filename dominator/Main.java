
// Find the leader of the array.
// The leader must appear more than 50% of the time.

// Goal:
// Return the index of a leader
// If no leader, return -1

// Note:
// Function solution(a)
// a = [2,4,3,3,3,2,3]


public class Main {
  public static void main(String[] args) {
    int[] testInput = {2,4,3,3,2,3,3};
    System.out.println(solution(testInput));
  }

  public static int solution(int[] a) {
    int candidate = 0;
    int counter = 0;

    for (int elem : a) {
      if (counter == 0) {
        candidate = elem;
        counter = 1;
      } else if (candidate == elem) {
        counter ++;
      } else {
        counter--;
      }
    }
    int candidateTotal = 0;
    int index = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] == candidate) {
        candidateTotal++;
        index = i;
      }
    }

    if (candidateTotal > a.length/2.0) {
      return index;
    } else {
      return -1;
    }
  }
}