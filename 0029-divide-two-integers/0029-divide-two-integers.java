class Solution {
    public int divide(int dividend, int divisor) {

        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;

        if (dividend == INT_MIN && divisor == -1) {
            return INT_MAX;
        }

        boolean negative = (dividend < 0) != (divisor < 0);

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        long quotient = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            long multiple = 1;

            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            dvd -= temp;
            quotient += multiple;
        }

        if (negative) {
            quotient = -quotient;
        }

        if (quotient > INT_MAX) {
            return INT_MAX;
        }

        if (quotient < INT_MIN) {
            return INT_MIN;
        }

        return (int) quotient;
    }
}