class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for (int i=0;i<n;i++)
        {
            nums1[i+m]=nums2[i];
        }
        int min;
        int temp;
        for (int i=0;i<nums1.length;i++)
        {
            min = i;
            for (int j=i+1;j<nums1.length;j++)
            {
                if (nums1[j] < nums1[min])
                    min = j;
            }
            temp = nums1[i];
            nums1[i] = nums1[min];
            nums1[min] = temp;
		}
    }
}
