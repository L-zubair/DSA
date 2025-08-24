import java.util.HashMap;
import java.util.Map;
public class LongestSubstringNoRepeat  {
    public static int lengthOfLongestSubstring(String s){
        Map<Character, Integer> last = new HashMap<>();// char=->last index seen
        int left =0; //start of window
        int maxLen=0;  // best ans so far

        for(int right =0; right<s.length(); right++){
            char c= s.charAt(right);

             // If we've seen c and it's inside the current window, shrink from left
            if(last.containsKey(c)&& last.get(c) >=left){
                left = last.get(c)+1;
            
            }
             // Record/update last position of c
            last.put(c, right);

            // Update max length for current window [left..right]
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    // Quick test
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
    }
    
    
}
