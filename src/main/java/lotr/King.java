package lotr;
import java.util.Random;
public class King extends Character {
    public static int getRandomNumber(int low, int high) {
        Random random = new Random();
        return random.nextInt(high-low+1) + low;
    }
    
    public King() {
        super(getRandomNumber(5, 15), getRandomNumber(5, 15));
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - getRandomNumber(0, c.getPower()));
    }
}
