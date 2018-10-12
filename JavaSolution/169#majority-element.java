//https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
    	if (nums.length == 1) return nums[0];
    	int count;
    	int length = nums.length / 2;
        Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for (int num : nums) {
        	if (hashMap.containsKey(num)) {
        		count = hashMap.get(num);
        		if (count + 1 > length) {
        			return num;
        		}
        		hashMap.put(num,count+1);
        	}else{
        		hashMap.put(num,1);
        	}
        }
        return 0;
    }
}