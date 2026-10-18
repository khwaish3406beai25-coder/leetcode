class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str = "";
        String rev="";
        for(int i=0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str+=s.charAt(i);
            }
        }
        String org=str;
        for(int i=str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        if(org.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
}