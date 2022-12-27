//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        int len = S.length();
        StringBuilder answer = new StringBuilder();
        StringBuilder helper = new StringBuilder();
        for(int i = len - 1; i >= 0; i--) {
            char c = S.charAt(i);
            if(c != '.') 
                helper.insert(0, c);
            else {
                answer.append(helper);
                answer.append(".");
                helper.setLength(0);
            }
        }
        answer.append(helper);
        return answer.toString();
    }
}