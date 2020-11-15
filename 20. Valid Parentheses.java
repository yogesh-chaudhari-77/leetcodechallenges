/*
20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Input: s = "()[]{}"
Output: true

Input: s = "([)]"
Output: false

Input: s = "{[]}"
Output: true

*/

class Solution {

  // Hash table that takes care of the mappings.
  private HashMap<Character, Character> mappings;

  // Initialize hash map with mappings. This simply makes the code easier to read.
  public Solution() {
    this.mappings = new HashMap<Character, Character>();
    this.mappings.put(')', '(');
    this.mappings.put('}', '{');
    this.mappings.put(']', '[');
  }

  public boolean isValid(String s) {

    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (this.mappings.containsKey(c)) {

        char topElement = stack.empty() ? '#' : stack.pop();

        if (topElement != this.mappings.get(c)) {
          return false;
        }
      } else {
        stack.push(c);
      }
    }
    
    return stack.isEmpty();
  }
}