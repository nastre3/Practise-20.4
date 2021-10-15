public class Weight {
    public static void main(String[] args) {
        // Задача 2 - вычислить индекс массы тела человека.
        int weight = 45;
        float height = 1.66f;
        System.out.println(bodyMassIndex(weight,height));
    }

    private static String bodyMassIndex(int weight, float height) {
        float bodyMassIndex = weight / (height * height);
        System.out.println(bodyMassIndex);
        if (bodyMassIndex <= 15.99) {
            return "Выраженный дефицит массы тела\n Необходима срочная консультация специалиста";
        } else if (bodyMassIndex <= 18.49) {
            return "Недостаточная (дефицит) масса тела\n Необходима консультация специалиста";
        } else if (bodyMassIndex <= 24.99) {
            return "Недостаточная (дефицит) масса тела\n Необходима консультация специалиста";
        } else if (bodyMassIndex <= 29.99) {
            return "Недостаточная (дефицит) масса тела\n Необходима консультация специалиста";
        } else if (bodyMassIndex <= 34.99) {
            return "Недостаточная (дефицит) масса тела\n Необходима консультация специалиста";
        } else if (bodyMassIndex <= 39.99) {
            return "Недостаточная (дефицит) масса тела\n Необходима консультация специалиста";
        } else if (bodyMassIndex >= 40.00) {
            return "Недостаточная (дефицит) масса тела\n Необходима консультация специалиста";
        } else {
            return "Невалидный ввод";
        }
    }
}
