package lotr;

public class Character {
    private int power;
    private int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public void kick(Character c) {
        c.setHp(c.getHp() - power);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
        return "Character{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }
}
