class Solution {
    public int singleNumber(int[] nums) {
    	if (nums.length == 1) {
    		return nums[0];
    	}
        Arrays.sort(nums);
        if (nums[0] != nums[1]) {
        	return nums[0];
        }
        int length = nums.length;
        if (nums[length - 2] != nums[length - 1]) {
        	return nums[length - 1];
        }
        for (int i = 1;i < length / 2;i++ ) {
        	if (nums[2 * i] != nums[2 * i + 1]) {
        		return nums[2 * i];
        	}
        }
        return 0;
    }
}



class Solution {
    public int singleNumber(int[] nums) {
    	int output = 0;
    	for (int i = 0;i < nums.length;i++ ) {
    		output ^= nums[i];
    	}
    	return output;
    }
}