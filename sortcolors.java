class Solution {
    public void sortColors(int[] nums) {
        int low = 0; // Pointer for the next position to place a red color (0)
        int mid = 0; // Pointer for the next position to place a white color (1)
        int high = nums.length - 1; // Pointer for the next position to place a blue color (2)
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                // If the current element is red (0), swap it with the element at the low pointer
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // If the current element is white (1), move to the next position
                mid++;
            } else {
                // If the current element is blue (2), swap it with the element at the high pointer
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}



