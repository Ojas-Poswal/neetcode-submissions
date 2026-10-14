class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==0){
            return new int[]{};
        }
        int ans[] = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b)-map.get(a));
        for(int i=0;i<k;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
