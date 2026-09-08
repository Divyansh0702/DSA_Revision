class Solution {
    public String longestPalindrome(String s) {
        // return Axis_Orbit(s);
        return longestPalin(s);
    }

    // public static String Axis_Orbit(String s) {
	// 	String ans = "";
		
	// 	String odd = "";
	// 	for (int axis = 0; axis < s.length(); axis++) {
	// 		for (int orbit = 0; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
	// 			if(s.charAt(axis - orbit) != s.charAt(axis + orbit)) {
	// 				break;
	// 			}
	// 			odd = s.substring(axis - orbit, axis + orbit + 1);
	// 			if(odd.length() > ans.length()) {
	// 				ans = odd;
	// 			}
	// 		}
	// 	}
		
	// 	String even = "";
	// 	for (double axis = 0.5; axis < s.length(); axis++) {
	// 		for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
	// 			if(s.charAt((int)(axis - orbit)) != s.charAt((int)(axis + orbit))) {
	// 				break;
	// 			}
	// 			even = s.substring((int)(axis - orbit), (int)(axis + orbit + 1));
	// 			if(even.length() > ans.length()) {
	// 				ans = even;
	// 			}
	// 		}
	// 	}
		
	// 	return ans;
	// }
    
    public String longestPalin(String s) {
        String res = "";
        int resLen = 0;

        for (int i = 0; i < s.length(); i++) {
            // Odd length
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > resLen) {
                    res = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                l--;
                r++;
            }

            // Even length
            l = i; r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > resLen) {
                    res = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                l--;
                r++;
            }
        }

        return res;
    }
}