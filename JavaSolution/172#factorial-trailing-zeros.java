//https://leetcode.com/problems/factorial-trailing-zeroes/


class Solution {
    public int trailingZeroes(int n) {
    	int count;
    	int a,b;
    	a = 0;
    	b = 0;
        for (int i = 1; i <= n; i++) {
        	if (i % 2 == 0 || i % 5 == 0) {
        		int [] arr = calcu(i);
        		a += arr[0];
        		b += arr[1];
        	}
        }
        return Math.min(a,b);
    }

    public int[] calcu(int n){
    	int a,b;
    	a = 0;
    	b = 0;
    	while (n % 10 == 0){
    		++a;
    		++b;
    		n /= 10;
    	}
    	while (n % 2 == 0){
    		++a;
    		n /= 2;
    	}
    	while (n % 5 == 0){
    		++b;
    		n /= 5;
    	}
    	return new int[]{a,b};
    }
}



class Solution {
    public int trailingZeroes(int n) {
        if(n>=5){
            return n/5 + trailingZeroes(n/5);
        }else{
            return 0;
        }       
    }

}