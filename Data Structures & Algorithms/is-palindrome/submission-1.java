class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                res.append(Character.toLowerCase(ch));
            }
        }
        int left=0;
        int right=res.length()-1;
        while(left<=right){
            if(res.charAt(left)!=res.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
