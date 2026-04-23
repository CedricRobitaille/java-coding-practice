
import java.util.Stack;

 
// Concept:
// Simple function that accepts a string, and returns if the string is valid or not.
// The string can only contain 1 of 6 characters
// Characters are: (){}[]

// Every bracket must start with an open, and a closing bracket for the pair must be present later.
// [()()] - valid
// [(]()] - invalid

// Notes:
// Function solution(a)
// a = input string
// return 1 if correctly nested
// return 0 otherwise


 public class Main {

  public static void main(String[] args) {
      String inputString = "{(())}";
      System.out.println(solution(inputString));

      inputString = "{(()}";
      System.out.println(solution(inputString));
  }

  public static int solution(String a) {
    char[] charArr = a.toCharArray();

    Stack<Character> openStack = new Stack();

    for (Character c : charArr) {
      if (c == '[' || c == '{' || c == '(') {
        openStack.push(c);
      } else if (c == ']') {
        if (openStack.isEmpty() || openStack.pop() != '[') return -1;
      } else if (c == '}') {
        if (openStack.isEmpty() || openStack.pop() != '{') return -1;
      } else if (c == ')') {
        if (openStack.isEmpty() || openStack.pop() != '(') return -1;
      } else {
        return -1;
      }
    }
    return openStack.isEmpty() ? 1 : -1;
  }
 }
