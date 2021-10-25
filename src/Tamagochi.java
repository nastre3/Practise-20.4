import java.util.Scanner;

public class Tamagochi {

    private static boolean isQuit = false;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя кота");
        Cat cat = new Cat();
        cat.catName = console.next();
        System.out.println("Кот " + cat.catName + " создан!");

        do {
             for (int countMenu =0; countMenu<100; countMenu++) {
                openMenu(cat);// меню кота
                cat.catWeight-=0.2f;
                cat.catHunger--;
                if (cat.catHunger < 0) {
                     cat.catHunger = 0;
                 } else if (cat.catWeight <0) {
                     cat.catWeight = 0;
                 } else if (cat.catPlay < 0) {
                     cat.catPlay = 0;
                 }
                System.out.println(countMenu);

                if (countMenu >= 20) {
                    cat.catAge++;
                }
            }
        }
        while (!isQuit);
    }

    public static void openMenu(Cat cat) {

        System.out.println("Что сделать с котом? 1 - покормить, 2 - поиграть, 3 - показать состояние, s - выйти");
        Scanner console3 = new Scanner(System.in);
        String actionType = console3.next();
        switch (actionType) {
            case "1":
                feedCat(cat);
                break;
            case "2":
                playWithCat(cat);
                break;
            case "3":
                showCatStatus(cat);
                break;
            case "s":
                isQuit = true;
                break;
            default:
                System.out.println("Неверный номер действия");
        }

    }

    private static void showCatStatus(Cat cat) {
        System.out.println("Возраст кота = " + cat.catAge);
        System.out.println("Вес кота = " + cat.catWeight);
        System.out.println("Голод кота = " + cat.catHunger);
        System.out.println("Желание играть кота = " + cat.catPlay);
    }

    private static void playWithCat(Cat cat) {
        if (cat.catHunger >= 0 && cat.catHunger <= 20 || cat.catHunger >= 90 && cat.catHunger <= 100) {
            System.out.println("Кот отказывается играть: хочет есть или переел");
        } else if (cat.catPlay == 100) {
            System.out.println("Кот наигрался на 100");
        } else {
            cat.catPlay+=10;
        }
    }

    private static void feedCat(Cat cat) {
        if (cat.catHunger > 50) {
            System.out.println("Кот отказывается есть так много");
        } else {
            // кормить кота
            System.out.println("Выберите блюдо: 1 - Рыба, 2 - Мясо, 3 - Китикет");
            String dish;
            Scanner console2 = new Scanner(System.in);
            dish = console2.next();
            switch (dish) {
                case "1":
                    cat.catHunger += 20;
                    cat.catHunger += 1;
                    System.out.println("Кот поел рыбу");
                    break;
                case "2":
                    cat.catHunger += 30;
                    cat.catWeight += 2;
                    System.out.println("Кот поел мясо");
                    break;
                case "3":
                    cat.catHunger += 10;
                    cat.catWeight += 0.5f;
                    System.out.println("Кот поел китикет");
                    break;
                default:
                    System.out.println("Неверный номер блюда");
            }
        }
    }
}
