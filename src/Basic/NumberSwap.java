package Basic;

public class NumberSwap {

    // Swaps two numbers using a temporary variable
    public static void swap(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void swapWithoutTempVariable(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void swapWithBitwise(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        swap(x, y); // Output: a = 10, b = 5
        swapWithoutTempVariable(x, y); // Output: a = 10, b = 5
    }

}
