/*
https://leetcode-cn.com/problems/longest-common-prefix/description/

编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1:

输入: ["flower","flow","flight"]
输出: "fl"
示例 2:

输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
说明:

所有输入只包含小写字母 a-z 。
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String output = "";
        char temp;
        Boolean isForehead = true;
        //i是要循环几次前缀
        for (int i = 0;i < findMinLength(strs);i++){
            temp = strs[0].charAt(i);
            //j是要循环对比几个数
            for (int j = 1;j < strs.length;j++){
                if (temp != strs[j].charAt(i)){
                    isForehead = false;
                }
            }
            if (isForehead) {
                output = output + temp;
            }else return output;
        }
        return output;
    }
    
    public int findMinLength(String[] strs){
        int length = strs.length;
        int minLength = strs[0].length();
        for (int i = 1;i < length;i++){
            if (strs[i].length() < minLength){
                minLength = strs[i].length();
            }
        }
        return minLength;
    }
}