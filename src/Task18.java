import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value n: ");
        int n = scanner.nextInt();
        System.out.println("enter value x: ");
        int x = scanner.nextInt();
        Summ summ = new Summ();
        float result = summ.calculate(n, x);
        System.out.println("result = " +result);
    }
}