class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                res.append(Character.toLowerCase(c));
            }
        }
        int left=0;
        int right=res.length()-1;
        while(left<right){
            if(res.charAt(left)!=res.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
