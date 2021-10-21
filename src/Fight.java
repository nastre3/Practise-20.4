// Задача 5
public class Fight {
    public static void main(String[] args) {
        Player player = new Player();
        Boss boss = new Boss();
        player.health = 3;
        player.power = 2;
        boss.health = 4;
        boss.power = 1;
        fight(player, boss);
    }

    private static void fight(Player player, Boss boss) {
        while (boss.isLive == true || player.isLive == true) {
            boss.health -= player.power;
            player.health -= boss.power;
            System.out.println(boss.health);
            System.out.println(player.health);

            if (boss.health == 0) {
                boss.isLive = false;
                System.out.println("Player wins!");
                break;
            }
            if (player.health == 0) {
                player.isLive = false;
                System.out.println("Boss wins!");
                break;
            }
        }
    }
}
