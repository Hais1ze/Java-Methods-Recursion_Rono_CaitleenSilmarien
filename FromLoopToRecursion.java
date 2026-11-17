package from.loop.to.recursion;

public class FromLoopToRecursion {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] grades = {85, 70, 90, 60, 75};
        int pass = 75;
        int ans = countPassing(grades, pass);
        System.out.println(ans);
        int result = countPassingRecursion(grades, pass, 0);
        System.out.println(result);
    }

    static int countPassing(int[] grades, int pass) {
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= pass) {
                count++;
            }
        }
        return count;
    }

    static int countPassingRecursion(int[] grades, int pass, int idk) {
        if (idk == grades.length) {
            return 0;
        } else if (grades[idk] >= pass) {
            return 1 + countPassingRecursion(grades, pass, idk + 1);
        }
        return countPassingRecursion(grades, pass, idk + 1);
    }
}
