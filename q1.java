public class q1 {

    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }
        if (nums[nums.length - 1] > nums[0]) {
            count++;
        }

        if (count <= 1) {
            return true;
        }
        return false;

    }
}

class subham {
    public static void main(String[] args) {
        q1 cheQ1 = new q1();
        int[] arr = { 3, 5, 4, 1, 2 };
        boolean result = cheQ1.check(arr);
        System.out.println(result);

    }

}