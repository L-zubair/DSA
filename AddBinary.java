public class AddBinary {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            int digit = sum % 2;   // 0 or 1
            carry = sum / 2;       // 0 or 1
            sb.append((char)('0' + digit));
        }

        return sb.reverse().toString();
    }

    // test main
    public static void main(String[] args) {
        AddBinary sol = new AddBinary();
        System.out.println(sol.addBinary("11", "1"));       // "100"
        System.out.println(sol.addBinary("1010", "1011"));  // "10101"
    }
}
