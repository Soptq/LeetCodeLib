//https://leetcode.com/problems/excel-sheet-column-number/

class Solution {
	public static int titleToNumber(String s) {
		int res,j;
        res = 0;
        j = 0;
		for(int i = s.length() - 1 ; i >= 0 ; i-- ){
			int act = s.charAt(i) - 'A' + 1;
			res = (int)(res + Math.pow(26,j) * act);
			j = j + 1;
		}
		return res;
	}
}