import java.util.ArrayList;

public class ShopModel {
    private ArrayList<Weapon> inventory = new ArrayList<>();

    public ShopModel() {
        initializeInventory();
    }

    private void initializeInventory() {
        // Initialization code as provided in the question
    }

    public void displayItems() {
        // Display code as provided in the question
    }

    public void removeFromInventory(int index) {
        inventory.remove(index);
    }

    public Weapon getWeapon(int index) {
        return inventory.get(index);
    }

    public String getItemName(int index) {
        return inventory.get(index).getName();
    }

    public int getItemCost(int index) {
        return inventory.get(index).getCost();
    }

    public int getArrayListSize() {
        return inventory.size();
    }

    public boolean isEmpty() {
        return inventory.isEmpty();
    }
}
