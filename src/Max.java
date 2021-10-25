public class Max {
    public static void main(String[] args) {
        max(5, 6, 7, 7);
    }
public static void max(int a, int b, int c, int d) {
        // write your code here
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
    }
}
