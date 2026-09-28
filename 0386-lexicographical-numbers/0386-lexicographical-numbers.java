class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ll = new ArrayList<>();
        LexicoCounting(n, 0, ll);
        return ll;
    }
    public static void LexicoCounting(int n, int curr, List<Integer> ll) {			
		if(curr > n) {
			return;
		}
		
		if(curr != 0) {
			ll.add(curr);
		}		
		
		int i = 0;
		if(curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			LexicoCounting(n, curr*10 + i, ll);
		}
	}
}