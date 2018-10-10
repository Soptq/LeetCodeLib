class Solution {
	String[] alphaArr = new String[]{"","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    public String convertToTitle(int n) {
        int bit = findBit(n);
        int a = n;
        int b,c;
        String output = "";
        while(bit > 0){
            b = myPow(bit - 1);
            c = n / b;
            if (c > 26) c = 26
            	else {
            		if (n%26 == 0 && bit != 1) c -= 1;
            	}
        	output = output + alphaArr[c];
        	bit = bit - 1;
            n -= b * c;
        }
        return output;
    }

    public int findBit(int n){
    	int i = 1;
    	while (calcu(i) < n){
    		i++;
    	}
        return i;
    }

    public int calcu(int i){
    	return (26*(1 - myPow(i)))/(-25);
    }

    public int myPow(int upper){
    	int output = 1;
    	int lower = 26;
    	for (int i = 0;i < upper ; i++) {
    		output *= lower;
    	}
    	return output;
    }
}


//OMFG!!!

class Solution {
	public String convertToTitle(int n) {
		return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
	}
}