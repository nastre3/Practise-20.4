public class Task13 {
    public static void main(String[] args) {
        int volume1 = 30;
        int volume2 = 0;
        while (volume1 > 0) {
            volume1--;
            if (volume1%10 != 0) {
                volume2++;
            }
            System.out.println(volume1);
            System.out.println(volume2);
        }
    }
}
