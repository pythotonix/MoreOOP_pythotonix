package lotr;

import java.util.Random;

public class Helper {
    public static int getRandomNumber(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    public static void kick(Character attacker, Character defender) {
        defender.setHp(defender.getHp() - getRandomNumber(0, defender.getPower()));
    }
}
