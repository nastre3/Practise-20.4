public class A6 {
    public static void main(String[] args) {
        numbers(1, 2, -1);
    }

    private static void numbers(int a, int b, int c) {
        int positive = 0, negative = 0, zero = 0;
        if (a > 0) positive++;
        else if (a < 0) negative++;
        else zero++;

        if (b > 0) positive++;
        else if (b < 0) negative++;
        else zero++;

        if (c > 0) positive++;
        else if (c < 0) negative++;
        else zero++;

        System.out.println(positive + " positive, " + negative + " negative, " + zero + " equal 0");
    }
}


