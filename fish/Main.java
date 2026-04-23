
import java.util.Stack;



// Problem:
// You have a line of fish
// Each fish have varying directions (L/R), and sizes.
// If a fish meets another fish, and is bigger, it eats the smaller fish.
// The aim is to find out how many fish survive.

// Rules:
// Fish swimming left = 0
// Fish swimming right = 1
// First input is an array of directions [0,1,1,0,0]
// Second input is an array of sizes [6,2,3,2,7]

// Note:
// Function solution(a, b)
// a is an array of directions
// b is an array of sizes
// Should return an int of remaining fish.

// CPU: O(n)
// MEM: O(n)

public class Main {
  public static void main(String[] args) {
    int[] inputDirections = {0,0,1,1,0,1};
    int[] inputSizes = {1,1,2,1,5,1};
    System.out.println(solution(inputDirections, inputSizes));
  }

  public static int solution(int[] a, int[] b) {
    Stack<Integer> attackingFish = new Stack();
    int safeFish = 0;

    for (int i = 0; i < a.length; i++) {
      int direction = a[i];
      int size = b[i];

      int attackingQty = attackingFish.size();

      if (direction == 0) {
        boolean survived = true;
        for (int y = 0; y < attackingQty; y++) {
          int storedFish = attackingFish.peek();
          int attackingSize = b[storedFish];

          if (attackingSize < size) {
            attackingFish.pop();
          } else {
            survived = false;
            break;
          }
        }
        if (survived) {
          safeFish++;
        }
      } else {
        attackingFish.push(i);
      }
    }
    return attackingFish.size() + safeFish;
  }
}