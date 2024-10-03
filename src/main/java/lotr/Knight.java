package lotr;
import java.util.Random;
public class Knight extends Character {
    public static int getRandomNumber(int low, int high) {
        Random random = new Random();
        return random.nextInt(high-low+1) + low;
    }

    public Knight() {
        super(getRandomNumber(2, 12), getRandomNumber(2, 12));
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - getRandomNumber(0, c.getPower()));
    }
}
