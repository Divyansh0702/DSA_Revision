class Solution {
    public boolean isIsomorphic(String s, String t) {
        // HashMap<Character, Character> mapf = new HashMap<>();
        // HashMap<Character, Character> mapr = new HashMap<>();

        // for(int i = 0; i < s.length(); i++){
        //     char c1 = s.charAt(i);
        //     char c2 = t.charAt(i);

        //     if(mapf.containsKey(c1)){
        //         if(mapf.get(c1) != c2){
        //             return false;
        //         }
        //     }
        //     else{
        //         mapf.put(c1, c2);
        //     }

        //     if(mapr.containsKey(c2)){
        //         if(mapr.get(c2) != c1){
        //             return false;
        //         }
        //     }
        //     else{
        //         mapr.put(c2, c1);
        //     }
        // }
        // return true;

        // HashMap<Character, Character> map = new HashMap<>();

        // for(int i = 0; i < s.length(); i++){
        //     char c1 = s.charAt(i); 
        //     char c2 = t.charAt(i);
            
        //     if( (map.containsKey(c1) && map.get(c1) != c2) || (!map.containsKey(c1) && map.containsValue(c2)) ){
        //         return false;
        //     }
        //     map.put(c1, c2);
        // }

        // return true;

        // int[] st = new int[256];
        // int[] ts = new int[256];
        // Arrays.fill(st, -1);
        // Arrays.fill(ts, -1);

        // for(int i = 0; i < s.length(); i++){
        //     char ss = s.charAt(i);
        //     char tt = t.charAt(i);

        //     if(st[ss] == -1 && ts[tt] == -1){
        //         st[ss] = tt;
        //         ts[tt] = ss;
        //     }
        //     else if(st[ss] != tt){
        //         return false;
        //     }
        // }

        // return true;

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for(int i = 0; i < s.length(); i++){
            char ch1 = s.charAt(i);   
            char ch2 = t.charAt(i);

            if(mapS[ch1] != mapT[ch2]) return false;
            mapS[ch1] = i + 1;
            mapT[ch2] = i + 1;   
        }

        return true;
    }
}