//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            ArrayList<String> arr = new ArrayList<String>();
            String input[] = read.readLine().split(" ");
            
            for(int i = 0; i < n; i++){
                arr.add(input[i]);
            }
            String word1 = read.readLine();
            String word2 = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(arr,word1,word2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int minDistance = Integer.MAX_VALUE;
        int d1 = -1, d2 = -1;
        int len = s.size();
        for(int i = 0; i < len; i++) {
            if(s.get(i).equals(word1))
                d1 = i;
            if(s.get(i).equals(word2))
                d2 = i;
            if(d1 != -1 && d2 != -1)
                minDistance = Math.min(minDistance, Math.abs(d1 - d2));
        }
        return minDistance;
    }
};