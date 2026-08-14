class Solution {
    public int mirrorDistance(int n) {
        int newNum = 0;
        int orignal = n;

        while(n > 0){
            int digit = n % 10;
            newNum = newNum*10 + digit;
            n = n/10;
        }
        return Math.abs(orignal - newNum);
    }
}