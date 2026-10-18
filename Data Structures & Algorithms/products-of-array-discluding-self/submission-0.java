class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==1) return nums;

        int ans[] = new int[nums.length];
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];

        prefix[0]=nums[0];
        suffix[0]=nums[nums.length-1];

        for(int i=1;i<nums.length;i++){
          prefix[i] = nums[i]*prefix[i-1];
          suffix[i] = nums[nums.length-1-i]*suffix[i-1];
        }
        ans[0]=suffix[nums.length-2];
        ans[nums.length-1]=prefix[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            ans[i] = prefix[i-1]*suffix[nums.length-1-i-1];
        }
        
        return ans;
        
    }
}  
