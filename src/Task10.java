import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in); // создание сканнера для считывания из консоли
        System.out.println("Введите ваш возраст");
        age = sc.nextInt();
        if (age >= 0 && age < 14) {
            System.out.println("Прокол ушей в присутствии родителей");
        } else if (age >=14 && age <=18) {
            System.out.println("Прокол ушей, пупка, языка, носа в присутствии родителей");
        } else if (age > 18 && age <100) {
            System.out.println("Без ограничений");
        } else {
            System.out.println("Неверный возраст");
        }
    }
}
