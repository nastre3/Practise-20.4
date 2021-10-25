public class A5 {
    public static void main(String[] args) {
        checkDay(2);
    }

    private static void checkDay(int number) {
        String result = switch (number) {
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            case 7 -> "sunday";
            default -> "Wrong format";
        };
        System.out.println(result);
    }
}
