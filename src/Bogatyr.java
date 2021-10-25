public class Bogatyr {
    public static void main(String[] args) {
        Bogatyr bogatyr = new Bogatyr();
        bogatyr.idtiBitGorynycha();
    }

    private String name = "Добрыня";
    private String classBogatyr = "Богатырь";
    private String weapon = "Меч - Кладенец (Урон: 100)";
    private Boolean idtiBitGorynycha = true;
    private final int golovaB = 1;

    public void idtiBitGorynycha() {
        System.out.println("Выходим из Киева...");
        System.out.println("Идем на Кудыкину гору...");
        System.out.println("Садимся на коня...");
        System.out.println("Где эта змеюка...?");
    }

    public void golovy() {
        if (golovaB < 3) {
            System.out.println("Одна голова хорошо, а три - уже Горыныч.");
        }
    }

    public void Bitva() {
        int udar = 0;
        byte dpt = 0; // Damage Per Turn
        while (udar < 3) {
            udar += 1;
            dpt += dpt;
            System.out.println("Минус одна голова...");
            System.out.println("Суммарный урон: " + dpt);
        }
        if (udar == 3) {
            System.out.println("Горыныч побежден.");
        }
    }
}