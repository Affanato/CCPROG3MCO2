import java.util.Scanner;

public class ShopController {

    private ShopModel model;
    private ShopView view;
    private Scanner scanner;

    public ShopController(ShopModel model, ShopView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    /*public void displayShopItems() {
        view.displayShopItems(model);
    } */


    public void purchaseItem(int index) {
        if (index >= 0 && index < model.getArrayListSize()) {
            Weapon weapon = model.getWeapon(index);
            System.out.println("You purchased: " + model.getItemName(index) + " for " + model.getItemCost(index) + " runes.");
            model.removeFromInventory(index);
        } else {
            view.displayErrorMessage("Invalid item index.");
        }
    }

    public void runShop() {
        //displayShopItems();
        if (!model.isEmpty()) {
            System.out.print("Enter the index of the item you want to purchase (or -1 to exit): ");
            int choice = scanner.nextInt();
            if (choice != -1) {
                purchaseItem(choice);
            }
        } else {
            view.displayErrorMessage("There are no more items in the shop.");
        }
    }

}
