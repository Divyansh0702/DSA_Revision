class Solution {
    public int countPrimes(int n) {
        return count(n);
    }
    public static int count(int n) {
		boolean prime[] = new boolean[n];
		
		int cnt = 0;
		if((n == 0) || (n == 1)) {
			return cnt;
		}
		
		else {
			for (int i = 2; i * i < prime.length; i++) {
				if(prime[i] == false) {
					for (int j = 2; i * j < prime.length; j++) {
						prime[i*j] = true;
					}
				}
			}
			
			for (int i = 2; i < prime.length; i++) {
				if(prime[i] == false) {
					cnt++;
//					System.out.println(i);
				}
			}
			return cnt;
		}
		
	}
}