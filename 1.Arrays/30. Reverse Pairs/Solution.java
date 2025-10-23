// package 30. Reverse Pairs;

public class Solution {
    private int count = 0;

    public int reversePairs(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);

        return count;

    }

    public void countRevPairs(int nums[], int low, int mid, int high) {
        int j = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (j <= high && (long) nums[i] > 2L * nums[j]) {
                j++;

            }
            count = count + (j - (mid + 1));

        }
    }

    public void mergeSort(int nums[], int low, int high) {
        // agar element 1 ya 0 bacha hai toh
        if (low >= high)
            return;
        int mid = low + (high - low) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        countRevPairs(nums, low, mid, high);

        merge(nums, low, mid, high);

    }

    private void merge(int nums[], int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];

            }

        }
        while (i <= mid) {
            temp[k++] = nums[i++];

        }
        while (j <= high) {
            temp[k++] = nums[j++];

        }
        for (int k2 = 0; k2 < temp.length; k2++) {
            nums[low + k2] = temp[k2];

        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 3, 1 };
        int s = new rev().reversePairs(arr);
        System.out.println(s);
    }
}
