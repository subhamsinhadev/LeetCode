
public class merge_sort {
    public static void test(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);

    }

    public static void mergeSort(int[] nums, int low, int high) {
        int mid = (low + high) / 2;
        if (low >= high) {
            return;
        }

        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);

    }

    private static void merge(int[] nums, int low, int mid, int high) {

        int s1 = mid - low + 1;
        int s2 = high - mid;
        // temp arr
        int leftArr[] = new int[s1];
        int rightArr[] = new int[s2];

        // copy data to temp arr

        for (int i = 0; i < s1; i++)
            leftArr[i] = nums[low + i];
        for (int j = 0; j < s2; j++)
            rightArr[j] = nums[mid + 1 + j];

        int i = 0;
        int j = 0;
        int k = low;

        while (i < s1 && j < s2) {
            if (leftArr[i] <= rightArr[j]) {
                nums[k++] = leftArr[i++];
            } else {
                nums[k++] = rightArr[j++];

            }

        }

        while (i < s1)
            nums[k++] = leftArr[i++];
        while (j < s2)
            nums[k++] = rightArr[j++];

    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 7, 4, 9, 2, 6, 5 };
        System.out.print("Before Sorting: ");
        for (int i : arr)
            System.out.print(i);

        // sorting
        test(arr);
        System.out.print("After Sorting: ");
        for (int i : arr)
            System.out.print(i);
    }

}
