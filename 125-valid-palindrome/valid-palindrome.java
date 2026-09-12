class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        String org="";
        for(int i=0;i<s.length();i++){
              char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                org = org + ch;
            }
        }
        String rev="";
        for(int i=org.length()-1;i>=0;i--){
            rev=rev+org.charAt(i);
        }
        return org.equals(rev);
        
    }
}