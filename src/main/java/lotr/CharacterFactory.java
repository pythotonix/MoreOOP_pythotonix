package lotr;

public class CharacterFactory {
    private static Class<?>[] characterClasses = {Hobbit.class, Elf.class, Knight.class, King.class};
    public Character createCharacter() throws Exception {
        int random = Helper.getRandomNumber(0, 3);
        return (Character) characterClasses[random].getDeclaredConstructor().newInstance();
    }
}
