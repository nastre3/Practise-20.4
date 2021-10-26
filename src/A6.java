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
        findFactorial(3);
        years(2021);
        signal(9.8);
        numberToWorld(123);
    }

    //A17
    private static void numberToWorld(int i) {
        String result = "";
        if (i%2==0) {
            result += "even";
        } else {
            result += "odd";
        }
        if (i >=0 && i<=10) {
            result += " single digit ";
        } else if (i>=10 && i<=100) result += " two-digit ";
        else result += " three-digit ";

        System.out.println(result + "number");
    }

    //A16
    private static void signal(double time) {
        time %= 5;
            if (time>=0 &&time<3) {
                System.out.println("green");
            } else if (time>=3 && time<4) {
                System.out.println("yellow");
            } else {
                System.out.println("red");
            }
        //0-3 green
        //3-4 yellow
        //4-5 red
    }

    //A15
    private static void years(int year) {
        boolean isLeap;
        if (year % 400 == 0) isLeap = true;
        else if (year % 100 == 0) isLeap = false;
        else if (year % 4 == 0) isLeap = true;
        else isLeap = false;

        System.out.println(isLeap ? "This year is a leap year" : "This year is not a leap year");
    }

    //A14
    private static void findFactorial(int n) {
        int result = 1;
        for (int i=1;i<=n;i++) {
            result *= i;
        }
        System.out.println(result);
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


