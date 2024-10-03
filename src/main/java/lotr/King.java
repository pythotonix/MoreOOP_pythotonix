package lotr;

public class King extends Character {
    public King() {
        super(Helper.getRandomNumber(5, 15), Helper.getRandomNumber(5, 15));
    }

    @Override
    public void kick(Character c) {
        Helper.kick(this, c);
    }

    @Override
    public String toString() {
        return "King{" +
                "hp=" + getHp() +
                ", power=" + getPower() +
                '}';
    }
}