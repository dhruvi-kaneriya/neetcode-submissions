class Solution {
    public int longestConsecutive(int[] nums) {
        
        int res=0;
        Set<Integer> val = new HashSet<>();
        for(int num : nums){
            val.add(num);
        }

        for(int num : nums){
            int streak =0, curr = num;
            while(val.contains(curr)){
                streak++;
                curr++;
            }
            res = Math.max(res, streak);
        }
        return res;
    }
}
