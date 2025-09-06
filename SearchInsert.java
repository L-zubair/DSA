class SearchInsert {
     public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  // avoid overflow
            if (nums[mid] == target) {
                return mid;  // found target
            } else if (nums[mid] < target) {
                low = mid + 1;  // search right half
            } else {
                high = mid - 1; // search left half
            }
        }
        return low; // insertion index
    }

    public static void main(String[] args) {
        SearchInsert sol = new SearchInsert();   // create object of Solution
        int[] nums1 = {1, 3, 5, 6};

        System.out.println(sol.searchInsert(nums1, 5)); // 2
        System.out.println(sol.searchInsert(nums1, 2)); // 1
        System.out.println(sol.searchInsert(nums1, 7)); // 4
        System.out.println(sol.searchInsert(nums1, 0)); // 0
    }
}
