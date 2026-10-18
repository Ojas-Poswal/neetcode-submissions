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


//optimal
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] ans = new int[n];

//         int prefix = 1;
//         for (int i = 0; i < n; i++) {
//             ans[i] = prefix;
//             prefix *= nums[i];
//         }

//         int suffix = 1;
//         for (int i = n - 1; i >= 0; i--) {
//             ans[i] *= suffix;
//             suffix *= nums[i];
//         }

//         return ans;
//     }
// }
