public class sq {
    // but it takes tc of O(n)
    public int sqrt(int x) {
        int ans = 0;
        for (int i = 1; i <= x; i++) {
            if ((long) i * i <= x)
                ans = i;
            else
                break;

        }
        return ans;
    }

    // let us try in O(log n)

    public int sq_rt(int x) {
        int ans = 0;
        int low = 0;
        int high = x / 2;
        // edge case
        if (x < 2)
            return x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long s = (long) mid * mid;
            if (s == x)
                return mid;
            if (s <= x)
                low = mid + 1;
            else if (s >= x)
                high = mid - 1;

        }
        return high;
    }

    public static void main(String[] args) {
        System.out.println(new sq().sq_rt(28));

    }
}
