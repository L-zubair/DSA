public class RomanToInteger{
    // Map a single Roman symbol to its integer value
    private int val(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:  return 0; // input is guaranteed valid, so this won't hit
        }
    }

    // Convert Roman numeral string to integer
    public int romanToInt(String s) {
        int total = 0;                       // running sum
        for (int i = 0; i < s.length(); i++) {
            int curr = val(s.charAt(i));     // value of current symbol
            int next = (i + 1 < s.length())  // value of next symbol (or 0 at end)
                       ? val(s.charAt(i + 1))
                       : 0;

            // If a smaller value comes before a larger value, subtract it (subtractive rule)
            if (curr < next) {
                total -= curr;
            } else {
                total += curr;               // otherwise add it
            }
        }
        return total;
    }

    // (Optional) quick local test
    public static void main(String[] args) {
        RomanToInteger sol = new RomanToInteger();
        System.out.println(sol.romanToInt("III"));      // 3
        System.out.println(sol.romanToInt("LVIII"));    // 58
        System.out.println(sol.romanToInt("MCMXCIV"));  // 1994
    }
}
