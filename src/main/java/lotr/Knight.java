package lotr;

public class Knight extends Character {
    public Knight() {
        super(Helper.getRandomNumber(2, 12), Helper.getRandomNumber(2, 12));
    }

    @Override
    public void kick(Character c) {
        Helper.kick(this, c);
    }

    @Override
    public String toString() {
        return "Knight{" +
                "hp=" + getHp() +
                ", power=" + getPower() +
                '}';
    }
}