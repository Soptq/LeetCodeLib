class Solution {
    public int lengthOfLongestSubstring(String s) {
        String output = "";
        String tempOutput = "";
        //寻找从第一位开始的最小不重复字符串
        for (int i = 0;i < s.length();i++) {
        	if (!isReapeat(output, s.charAt(i))) {
        		output = output + s.charAt(i);
        	}else {
        		break;
        	}
        }

        // i 是首位的指针。
        for (int i = 1;i < s.length() - output.length();i++){
        	tempOutput = "";
        	// j 是循环找不重复数的指针
        	for (int j = i;j < s.length();j++) {
        		if (!isReapeat(tempOutput,s.charAt(j))) {
        			tempOutput = tempOutput + s.charAt(j);
        		}else{
        			break;
        		}
        	}
        	if (tempOutput.length() > output.length()) {
        		output = tempOutput;
        	}
        }
        return output.length();
    }

    public boolean isReapeat(String str, char c){
    	for (int i = 0;i < str.length();i++) {
    		if (c == str.charAt(i)) {
    			return true;
    		}
    	}
    	return false;
    }
}

