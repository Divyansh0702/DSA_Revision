class Solution {
    public String maxSumOfSquares(int num, int sum) {
        // if(sum > 9 * num) return "";

        // int nines = sum / 9;

        // StringBuilder result = new StringBuilder();
        // for(int i = 0; i < nines; i++){
        //     result.append('9');
        // }

        // int remaining = sum % 9;
        // if(remaining > 0) result.append((char) ('0' + remaining));

        // int zeros = num - result.length();
        // for(int i = 0; i < zeros; i++){
        //     result.append("0");
        // }

        // return result.toString();

        if(sum > 9 * num) return "";

        int nines = sum / 9;
        sum %= 9;

        StringBuilder res = new StringBuilder("9".repeat(nines));

        if(sum > 0) res.append(sum);

        res.append("0".repeat(num - res.length()));

        return res.toString();
    }
}