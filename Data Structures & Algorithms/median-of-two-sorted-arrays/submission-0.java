class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;

        int[] merged = new int[len1 + len2];

        System.arraycopy(nums1,0,merged,0,len1);
        System.arraycopy(nums2,0,merged,len1,len2);

        Arrays.sort(merged);

        int totallen = merged.length;

        if(totallen %2 == 0){
            return(merged[totallen /2 -1] + merged[totallen/2]) /2.0;
        }else{
            return merged[totallen/2];
        }
    }
}
