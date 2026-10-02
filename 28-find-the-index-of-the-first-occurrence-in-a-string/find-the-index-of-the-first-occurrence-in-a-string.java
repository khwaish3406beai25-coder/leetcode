class Solution {
    public int strStr(String haystack, String needle) {
        int res=-1;
        for (int i=0; i<=haystack.length()-needle.length(); i++){
                String str=haystack.substring(i,i+needle.length());
                if(needle.equals(str)){
                    res=i;
                    break;
                }
        }
        return res;
    }
}