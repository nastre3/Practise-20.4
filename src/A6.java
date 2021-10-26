public class A6 {
    public static void main(String[] args) {
        numbers(1, 2, -1);
        print("A7", 6);
        evenNumbers();
        findMedian(1, 2, 3);
        checkTriangle(1, 2, 3);
        printForm(6, 4);
        isPow(245);
        cube(6);
    }

    //A13
    private static void cube(int n) {
        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                System.out.println("The cube of " + i + " is equal " + (i * i * i));
            }
        }
    }

    //A12
    private static void isPow(int n) {
        int count = 0, now = 1;
        while (now < n) {
            now *= 2;
            count++;
        }
        if (now == n) System.out.println(count);
        else System.out.println("NO");
    }

    // A11
    private static void printForm(int m, int n) {
        for (int i = 0; i < m; i++) {
            String s = "";
            for (int j = 0; j < n; j++) {
                s += 8;
            }
            System.out.println(s);
        }
    }

    //A10
    private static void checkTriangle(int a, int b, int c) {
        if ((a < b + c) && (b < c + a) && (c < a + b)) System.out.println("YES");
        else System.out.println("NO");
    }

    //A9
    private static void findMedian(int a, int b, int c) {
        if ((a >= b && a <= c) || (a >= c) && a <= b) System.out.println(a); // if a is median
        else if ((b >= a && b <= c) || (b >= c && b <= a)) System.out.println(b); // if b is median
        else System.out.println(c); // else c - median
    }

    //A8
    private static void evenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    //A7
    private static void print(String string, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(string);
        }
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


