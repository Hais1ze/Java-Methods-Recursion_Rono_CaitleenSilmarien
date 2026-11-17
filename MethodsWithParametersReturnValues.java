package methods.with.parameters.pkgreturn.values;

public class MethodsWithParametersReturnValues {

    public static void main(String[] args) {
        // TODO code application logic here
        int tot = 10;
        int waw = 0;
        double ans = computeAverage(tot, waw);
        System.out.println("Total: " + ans);

    }

    static double computeAverage(int total, int count) {
        if (count <= 0) {
            return (double) 0.0;
        }
        return (double) total / count;
    }

}

//1. Why does the method need the word double (or a cast) in the return?
// it needs the word double (or a cast) because returning 0.0 is a
//decimal so it needs to be converted using double since we used int as an input.


//2. What would go wrong without the count <= 0 guard?
// Instead of 0.0 the program will divide by 0 and give a different answer. so the count<=0 guard
// catches the bad input and safely returns 0.0.