// Задача 6
public class ConditionsAndCycles {
    public static void main(String[] args) {
        int a = 4, b = 3, c = 2;
        b = b + c; // 5
        System.out.println(b);
        //a = a * b; // 20
        System.out.println(a);
        c = a - c; // 18
        System.out.println(c);
        //a = a + b; // 25
        System.out.println(a);
        a = a - b; // 20
        System.out.println(a);
        c = a + b; // 25
        System.out.println(c);
        //b = c / a; // 1
        System.out.println(b);
        a = b + c; // 26
        System.out.println(a);
        a = a + c + b; // 52
        System.out.println(a);

        // Необходимо закомментировать некоторые из строк так, чтобы переменная a приняла значение 18. Вывести её в консоль 20 раз.
        for (int i = 0; i < 20; i++) {
            System.out.println(a);
        }
    }
}