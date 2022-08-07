class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
Arrays.sort(nums2);

        int i=0;
        int j=0;
        int l=0;


        while (i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]) {
                nums1[l]=nums1[i];
                i++;
                j++;
                l++;

            }
            else if(nums1[i]<nums2[j])
                i++;
            else
                j++;

        }
        int[] arr= new int[l];
        for (int k = 0; k < arr.length; k++) {
            arr[k]= nums1[k];

        }
       return  arr;
        
    }
}