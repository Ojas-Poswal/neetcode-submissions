class Solution {
    public boolean isPalindrome(String s) {
        String pall = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left=0;
        int right=pall.length()-1;
        while(left<=right){
            if(pall.charAt(left)!=pall.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
        
    }
}
