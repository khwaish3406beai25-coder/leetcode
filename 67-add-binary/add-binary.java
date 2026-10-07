class Solution {
    public String addBinary(String a, String b) {

        StringBuilder res = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            if (sum == 0) {
                res.append('0');
                carry = 0;
            }
            else if (sum == 1) {
                res.append('1');
                carry = 0;
            }
            else if (sum == 2) {
                res.append('0');
                carry = 1;
            }
            else if (sum == 3) {
                res.append('1');
                carry = 1;
            }
        }

        return res.reverse().toString();
    }
}