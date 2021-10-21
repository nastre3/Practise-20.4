public class Fight2 {
    public static void main(String[] args) {
        Player ork = new Player();
        Boss elf = new Boss();
        fight2(ork, elf);
    }
    private static void fight2(Player ork, Boss elf) {
        while (true) {
            if (!ork.isLive && elf.isLive) {
                System.out.println("Ork is dead. Elf win!");
                break;
            } else if (ork.isLive && !elf.isLive) {
                System.out.println("Elf is dead. Ork win!");
                break;
            } else if (!ork.isLive && !elf.isLive) {
                System.out.println("All is dead...");
                break;
            }
            if (elf.health < 0) {
                elf.isLive = false;
            } else {
                elf.health -= ork.power;
            }
            if (ork.health < 0) {
                ork.isLive = false;
            } else {
                ork.health -= elf.power;
            }
        }
    }
}