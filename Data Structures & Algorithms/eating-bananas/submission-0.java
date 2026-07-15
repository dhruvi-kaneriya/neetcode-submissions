class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        int res = end;

        while(start <= end){
            int mid = (start+end)/2;

            long totaltime = 0;
            for(int i: piles){
                totaltime += Math.ceil((double)i/mid);

            }
            if(totaltime <= h){
                res = mid;
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return res;

    }
}
