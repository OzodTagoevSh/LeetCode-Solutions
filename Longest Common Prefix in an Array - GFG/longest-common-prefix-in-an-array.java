//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        if(arr.length == 1)
            return arr[0];
        int len = arr[0].length();
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < len; i++) {
            boolean inline = true;
            for(int j = 1; j < arr.length; j++) {
                if(i >= arr[j].length() || arr[0].charAt(i) != arr[j].charAt(i)) {
                    inline = false;
                    break;
                }
            }
            if(!inline) 
                break;
            answer.append(arr[0].charAt(i));
        }
        return answer.length() == 0 ? "-1" : answer.toString();
    }
}