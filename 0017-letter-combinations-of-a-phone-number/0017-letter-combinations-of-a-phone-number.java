class Solution {
    static String[] key = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        if(digits.length() == 0) return res;

        comb(digits, sb, res);
        return res;
    }

    public void comb(String ques, StringBuilder sb, List<String> res){
        if(ques.length() == 0){
            res.add(sb.toString());
            return;
        }

        char ch = ques.charAt(0);
        String letters = key[ch - '2'];

        // for(int i = 0; i < letters.length(); i++){
        //     sb.append(letters.charAt(i));

        //     comb(ques.substring(1), sb, res);

        //     sb.deleteCharAt(sb.length() - 1);
        // }

        for(char c : letters.toCharArray()){
            sb.append(c);

            comb(ques.substring(1), sb, res);

            sb.deleteCharAt(sb.length() - 1);
        }
    }
}