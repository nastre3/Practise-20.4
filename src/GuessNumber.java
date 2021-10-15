import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {

        //Создаем экземпляр класса Random()
        Random rand = new Random();

        //Создаем переменную типа int
        int randInt;

        //Сохраняем случайное число в переменной randInt;
        randInt = rand.nextInt(10) + 1; // диапазон от 1 до 10
    }
}