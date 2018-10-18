//https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {
    	if (nums.length == 0 || nums.length == 1) return false;
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
        	if (hash.containsKey(nums[i])) {
        		hash.put(nums[i], hash.get(nums[i]) + 1);
        	}else hash.put(nums[i], 1);
        }
        Iterator iterator = hash.entrySet().iterator();
        while (iterator.hasNext()){
        	Map.Entry entry = (Map.Entry) iterator.next();
        	if ((Integer)entry.getValue() >= 2) return true;
        }
        return false;
    }
}



class Solution {
    public boolean containsDuplicate(int[] nums) {
    	if (nums.length == 0 || nums.length == 1) return false;
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
        	if (hash.containsKey(nums[i])) {
        		return true;
        	}else hash.put(nums[i], 1);
        }
        return false;
    }
}


public static boolean containsDuplicateConstantSpace(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] == nums[i]) {
				return true;
			}
		}
		return false;
	}