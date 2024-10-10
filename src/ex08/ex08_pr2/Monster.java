package ex08.ex08_pr2;

class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30;
    public Monster(String s) {
        name = s;
        hp = maxHp;
    }
    public void attack(Monster enemy) {
        enemy.hp -= 10;
        System.out.println(name + "의 공격 -> " + enemy.name + "의 체력: " + enemy.hp + "/" + maxHp);
    }
    public static void battle(Monster a, Monster b) {
        int turn = 0;
        while (a.hp > 0 && b.hp > 0) {
            if (turn % 2 == 0) {
                a.attack(b);
            } else {
                b.attack(a);
            }
            turn++;
        }
    }
}

