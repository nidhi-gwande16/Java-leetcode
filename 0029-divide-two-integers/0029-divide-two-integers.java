class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor ==-1)
            return Integer.MAX_VALUE;
        
        boolean isNegative = dividend<0 ^ divisor<0;
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        int quotient=0;
        while(dividend-divisor>=0)
        {
            int currentDivisor=divisor;
            int currentQuotient=1;
            while(dividend-(currentDivisor<<1)>=0)
            {
                currentDivisor=currentDivisor<<1;
                currentQuotient=currentQuotient<<1;
            }
            quotient +=currentQuotient;
            dividend -= currentDivisor;
        }
        return isNegative ? -quotient:quotient;
    }
}