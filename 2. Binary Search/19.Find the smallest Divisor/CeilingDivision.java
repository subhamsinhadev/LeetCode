public class CeilingDivision {

    public static int ceilingDivide(int numerator, int denominator) {
        // Perform the division using floating-point numbers to get the exact value
        double result = (double) numerator / denominator;
        
        // Use Math.ceil() to round up to the nearest integer
        // Cast the double result back to an int
        return (int) Math.ceil(result);
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        System.out.println(a + " / " + b + " = " + ceilingDivide(a, b)); // Output: 7 / 3 = 3

        int c = 10;
        int d = 2;
        System.out.println(c + " / " + d + " = " + ceilingDivide(c, d)); // Output: 10 / 2 = 5
        
        int e = 5;
        int f = 4;
        System.out.println(e + " / " + f + " = " + ceilingDivide(e, f)); // Output: 5 / 4 = 2
    }
}
