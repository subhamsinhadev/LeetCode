public class Floor_Ceil {
    private int findFloor(int nums[], int x) {
        int low = 0;
        int high = nums.length - 1;
        int flooor = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= x) {// cond for floor
                flooor = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // return flooor;
        return flooor;
    }

    private int findCiel(int nums[], int x) {
        int low = 0;
        int high = nums.length - 1;
        int ciel = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= x) {// cond for ciel
                ciel = nums[mid];
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return ciel;

    }

    public int[] Floor_Ceilss(int nums[], int x) {
        int a = findCiel(nums, x);
        int b = findFloor(nums, x);
        return new int[] { a, b };

    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 4, 7, 8, 10 };
        int[] s = new Floor_Ceil().Floor_Ceilss(arr, 8);
        System.out.println("Ciel:" + s[0] + "Floor:" + s[1]);

    }

}