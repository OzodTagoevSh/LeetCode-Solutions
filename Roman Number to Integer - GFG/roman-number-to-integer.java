//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        Map<Character, Integer> romanFormat = new HashMap<>();
        romanFormat.put('M', 1000);
        romanFormat.put('D', 500);
        romanFormat.put('C', 100);
        romanFormat.put('L', 50);
        romanFormat.put('X', 10);
        romanFormat.put('V', 5);
        romanFormat.put('I', 1);
        
        int answer = 0, len = str.length();
        for(int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if(i+1 != len && romanFormat.get(c) < romanFormat.get(str.charAt(i+1))) {
                answer += romanFormat.get(str.charAt(i+1))-romanFormat.get(c);
                i++;
            } else 
                answer += romanFormat.get(c);
        }
        return answer;
    }
}