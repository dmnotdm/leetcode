package normal._50;

/**
 * @author zhizhao.zhang
 * @date 2020/11/05
 */
class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        double temp = myPow(x, n / 2);
        temp = temp * temp;
        if ((n & 1) != 0) {
            if(n > 0) temp *= x;
            else temp /= x;
        }
        return temp;
    }
}
