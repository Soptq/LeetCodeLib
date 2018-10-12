/*
https://leetcode-cn.com/problems/3sum/description/

Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/

class Solution {
	public List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> output = new ArrayList<>();
		int length = nums.length;
		//排序
		Arrays.sort(nums);
		//开始处理
		for (int i = 0;i < (length - 2);i++) {
			for (int j = (i + 1);j < (length - 1);j++) {
				for (int k = (j + 1);k < length;k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> list = new ArrayList<>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						if (list != output.get(output.size()-1)) {
							output.add(list);
						}
					}
				}
			}
		}
		return output;
	}
}