import java.util.Random;

/**
 * The Treasure class represents a treasure in the game world.
 */
public class Treasure {
    private boolean isActive = true;

    /**
     * Constructs a Treasure object.
     */
    public Treasure() {
    }

    /**
     * Gives treasure to the character based on the area index.
     *
     * @param character The character receiving the treasure.
     * @param areaIndex The index of the area.
     */
    public void giveTreasure(Character character, int areaIndex) {
        if (this.isActive) {
            Random random = new Random();
            int runesGained = areaIndex * (random.nextInt(101) + 50);

            System.out.println(character.getName() + " gained " + runesGained + " runes from the treasure!");
            character.receiveRunes(runesGained);

            this.isActive = false;
        } else {
            System.out.println("Treasurer has already been collected\n");
        }
    }
}
