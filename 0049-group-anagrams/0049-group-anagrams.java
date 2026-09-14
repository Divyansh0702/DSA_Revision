class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return Anagrams(strs);
    }

    public static List<List<String>> Anagrams(String[] strs){
		HashMap<String, List<String>> map = new HashMap<>();
		
		for (int i = 0; i < strs.length; i++) {
			String key = Key(strs[i]);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(strs[i]);
		}
		
		List<List<String>> ans = new ArrayList<>();
		for(String key : map.keySet()) {
			ans.add(map.get(key));
		}
		
		return ans;
	}
	
	public static String Key(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int idx = s.charAt(i) - 'a';
			freq[idx] = freq[idx] + 1;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < freq.length; i++) {
			sb.append(freq[i] + " ");
		}
		
		return sb.toString();
	}
}