import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int val1;
        int attempts;

        //Создаем экземпляр класса Random()
        Random rand = new Random();

        //Создаем переменную типа int
        int randInt;
        int highNumber;
        int lowNumber;

        Scanner sc = new Scanner(System.in); // создание сканнера для считывания из консоли
        System.out.println("Введите число попыток");
        attempts = sc.nextInt();
        System.out.println("Введите нижний предел загадываемого числа");
        lowNumber = sc.nextInt();
        System.out.println("Введите верхний предел загадываемого числа");
        highNumber = sc.nextInt();

        //Сохраняем случайное число в переменной randInt;
        randInt = rand.nextInt(highNumber) + lowNumber; // диапазон от 1 до 10

        int i = 0;
            do {
                System.out.println("Введите отгадываемое число");
                val1 = sc.nextInt();
                i++;
                if (val1 == randInt) {
                    System.out.println("Совершенно верно! Это и есть загаданное мною число!");
                    break;
                } else if (val1 > randInt) {
                    System.out.println("Загаданное мною число меньше");
                } else if (val1 < randInt) {
                    System.out.println("Загаданное мною число больше");
                }
            } while (val1 !=randInt && i < attempts);

            if (i == attempts) {
                System.out.println("Число попыток закончилось");
            }
    }
}