class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen=0;
        for(int n : nums){
            set.add(n);
        }
        for(int num : set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int count = 1;
                while(set.contains(currentNum + 1)){
                    currentNum++;
                    count++;
                }
                maxLen = Math.max(count, maxLen);
            }

        }
        return maxLen;
    }
}

