//https://leetcode.com/problems/range-sum-query-immutable/submissions/

class NumArray {
    private int[] dp;

    public NumArray(int[] nums) {
        if (nums.length != 0){
            dp = new int[nums.length];
            dp[0] = nums[0];
            for (int i = 1;i < dp.length;i++){
                dp[i] = nums[i]+dp[i-1];
            }
        }
    }
    
    public int sumRange(int i, int j) {
        return dp[j] - (i > 0 ? dp[i - 1] : 0);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */