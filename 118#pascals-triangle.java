给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。

在杨辉三角中，每个数是它左上方和右上方的数的和。

示例:

输入: 5
输出:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        List<Integer> lastRow = new ArrayList<>();
        lastRow.add(1);
        output.add(lastRow);
        if (numRows == 1) {
        	return output;
        }
        removeAllDate(lastRow);
        lastRow.add(1);
        lastRow.add(1);
        output.add(lastRow);
        if (numRows == 2) {
        	return output;
        }
        for (int i = 2;i < numRows;i++) {
        	for (int j = 0;j < row.size() - 1;i++) {
        		row.add(lastRow.get(j)+lastRow.get(j+1));
        	}
        	output.add(row);
        	removeAllDate(lastRow);
        	for (int i:row) {
        		lastRow.add(i);
        	}
        	removeAllDate(row);
        }
        return output;
    }

    public void removeAllDate(List<E> list){
    	for (int i = 0;i < list.size();i++) {
    		list.remove(i);
    	}
    }
}