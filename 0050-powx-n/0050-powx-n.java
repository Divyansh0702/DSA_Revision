class Solution {
    public double myPow(double x, int n) {
        if(n == 0 || x == 1.0) return 1;
        
        long N = n;
        if(N < 0){
            x = 1 / x;
            N = -N;
        }

        // double pow = 1;
        // for(long i = 0; i < N; i++){
        //     pow *= x;
        // }

        return power(x, N);
    }

    private double power(double x, long n){
        if(n == 0) return 1;

        double half = power(x, n / 2);

        if(n % 2 == 0) return half * half;
        
        return half * half * x;
    }
}