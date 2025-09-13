public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;      // pointer for nums1 (last valid element)
        int j = n - 1;      // pointer for nums2 (last element)
        int k = m + n - 1;  // pointer for nums1 (last index to fill)

        // Merge from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy remaining elements from nums2 (if any)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    // main method for local testing
    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        msa.merge(nums1, m, nums2, n);

        // print merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
