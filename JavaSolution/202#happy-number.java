//https://leetcode.com/problems/happy-number/submissions/

class Solution {
    int i = 0;
    public boolean isHappy(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (i == 7) return false;
        int sum = 0;
        while (n != 0){
            sum = sum + (n % 10) * (n % 10);
            n = n / 10;
        }
        i++;
        return isHappy(sum);
    }
}

public class Solution {
    public boolean isHappy(int n) {
        int x = n;
        int y = n;
        while(x>1){
            x = cal(x) ;
            if(x==1) return true ;
            y = cal(cal(y));
            if(y==1) return true ;

            if(x==y) return false;
        }
        return true ;
    }
    public int cal(int n){
        int x = n;
        int s = 0;
        while(x>0){
            s = s+(x%10)*(x%10);
            x = x/10;
        }
        return s ;
    }
}