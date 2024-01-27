class Solution {
    public String convertToTitle(int col) {
        char[] arr = {
                'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        String res = "";
        while (col > 26) {
            res = "" + arr[col % 26] + res;
            if (col % 26 == 0) {
                col = (col / 26) - 1;
            } else {
                col /= 26;
            }
        }
        res = "" + arr[col] + res;
        return res;
    }
}