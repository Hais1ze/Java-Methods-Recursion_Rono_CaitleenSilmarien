package fixing.a.flawed.recursion;

public class FixingAFlawedRecursion {

    public static void main(String[] args) {
        // TODO code application logic here
        int number = 4;
        int result = fact(number);
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 0;
        } // <-- look closely at this line
        return n * factorial(n - 1);
    }
// corrected code:

    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}

// 1. Why did one wrong return make every result wrong?
// Because the base case is where the recursion stops. 
// Returning 0 makes every multiplication result 0, while returning 1 gives the correct factorial answer.

// 2. Stretch: what happens for factorial(-2) with your corrected code, and why?
// It will keep calling itself with smaller negative numbers because it never reaches the base 
// case n == 0. It causes a StackOverflowError.