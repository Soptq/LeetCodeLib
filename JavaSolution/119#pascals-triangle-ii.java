//https://leetcode.com/problems/pascals-triangle-ii/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> lastRow = new ArrayList<Integer>();
        lastRow.add(1);
        if (rowIndex == 0) {
            return lastRow;
        }
        List<Integer> thisRow = new ArrayList<Integer>();
        thisRow.add(1);
        thisRow.add(1);
        if (rowIndex == 1) {
            return thisRow;
        }
        for (int i = 0;i < rowIndex - 1;i++) {
            lastRow = new ArrayList<Integer>(thisRow);
            thisRow = new ArrayList<Integer>();
            thisRow.add(1);
            for (int j = 0;j < lastRow.size() - 1;j++) {
                thisRow.add(lastRow.get(j)+lastRow.get(j+1));
            }
            thisRow.add(1);
        }
        return thisRow;
    }
}