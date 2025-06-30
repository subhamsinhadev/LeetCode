class LargestElementinArray {
    public static int ElementinArray(int[] arr) {
        int number = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > number) {
                number = arr[i];

            }

        }
        return number;

    }
     public static void main(String[] args) {
        int[] array = { 10, 50, 20, 30 };
        int num = LargestElementinArray.ElementinArray(array);
        System.out.println(num);
    }

}

