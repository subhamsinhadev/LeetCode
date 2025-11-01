public class a {
    public int singleNonDuplicate(int[] nums) {
        // Initialize binary search boundaries
        int left = 0;
        int right = nums.length - 1;
      
        // Binary search to find the single element
        while (left < right) {
            // Calculate middle index
            int mid = (left + right) >> 1;
          
            // XOR with 1 toggles the last bit:
            // - If mid is even, mid ^ 1 = mid + 1 (checks next element)
            // - If mid is odd, mid ^ 1 = mid - 1 (checks previous element)
            // In a valid pair, elements at even and odd indices should match
            if (nums[mid] != nums[mid ^ 1]) {
                // Single element is in the left half (including mid)
                right = mid;
            } else {
                // Single element is in the right half (excluding mid)
                left = mid + 1;
            }
        }
      
        // Return the single non-duplicate element
        return nums[left];
    }

    public static void main(String[] args) {
        int arr[]={1};
        System.out.println(new a().singleNonDuplicate(arr));
    }
}