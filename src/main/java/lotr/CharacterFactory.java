package lotr;

public class CharacterFactory {
    public static Character createCharacter() {
        int random = Helper.getRandomNumber(0, 2);
        switch (random) {
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new Knight();
            default:
                return null;
        }
    }
}
