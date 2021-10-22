import java.util.Scanner;

public class Tamagochi {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя кота");
        Cat cat = new Cat();
        cat.catName = console.next();
        System.out.println("Кот " + cat.catName + " создан!");
        boolean isQuit = false;
        do {
            openMenu(cat);// меню кота
        }
        while (!isQuit);
    }

    private static void openMenu(Cat cat) {
        int menuCounter = 0;
        System.out.println("Что сделать с котом? 1 - покормить, 2 - поиграть, 3 - показать состояние");
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
                // isQuit = true;
                break;
            default:
                System.out.println("Неверный номер действия");
        }
        menuCounter++;
        cat.catWeight--;
        cat.catHunger++;

        if (menuCounter % 20 == 0) {
            cat.catAge++;
        }
    }

    private static void showCatStatus(Cat cat) {
        System.out.println("Возраст кота = " + cat.catAge);
        System.out.println("Вес кота = " + cat.catWeight);
        System.out.println("Голод кота = " + cat.catHunger);
        System.out.println("Желание играть кота = " + cat.catPlay);
        openMenu(cat);
    }

    private static void playWithCat(Cat cat) {
        if (cat.catHunger >= 0 && cat.catHunger <= 20 || cat.catHunger >= 90 && cat.catHunger <= 100) {
            System.out.println("Кот отказывается играть: хочет есть или переел");
            openMenu(cat);
        } else if (cat.catPlay == 100) {
            System.out.println("Кот наигрался на 100");
            openMenu(cat);
        }
    }

    private static void feedCat(Cat cat) {
        if (cat.catHunger > 50) {
            System.out.println("Кот отказывается есть так много");
            openMenu(cat);
        } else {
            // кормить кота
            System.out.println("Выберите блюдо: 1 - Рыба, 2 - Мясо, 3 - Китикет");
            String dish;
            Scanner console2 = new Scanner(System.in);
            dish = console2.next();
            switch (dish) {
                case "1":
                    cat.catHunger -= 20;
                    System.out.println("Кот поел рыбу");
                    openMenu(cat);
                    break;
                case "2":
                    cat.catHunger -= 30;
                    System.out.println("Кот поел мясо");
                    openMenu(cat);
                    break;
                case "3":
                    cat.catHunger -= 10;
                    System.out.println("Кот поел китикет");
                    openMenu(cat);
                    break;
                default:
                    System.out.println("Неверный номер блюда");
            }
        }
    }
}
