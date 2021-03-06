/*
https://leetcode-cn.com/problems/valid-parentheses/description/

给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

示例 1:

输入: "()"
输出: true
示例 2:

输入: "()[]{}"
输出: true
示例 3:

输入: "(]"
输出: false
示例 4:

输入: "([)]"
输出: false
示例 5:

输入: "{[]}"
输出: true

*/

class Solution {
    public boolean isValid(String s) {
        if (s == "") return true;
        List<String> list = new ArrayList<>();
        int length = 0;
        for (int i = 0;i < s.length();i++) {
        	switch (s.charAt(i)){
        		case '(':
        			list.add("a");
        			length = length + 1;
        			break;
        		case '{':
        			list.add("b");
        			length = length + 1;
        			break;
        		case '[':
        			list.add("c");
        			length = length + 1;
        			break;
        		case ')':
                    if (length == 0) return false;
        			if (list.get(length-1) == "a") {
        				list.remove(length-1);
        				length = length -1;
        			}else return false;
        			break;
        		case '}':
                    if (length == 0) return false;
        			if (list.get(length-1) == "b"){
        				list.remove(length-1);
        				length = length -1;
        			}else return false;
                    break;
        		case ']':
                    if (length == 0) return false;
        			if (list.get(length-1) == "c"){
        				list.remove(length-1);
        				length = length -1;
        			}else return false;
                    break;
        	}
        }
        if (length != 0) {
        	return false;
        }
        return true;
    }
}