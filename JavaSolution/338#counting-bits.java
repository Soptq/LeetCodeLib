//https://leetcode.com/problems/counting-bits/submissions/

class Solution {
    int[] dp;
    
    public int[] countBits(int num) {
        dp = new int[num+1];
        dp[0] = 0;
        for (int i = 1; i <= num; i++){
            dp[i] = dp[i-1] + 1;
            if (i % 2 == 0){
                dp[i] = dp[i] - minuesWhat(i);
            }
        }
        return dp;
    }
    
    public int minuesWhat(int i){
        int k = 1;
        int m = 0;
        while (Math.pow(2,k) <= i){
            if (i % Math.pow(2,k) == 0){
                m = k;
            }
            ++k;
        }
        return m;
    }
}


public int[] countBits(int num) {
    int[] f = new int[num + 1];
    for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
    return f;
}