//https://leetcode.com/problems/stone-game/

class Solution {
    public boolean stoneGame(int[] piles) {
        int[][] dp = new int[piles.length][piles.length];
        for (int i = 0; i < piles.length; i++) dp[i][i] = piles[i];
        for (int i = 1; i < piles.length; i++){
            for (int j = 0; j < piles.length - i; j++){
                dp[j][i+j] = Math.max(piles[j] - dp[j + 1][i + j], piles[i + j] - dp[j][j + i - 1]);  
            }
        }
        return dp[0][piles.length - 1] > 0;
    }
}

class Solution


