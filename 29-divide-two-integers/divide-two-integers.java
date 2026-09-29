class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean sign = true;

        if (dividend < 0 && divisor > 0)
            sign = false;

        if (dividend > 0 && divisor < 0)
            sign = false;

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long ans = 0;

        if (n == d)
            return sign ? 1 : -1;

        while (n >= d) {

            int cnt = 0;

            while (cnt < 31 && n >= (d << (cnt + 1))){
                cnt++;
            }

            ans += (1L << cnt);
            n -= d << cnt;
        }

        return sign ? (int) ans : (int) -ans;
    }
}