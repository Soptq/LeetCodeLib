//https://leetcode-cn.com/problems/pascals-triangle/description/

class Solution {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> outputList = new ArrayList<List<Integer>>();
        if (numRows == 0){
            return outputList;
        }
        List<Integer> lastRow = new ArrayList<Integer>();
        lastRow.add(1);
        outputList.add(lastRow);
        if (numRows == 1) {
        	return outputList;
        }
        List<Integer> thisRow = new ArrayList<Integer>();
        thisRow.add(1);
        thisRow.add(1);
        outputList.add(thisRow);
        if (numRows == 2) {
        	return outputList;
        }
        for (int i = 1;i < numRows - 1;i++) {
        	lastRow = new ArrayList<Integer>(thisRow);
        	thisRow = new ArrayList<Integer>();
            thisRow.add(1);
        	for (int j = 0;j < lastRow.size() - 1;j++) {
        		thisRow.add(lastRow.get(j)+lastRow.get(j+1));
        	}
        	thisRow.add(1);
        	outputList.add(thisRow);
        }
        return outputList;
    }
}