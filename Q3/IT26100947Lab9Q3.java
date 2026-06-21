public class IT26100947Lab9Q3 {

    // Method to add two integers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to multiply two integers
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method to square an integer
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // Expression i: (3 * 4 + 5 * 7)^2
        int prod1 = multiply(3, 4);
        int prod2 = multiply(5, 7);
        int sum1 = add(prod1, prod2);
        int expression1Result = square(sum1);

        // Expression ii: (4 + 7)^2 + (8 + 3)^2
        int sum2 = add(4, 7);
        int sum3 = add(8, 3);
        int sq1 = square(sum2);
        int sq2 = square(sum3);
        int expression2Result = add(sq1, sq2);

        // Display results
        System.out.println("Result of (3*4+5*7)^2 : " + expression1Result);
        System.out.println("Result of (4+7)^2+(8+3)^2 : " + expression2Result);
    }
}