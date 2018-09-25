/*
https://leetcode-cn.com/contest/weekly-contest-102/problems/sort-array-by-parity/

给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。

你可以返回满足此条件的任何数组作为答案。

 

示例：

输入：[3,1,2,4]
输出：[2,4,3,1]
输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
*/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        int[] output = new int[A.length];
        for (int i = 0;i < A.length;i++){
            if (A[i] % 2 == 0){
                evenList.add(A[i]);
            }else oddList.add(A[i]);
        }
        for (int i = 0;i < evenList.size();i++){
            output[i] = evenList.get(i);
        }
        for (int i = 0;i < oddList.size();i++){
            output[evenList.size() + i] = oddList.get(i);
        }
        return output;
    }
}