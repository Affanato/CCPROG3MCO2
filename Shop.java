import java.util.ArrayList;

/**
 * The Shop class represents a shop where players can buy weapons.
 */
public class Shop {
    private ArrayList<Weapon> inventory = new ArrayList<>();

    /**
     * Constructs a new Shop object and initializes its inventory with weapons.
     */
    public Shop() {
        // Initialize the inventory with weapons
        Weapon w11 = new Weapon(1, 1);
        Weapon w12 = new Weapon(1, 2);
        Weapon w13 = new Weapon(1, 3);
        Weapon w14 = new Weapon(1, 4);
        Weapon w21 = new Weapon(2, 1);
        Weapon w22 = new Weapon(2, 2);
        Weapon w23 = new Weapon(2, 3);
        Weapon w24 = new Weapon(2, 4);
        Weapon w31 = new Weapon(3, 1);
        Weapon w32 = new Weapon(3, 2);
        Weapon w33 = new Weapon(3, 3);
        Weapon w34 = new Weapon(3, 4);
        Weapon w41 = new Weapon(4, 1);
        Weapon w42 = new Weapon(4, 2);
        Weapon w43 = new Weapon(4, 3);
        Weapon w44 = new Weapon(4, 4);
        Weapon w51 = new Weapon(5, 1);
        Weapon w52 = new Weapon(5, 2);
        Weapon w53 = new Weapon(5, 3);
        Weapon w54 = new Weapon(5, 4);
        Weapon w61 = new Weapon(6, 1);
        Weapon w62 = new Weapon(6, 2);
        Weapon w63 = new Weapon(6, 3);
        Weapon w64 = new Weapon(6, 4);

        // Add weapons to the inventory3

        inventory.add(w12);
        inventory.add(w13);
        inventory.add(w14);
        inventory.add(w21);
        inventory.add(w22);
        inventory.add(w23);
        inventory.add(w24);
        inventory.add(w31);
        inventory.add(w32);
        inventory.add(w33);
        inventory.add(w34);
        inventory.add(w41);
        inventory.add(w42);
        inventory.add(w43);
        inventory.add(w44);
        inventory.add(w51);
        inventory.add(w52);
        inventory.add(w53);
        inventory.add(w54);
        inventory.add(w61);
        inventory.add(w62);
        inventory.add(w63);
        inventory.add(w64);
    }

    /**
     * Retrieves the weapon at the specified index in the inventory.
     *
     * @param index The index of the weapon to retrieve.
     * @return The weapon at the specified index.
     */
    public Weapon getWeapon(int index) {
        return inventory.get(index);
    }

    /**
     * Retrieves the name of the item at the specified index in the inventory.
     *
     * @param index The index of the item.
     * @return The name of the item.
     */
    public int getItemCost(int index) {
        return inventory.get(index).getCost();
    }

    /**
     * Retrieves the size of the inventory.
     *
     * @return The size of the inventory.
     */
    public int getArrayListSize() {
        return inventory.size();
    }

    /**
     * Checks if the inventory is empty.
     *
     * @return true if the inventory is empty, otherwise false.
     */
}
