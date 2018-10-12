//https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        if (s.equals("")) return true;
        String str = s;
        str = str.replaceAll("[^a-zA-Z0-9]","");
        str = str.toLowerCase();
        int length = str.length();
        int doLength = length / 2;
        for (int i = 0;i < doLength ;i++ ) {
        	if (str.charAt(i) != str.charAt(length - i - 1)) {
        		return false;
        	}
        }
        return true;
    }
}