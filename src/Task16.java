public class Task16 { // Таблица умножения
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int f = 0; f < 10; f++) {
                if (f == 0) {
                    System.out.print(i + "  "); // Первый символ показывает цифру, на которую умножается ряд
                } else {
                    System.out.print(" " + i * f + " "); // результаты в ряд по горизонтали
                }
            }
            System.out.println();
        }
    }
}