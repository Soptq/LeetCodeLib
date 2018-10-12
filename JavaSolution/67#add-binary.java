//https://leetcode.com/problems/add-binary/

class Solution {
    public String addBinary(String a, String b) {
    	String c = a.length()> b.length() ? a: b;
    	String d = a.length() <= b.length() ? a: b;
        int maxlength = c.length() - 1;
        int minlength = d.length() - 1;
        int[] sum = new int[maxlength + 1];
        int tempSum;
        int add = 0;
        while (maxlength >= 0){
            tempSum = 0;
        	if (minlength >= 0) {
        		tempSum = Integer.valueOf(c.charAt(maxlength)) 
        					+ Integer.valueOf(d.charAt(minlength)) + add - 96;
        		sum[maxlength] = tempSum % 2;
        		add = tempSum / 2;
        	}else {
                tempSum = Integer.valueOf(c.charAt(maxlength))  + add - 48;
        		sum[maxlength] = tempSum % 2;
        		add = tempSum / 2;
        	}
        	--maxlength;
        	--minlength;
        }
        String output = "";
        for (int i = 0;i < sum.length;i++) {
        	output += sum[i];
        }
        if (add != 0) {
            System.out.println(add);
        	return "1"+ output;
        }
        return output;
    }
}


public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}