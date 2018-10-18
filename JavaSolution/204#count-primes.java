//https://leetcode.com/problems/count-primes/

class Solution {
    public int countPrimes(int n) {
        int num = 0;
        for (int i = 1; i < n; i++){
            if (isPrime(i)) num++;
        }
        return num;
    }
    
    public boolean isPrime(int n){
        if (n== 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class Solution {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        
        return count;
    }
}