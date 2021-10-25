public class Max {
    public static void main(String[] args) {
        max(5, 6, 7, 7);
    }

    public static void max(int a, int b, int c, int d) {
        // 1st version
    /*
        if (a >= b) {
            if (a >= c) {
                if (a >= d) {
                    System.out.println(a);
                }
            }
        } else if (b >= c) {
            if (b >= d) {
                System.out.println(b);
            }
        } else if (c >= d) {
            System.out.println(c);
        } else if (d >= c) {
            System.out.println(d);
        }
    */
        //2nd version
        int max1 = a > b ? a : b;
        int max2 = c > d ? c : d;
        int max = max1 > max2 ? max1 : max2;
        System.out.println(max);
    }
}
