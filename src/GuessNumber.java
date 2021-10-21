import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int val1;

        //Создаем экземпляр класса Random()
        Random rand = new Random();

        //Создаем переменную типа int
        int randInt;

        //Сохраняем случайное число в переменной randInt;
        randInt = rand.nextInt(10) + 1; // диапазон от 1 до 10

        Scanner sc = new Scanner(System.in); // создание сканнера для считывания из консоли
        do {
        val1 = sc.nextInt();
        if (val1 == randInt) {
            System.out.println("Совершенно верно! Это и есть загаданное мною число!");
            break;
        } else if (val1 > randInt) {
            System.out.println("Загаданное мною число меньше");
        } else if (val1 < randInt) {
            System.out.println("Загаданное мною число больше");
        }
        } while (val1 !=randInt);
    }
}