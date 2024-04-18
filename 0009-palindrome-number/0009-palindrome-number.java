class Solution {
    public boolean isPalindrome(int x) {
        String str= String.valueOf(x);
        String rev=new StringBuilder(str).reverse().toString();
       if(str.equals(rev))
        return true;
      else
      return false;
    }
}