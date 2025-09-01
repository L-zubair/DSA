import java.util.Deque;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses{
    public boolean isValid(String s) {
        // 1) Quick reject: odd length can't be fully paired
        if (s.length() % 2 == 1) return false;

        // 2) Map each closing bracket to its matching opening bracket
        Map<Character, Character> match = new HashMap<>();
        match.put(')', '(');
        match.put(']', '[');
        match.put('}', '{');

        // 3) Stack to store opening brackets as we scan
        Deque<Character> stack = new ArrayDeque<>();

        // 4) Scan characters left to right
        for (char ch : s.toCharArray()) {

            // 4a) If it's an opening bracket, push it
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                // 4b) It's a closing bracket:
                //     - stack must not be empty
                //     - top must match the required opening bracket
                if (stack.isEmpty() || stack.peek() != match.get(ch)) {
                    return false;
                }
                stack.pop(); // matched pair removed
            }
        }

        // 5) Valid only if no unmatched openings remain
        return stack.isEmpty();
    }

    // (Optional) quick local test
    public static void main(String[] args) {
        ValidParentheses sol = new ValidParentheses();
        System.out.println(sol.isValid("()"));       // true
        System.out.println(sol.isValid("()[]{}"));   // true
        System.out.println(sol.isValid("(]"));       // false
        System.out.println(sol.isValid("([])"));     // true
        System.out.println(sol.isValid("([)]"));     // false
    }
}
