public class Bogatyr {
    public static void main(String[] args) {
        Bogatyr bogatyr = new Bogatyr();
        bogatyr.idtiBitGorynycha();
    }

    private String name = "Добрыня";
    private final String classBogatyr = "Богатырь";
    private String weapon = "Меч - Кладенец (Урон: 100)";
    private int damage = 100;
    //private Boolean idtiBitGorynycha = true;

    public void idtiBitGorynycha() {
        moveFromKiev();
        movetoMountain();
        useHorse();
        findMonster();
        compareGolovy();
        bitva();
    }

    private void findMonster() {
        System.out.println("Где эта змеюка...?");
    }

    private void useHorse() {
        System.out.println("Садимся на коня...");
    }

    private void movetoMountain() {
        System.out.println("Идем на Кудыкину гору...");
    }

    private void moveFromKiev() {
        System.out.println("Выходим из Киева...");
    }

    public void compareGolovy() {
        int golovaB = 1;
        if (golovaB < 3) {
            System.out.println("Одна голова хорошо, а три - уже Горыныч.");
        }
    }

    public void bitva() {
        int udar = 0;
        int dpt = 0; // Damage Per Turn

        switch (udar) {     // Описания ударов могут различаться
            case 0:
                udar++;
                dpt += damage;
                System.out.println("Первая голова отрублена");
                System.out.println("Суммарный урон: " + dpt);
            case 1:
                udar++;
                dpt += damage;
                System.out.println("Вторая голова отрублена");
                System.out.println("Суммарный урон: " + dpt);
            case 2:
                udar++;
                dpt += damage;
                System.out.println("Третья голова отрублена");
                System.out.println("Суммарный урон: " + dpt);
            case 3:
                System.out.println("Горыныч побежден.");
                break;
        }
    }
}