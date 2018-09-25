/*
https://leetcode-cn.com/problems/count-and-say/description/

报数序列是指一个整照其中的整数的顺序进数序列，按行报数，得到下一个数。其前五项如下：

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 被读作  "one 1"  ("一个一") , 即 11。
11 被读作 "two 1s" ("两个一"）, 即 21。
21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。

给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。

注意：整数顺序将表示为一个字符串。

 

示例 1:

输入: 1
输出: "1"
示例 2:

输入: 4
输出: "1211"
*/
class Solution {
    public String countAndSay(int n) {
        String output = "1";
    	for (int i = n;i > 1;i--){
            output = calcu(output);
        }
        return output;
    }

    public String calcu(String str){
    	int counter = 1;
    	char box = str.charAt(0);
    	String output = "";
    	for (int i = 1;i < str.length();i++) {
    		if (str.charAt(i) == box) {
    			++counter;
    		}else {
    			output = output + counter + box;
    			box = str.charAt(i);
    			counter = 1;
    		}
    	}
        output = output + counter + box;
    	return output;
    }
}