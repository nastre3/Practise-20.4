// Проверить на практике утверждение, что на отрезке от 0 до 2PI y=sin(cos(x)) всегда будет больше, чем y=cos(sin(x)).
//
//Входные данные:
//
//Нижнее значение отрезка.
//Верхнее значение отрезка.
//Шаг дискретизации.

public class Trig {
    public static void main(String[] args) {
        double lowValue = 0;
        double highValue = 360;
        int step = 30;
        calculateTrig(lowValue,highValue,step);
    }

    private static void calculateTrig(double lowValue, double highValue, int step) {
        // converting values to radians
        for (double i = lowValue; i <= highValue; i += step) {
            double b = Math.toRadians(i);
            System.out.println(Math.sin(Math.cos(b)));
            System.out.println(Math.cos(Math.sin(b)));
            if (Math.sin(Math.cos(b)) > Math.cos(Math.sin(b))) {
                System.out.println("Верно");
            } else {
                System.out.println("Неверно");
            }
        }
    }
}
