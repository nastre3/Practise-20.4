public class Orange {
    public static void main(String[] args) {
        TaskA1 orange = new TaskA1();
        orange.addPrice(50);
        TaskA1 orange1 = new TaskA1();
        orange1.addPrice(100);
        System.out.println("Total cost: " + TaskA1.orangePrice);

    }

    public static class TaskA1 {
        public static int orangePrice = 0;

        public void addPrice(int price) {
            orangePrice += price;
        }
    }
}
