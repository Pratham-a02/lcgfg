//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends

class Solution{
    public long findMinDiff (ArrayList<Integer> a, int n, int m){
        Collections.sort(a);
        int left = 0;
        int max = Integer.MAX_VALUE;
        for(int right = 0;right<n;right++){
            while(right - left + 1 == m){
                max = Math.min(max,a.get(right) - a.get(left));
                left++;
            }
        }
        return max;
    }
}