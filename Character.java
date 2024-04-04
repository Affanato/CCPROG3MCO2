import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Represents a character in the game.
 */
public class Character {
    private String name;
    private Weapon equiped = null;
    private ArrayList<Weapon> inventory = new ArrayList<>();
    private Job job;
    private int runes;
    private int level;
    private int hp;
    private int dex;
    private int inte;
    private int end;
    private int str;
    private int fth;
    private ArrayList<Area> areas = new ArrayList<Area>();
    private int currentAreaIndex;
    private int currentFloorNumber;
    private int currentTileIndex;
    private int currentHp;
    private boolean selectedDodge;
    private boolean isBattling = false;
    private Scanner scanner = new Scanner(System.in);
    public Character(String name, int jobInt) {
        Job job = new Job(jobInt);
        this.name = name.length() > 25 ? name.substring(0, 25) : name;
        this.job = job;
        this.runes = 0;
        this.equiped = new Weapon(0,0);
        this.inventory.add(new Weapon(0,0));

        areas.add(new Area(0));
        areas.add(new Area(1));
        areas.add(new Area(2));
        areas.add(new Area(3));

        this.level = job.getBaseLevel();
        this.hp = job.getBaseHp();
        this.dex = job.getBaseDex();
        this.inte = job.getBaseInt();
        this.end = job.getBaseEnd();
        this.str = job.getBaseStr();
        this.fth = job.getBaseFth();
        this.currentHp = + (100) * ((this.getHp()) / 2);

        if(this.job.getJobName() == "Vagabond") {
            this.inventory.add(new Weapon(1,1));
        } else if (this.job.getJobName() == "Samurai") {
            this.inventory.add(new Weapon (2,1));
        } else if (this.job.getJobName() == "Warrior") {
            this.inventory.add(new Weapon (4,1));
        } else if (this.job.getJobName() == "Hero") {
            this.inventory.add(new Weapon (4,1));
        } else if (this.job.getJobName() == "Astrologer") {
            this.inventory.add(new Weapon(5,1));
        } else if (this.job.getJobName() == "Prophet") {
            this.inventory.add(new Weapon(6,1));
        }
    }

    /**
     * Changes the name of the character.
     *
     * @param name The new name of the character.
     */
    public void changeName(String name) {
        this.name = name.length() > 25 ? name.substring(0, 25) : name;
    }

    /**
     * Buys an item from the shop.
     *
     * @param shop  The shop from which to buy.
     * @param index The index of the item in the shop.
     */
    public void buyFromShop(Shop shop, int index) {
        inventory.add(shop.getWeapon(index));
        this.runes -= shop.getItemCost(index);
    }

    /**
     * Equips a weapon from the character's inventory.
     *
     * @param index The index of the weapon to equip.
     */
    public void equipWeapon(int index) {
        this.equiped = inventory.get(index);
        this.currentHp = 100 * ((this.equiped.getHp() + this.hp) / 2);
    }

    /**
     * Levels up the character's stats.
     *
     * @param statSelector The stat to level up.
     */
    public void levelUp(int statSelector) {
        int levelCost = (this.level * 100) / 2;

        if (this.runes > levelCost) {
            switch (statSelector) {
                case 1:
                    this.hp += 1;
                    this.level += 1;
                    this.runes = this.runes - levelCost;
                    break;
                case 2:
                    this.dex += 1;
                    this.level += 1;
                    this.runes = this.runes - levelCost;
                    break;
                case 3:
                    this.inte += 1;
                    this.level += 1;
                    this.runes = this.runes - levelCost;
                    break;
                case 4:
                    this.end += 1;
                    this.level += 1;
                    this.runes = this.runes - levelCost;
                    break;
                case 5:
                    this.str += 1;
                    this.level += 1;
                    this.runes = this.runes - levelCost;
                    break;
                case 6:
                    this.fth += 1;
                    this.level += 1;
                    this.runes = this.runes - levelCost;
                    break;
            }
        }
    }

    /**
     * Moves the character to a new tile.
     *
     * @param movement The direction of movement (W, A, S, D).
     */
    public void moveTile(char movement) {
        int movementType = 0;
        int movingTo;

        if (movement == 'w' || movement == 'W') {
            movementType = 1; // Moving Up
        } else if (movement == 'a' || movement == 'A') {
            movementType = 2; // Moving Left
        } else if (movement == 's' || movement == 'S') {
            movementType = 3; // Moving Down
        } else if (movement == 'd' || movement == 'D') {
            movementType = 4; // Moving Right
        } else {
            return;
        }

        if (1 <= movementType && movementType <= 4) {
            Floor currentFloor = areas.get(currentAreaIndex).getFloors().get(currentFloorNumber);

            switch (movementType) {
                case 1:
                    // Moving Up
                    movingTo = this.currentTileIndex - currentFloor.getWidth();
                    if (movingTo < 0 || currentFloor.getTileType(movingTo) == Tile.TileType.OutOfBounds) {
                        System.out.println("Cannot move to this tile.\n");
                        return;
                    }
                    break;
                case 2:
                    // Moving Left
                    movingTo = this.currentTileIndex - 1;
                    if ((this.currentTileIndex % currentFloor.getWidth() == 0)
                            || currentFloor.getTileType(movingTo) == Tile.TileType.OutOfBounds) {
                        System.out.println("Cannot move to this tile.\n");
                        return;
                    }
                    break;
                case 3:
                    // Moving Down
                    movingTo = this.currentTileIndex + currentFloor.getWidth();
                    if (movingTo >= currentFloor.getTilesSize()
                            || currentFloor.getTileType(movingTo) == Tile.TileType.OutOfBounds) {
                        System.out.println("Cannot move to this tile.\n");
                        return;
                    }
                    break;
                case 4:
                    // Moving Right
                    if (this.currentTileIndex % currentFloor.getWidth() != currentFloor.getWidth() - 1) {
                        movingTo = this.currentTileIndex + 1;
                        if (currentFloor.getTileType(movingTo) == Tile.TileType.OutOfBounds) {
                            System.out.println("Cannot move to this tile.\n");
                            return;
                        }
                    } else {
                        System.out.println("Cannot move to this tile.\n");
                        return;
                    }
                    break;
                default:
                    movingTo = this.currentTileIndex; // Default to current position for an invalid movement
            }

            this.currentTileIndex = movingTo;
            currentFloor.displayFloor(this);
        } else {
            System.out.println("Please enter a valid input to move (WASD).\n");
        }
    }

    /**
     * Fast travels the character to a specific area.
     *
     * @param destinationAreaIndex The index of the destination area.
     * @param fastTravelTileIndex  The index of the fast travel tile.
     */
    public void fastTravelToArea(int destinationAreaIndex, int fastTravelTileIndex) {

        boolean canFastTravel = (currentAreaIndex == 0)
                || (areas.get(currentAreaIndex).getFloors().get(currentFloorNumber).getTiles().get(currentTileIndex)
                .getTileType() == Tile.TileType.FastTravelTile);

        // Reset HP and spawn tiles when returning to the Game Lobby (Area 0)
        if (destinationAreaIndex == 0) {
            currentAreaIndex = destinationAreaIndex;
            currentHp = 100 * ((hp + equiped.getHp()) / 2);

            //Reset all Area 1 Spawn Tiles
            areas.get(1).getFloors().get(0).getTiles().get(3).turnOn();
            areas.get(1).getFloors().get(0).getTiles().get(5).turnOn();
            areas.get(1).getFloors().get(1).getTiles().get(10).turnOn();
            areas.get(1).getFloors().get(1).getTiles().get(21).turnOn();
            areas.get(1).getFloors().get(1).getTiles().get(23).turnOn();
            areas.get(1).getFloors().get(1).getTiles().get(24).turnOn();
            areas.get(1).getFloors().get(1).getTiles().get(25).turnOn();
            areas.get(1).getFloors().get(1).getTiles().get(27).turnOn();
            areas.get(1).getFloors().get(1).getTiles().get(37).turnOn();
            areas.get(1).getFloors().get(1).getTiles().get(39).turnOn();

            //Reset all Area 2 Spawn Tiles
            areas.get(2).getFloors().get(0).getTiles().get(16).turnOn();
            areas.get(2).getFloors().get(0).getTiles().get(18).turnOn();
            areas.get(2).getFloors().get(1).getTiles().get(3).turnOn();
            areas.get(2).getFloors().get(1).getTiles().get(9).turnOn();
            areas.get(2).getFloors().get(1).getTiles().get(15).turnOn();
            areas.get(2).getFloors().get(2).getTiles().get(7).turnOn();
            areas.get(2).getFloors().get(2).getTiles().get(27).turnOn();
            areas.get(2).getFloors().get(3).getTiles().get(2).turnOn();
            areas.get(2).getFloors().get(3).getTiles().get(4).turnOn();
            areas.get(2).getFloors().get(3).getTiles().get(14).turnOn();
            areas.get(2).getFloors().get(3).getTiles().get(16).turnOn();
            areas.get(2).getFloors().get(4).getTiles().get(16).turnOn();
            areas.get(2).getFloors().get(4).getTiles().get(18).turnOn();
            areas.get(2).getFloors().get(4).getTiles().get(20).turnOn();
            areas.get(2).getFloors().get(4).getTiles().get(30).turnOn();
            areas.get(2).getFloors().get(4).getTiles().get(34).turnOn();
            areas.get(2).getFloors().get(4).getTiles().get(44).turnOn();
            areas.get(2).getFloors().get(4).getTiles().get(48).turnOn();

            //Reset all Area 3 Spawn Tiles
            areas.get(3).getFloors().get(0).getTiles().get(13).turnOn();
            areas.get(3).getFloors().get(2).getTiles().get(3).turnOn();
            areas.get(3).getFloors().get(2).getTiles().get(5).turnOn();
            areas.get(3).getFloors().get(2).getTiles().get(9).turnOn();
            areas.get(3).getFloors().get(2).getTiles().get(11).turnOn();
            areas.get(3).getFloors().get(2).getTiles().get(15).turnOn();
            areas.get(3).getFloors().get(2).getTiles().get(17).turnOn();
            areas.get(3).getFloors().get(2).getTiles().get(21).turnOn();
            areas.get(3).getFloors().get(2).getTiles().get(23).turnOn();

        } else if ((destinationAreaIndex == 1) && (fastTravelTileIndex == 1)) {
            currentAreaIndex = destinationAreaIndex;
            currentFloorNumber = 0;
            currentTileIndex = 19;
        } else if ((destinationAreaIndex == 1) && (fastTravelTileIndex == 2)) {
            currentAreaIndex = destinationAreaIndex;
            currentFloorNumber = 2;
            currentTileIndex = 2;
        } else if ((destinationAreaIndex == 2) && (fastTravelTileIndex == 1)) {
            currentAreaIndex = destinationAreaIndex;
            currentFloorNumber = 0;
            currentTileIndex = 2;
        } else if ((destinationAreaIndex == 2) && (fastTravelTileIndex == 2)) {
            currentAreaIndex = destinationAreaIndex;
            currentFloorNumber = 4;
            currentTileIndex = 3;
        } else if ((destinationAreaIndex == 3) && (fastTravelTileIndex == 1)) {
            currentAreaIndex = destinationAreaIndex;
            currentFloorNumber = 0;
            currentTileIndex = 25;
        }
    }

    /**
     * Fast travels the character to a specific area.
     *
     * @param destinationAreaIndex The index of the destination area.
     */
    public void fastTravelToArea(int destinationAreaIndex) {
        boolean canFastTravel = (this.currentHp == 0) || (currentAreaIndex == 0)
                || (areas.get(currentAreaIndex).getFloors().get(currentFloorNumber).getTiles().get(currentTileIndex)
                .getTileType() == Tile.TileType.FastTravelTile);

        if (!canFastTravel) {
            System.out.println("Cannot fast travel from this location.\n");
            return;
        }

        // Reset HP and spawn tiles when returning to the Game Lobby (Area 0)
        if (destinationAreaIndex == 0) {
            currentAreaIndex = destinationAreaIndex;
            if (!(equiped == null)) {
                currentHp = 100 * ((hp + equiped.getHp()) / 2);
            } else {
                currentHp = 100 * (((hp) / 2));
            }
            System.out.println("Fast traveled to game lobby.\n");
        } else {
            System.out.println(
                    "Please enter valid inputs for the fast travel points. Note: areas 2 and 3 are not yet available.\n");
        }
    }

    /**
     * Displays the current location of the character.
     */
    public void displayCurrentLocation() {

        if (this.currentFloorNumber >= 0
                && this.currentFloorNumber < this.areas.get(this.currentAreaIndex).getFloors().size()) {
            Floor currentFloor = this.areas.get(this.currentAreaIndex).getFloors().get(this.currentFloorNumber);

            // Display the floor contents
            currentFloor.displayFloor(this);
        } else if (this.currentAreaIndex == 0) {
            System.out.println("You are in the game lobby.\n");
        } else {
            System.out.println("Invalid floor index or missing floor data.\n");
        }
    }

    /**
     * Interacts with the current tile.
     */
    public void interactTile() {
        int currentAreaIndex = this.currentAreaIndex;
        int currentFloorNumber = this.currentFloorNumber;
        int currentTileIndex = this.currentTileIndex;

        if (currentAreaIndex >= 0 && currentAreaIndex < areas.size()) {
            Area currentArea = areas.get(currentAreaIndex);

            if (currentFloorNumber >= 0 && currentFloorNumber < currentArea.getFloors().size()) {
                Floor currentFloor = currentArea.getFloors().get(currentFloorNumber);

                if (currentTileIndex >= 0 && currentTileIndex < currentFloor.getTilesSize()) {
                    Tile.TileType currentTileType = currentFloor.getTileType(currentTileIndex);

                    switch (currentTileType) {
                        case RegularTile:
                            System.out.println("You are on a regular tile.");
                            break;
                        case SpawnTile:
                            if (areas.get(this.currentAreaIndex).getFloors().get(this.currentFloorNumber).getTiles()
                                    .get(this.currentTileIndex).getIsActive()) {
                                double randomValue = Math.random();
                                if (randomValue <= 0.25) {
                                    System.out.println("You found a treasure!\n");
                                    Treasure treasure = new Treasure();
                                    treasure.giveTreasure(this, this.currentAreaIndex);
                                    areas.get(this.currentAreaIndex).getFloors().get(this.currentFloorNumber).getTiles()
                                            .get(this.currentTileIndex).turnOff();
                                } else {
                                    this.isBattling = true;
                                    this.battlingEnemy();
                                }
                            } else {
                                System.out.println("This spawn tile has already been interacted with.\n");
                            }
                            break;
                        case BossTile:
                            this.isBattling = true;
                            this.battlingBoss();
                            break;
                        case DoorTile:
                            if (currentAreaIndex == 1 && currentFloorNumber == 0 && currentTileIndex == 1) {
                                System.out.println("Moved to a new floor.\n");
                                this.currentFloorNumber = 1;
                                this.currentTileIndex = 45;
                                displayCurrentLocation();

                            } else if (currentAreaIndex == 1 && currentFloorNumber == 1 && currentTileIndex == 45) {
                                System.out.println("Moved to a new floor.\n");
                                this.currentFloorNumber = 0;
                                this.currentTileIndex = 1;
                                displayCurrentLocation();

                            } else if (currentAreaIndex == 1 && currentFloorNumber == 1 && currentTileIndex == 3) {
                                System.out.println("Moved to a new floor.\n");
                                this.currentFloorNumber = 2;
                                this.currentTileIndex = 32;
                                displayCurrentLocation();

                            } else if (currentAreaIndex == 1 && currentFloorNumber == 2 && currentTileIndex == 32) {
                                System.out.println("Moved to a new floor.\n");
                                this.currentFloorNumber = 2;
                                this.currentTileIndex = 32;
                                displayCurrentLocation();
                            }
                            break;

                        case FastTravelTile:
                            areas.get(this.currentAreaIndex).getFloors().get(this.currentFloorNumber).getTiles()
                                    .get(this.currentTileIndex).turnOn();
                            System.out.println("You have activated this fast travel point!");
                            System.out.println("Brining you back to the game lobby!\n");
                            fastTravelToArea(0, 0);
                            // Add any specific actions for FastTravelTile
                            break;
                        case CreditsTile:
                            System.out.println("You are on a credits tile.");
                            // Add any specific actions for CreditsTile
                            break;
                        case OutOfBounds:
                            System.out.println("You are out of bounds.");
                            // Handle out of bounds scenario
                            break;
                    }
                }

            }
        }
    }

    /**
     * Attacks an enemy.
     *
     * @param enemy      The enemy to attack.
     * @param attackType The type of attack (1 for Physical, 2 for Sorcery, 3 for
     *                   Incantation).
     */
    public void attackEnemy(Enemy enemy, int attackType) {
        if (enemy.isAlive()) {
            int baseDamage = 0;
            String attackName = null;
            this.selectedDodge = false;

            switch (attackType) {
                case 1: // Physical Attack
                    attackName = "physical attack";
                    if (this.equiped == null) {
                        baseDamage = this.str;
                    } else {
                        baseDamage = this.str + this.equiped.getStr();
                    }
                    break;
                case 2: // Sorcery Attack
                    attackName = "sorcery attack";
                    if (this.equiped == null) {
                        baseDamage = this.inte;
                    } else {
                        baseDamage = this.inte + this.equiped.getInte();
                    }
                    break;
                case 3: // Incantation Attack
                    attackName = "incantation attack";
                    if (this.equiped == null) {
                        baseDamage = this.fth;
                    } else {
                        baseDamage = this.fth + this.equiped.getFth();
                    }
                    break;
            }

            int damageDealt = enemy.takeDamage(attackType, baseDamage);
            System.out.println(
                    name + " attacked " + enemy.getName() + " with a " + attackName + " for " + damageDealt + " HP.");
            System.out.println(enemy.getName() + " has " + enemy.getEnemyActualHealth() + " HP left.\n");

            if (enemy.getEnemyActualHealth() == 0) {
                this.isBattling = false;
                if (enemy.isBoss()) {
                    areas.get(this.currentAreaIndex).getFloors().get(this.currentFloorNumber).getTiles().get(this.currentTileIndex).turnOff();
                    System.out.println("GREAT ENEMY FELLED!");
                } else {
                    areas.get(this.currentAreaIndex).getFloors().get(this.currentFloorNumber).getTiles().get(this.currentTileIndex).turnOff();
                    System.out.println("ENEMY FELLED!");
                }
                enemy.dropRunes(this);
                enemy.die();
                displayCurrentLocation();
            }
        } else {
            System.out.println(enemy.getName() + " has already fallen.\n");
        }
    }

    /**
     * Takes damage from an enemy.
     *
     * @param damage The amount of damage to take.
     */
    public void takeDamage(int damage) {
        if (this.currentHp <= damage) {
            this.currentHp = 0;
        } else {
            this.currentHp -= damage;
        }
    }

    /**
     * Initiates a dodge action against an enemy.
     *
     * @param enemy The enemy to dodge.
     */
    public void dodge(Enemy enemy) {
        if (enemy.isAlive()) {
            System.out.println(this.name + " attempted to dodge.");
            this.selectedDodge = true;
        } else {
            System.out.println(enemy.getName() + " has already fallen.\n");
        }
    }

    /**
     * Receives runes as rewards.
     *
     * @param runes The amount of runes received.
     */
    public void receiveRunes(int runes) {
        this.runes += runes;
        System.out.println(this.name + " has a total of " + this.runes + " runes.\n");
    }

    /**
     * Handles character death.
     */
    public void die() {
        System.out.println("You lost " + this.runes + " runes.");
        System.out.println("Returning you back to the game lobby.\n");

        this.isBattling = false;
        this.runes = 0;

        //Reset all spawn tiles
        areas.get(1).getFloors().get(0).getTiles().get(3).turnOn();
        areas.get(1).getFloors().get(0).getTiles().get(5).turnOn();
        areas.get(1).getFloors().get(1).getTiles().get(10).turnOn();
        areas.get(1).getFloors().get(1).getTiles().get(21).turnOn();
        areas.get(1).getFloors().get(1).getTiles().get(23).turnOn();
        areas.get(1).getFloors().get(1).getTiles().get(24).turnOn();
        areas.get(1).getFloors().get(1).getTiles().get(25).turnOn();
        areas.get(1).getFloors().get(1).getTiles().get(27).turnOn();
        areas.get(1).getFloors().get(1).getTiles().get(37).turnOn();
        areas.get(1).getFloors().get(1).getTiles().get(39).turnOn();

        fastTravelToArea(0);
    }

    /**
     * Initiates a battle with a regular enemy.
     */
    public void battlingEnemy() {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;
        Enemy enemy = new Enemy(randomNumber, this.currentAreaIndex);

        while (enemy.isAlive() && this.isBattling) {
            System.out.println("Select attack type (1 for Physical, 2 for Sorcery, 3 for Incantation, 0 for Dodge): ");
            int attackType = scanner.nextInt();

            if (attackType == 0) {
                dodge(enemy);
                enemy.attackCharacter(this);
            } else {
                attackEnemy(enemy, attackType);
                enemy.attackCharacter(this);

                // Check if the battle is over
                if (this.currentHp <= 0) {
                    die();
                    areas.get(this.currentAreaIndex).getFloors().get(this.currentFloorNumber).getTiles().get(this.currentTileIndex).turnOff();
                    break;
                } else if (!enemy.isAlive()) {
                    break;
                }
            }
        }
    }

    /**
     * Initiates a battle with a boss enemy.
     */
    public void battlingBoss() {

        Enemy enemy = new Enemy(this.currentAreaIndex);

        System.out.println("Battle started with " + enemy.getName() + "!\n");

        while (enemy.isAlive() && this.isBattling) {
            System.out.println("Select attack type (1 for Physical, 2 for Sorcery, 3 for Incantation, 0 for Dodge): ");
            int attackType = scanner.nextInt();

            if (attackType == 0) {
                dodge(enemy);
            } else {
                attackEnemy(enemy, attackType);
                enemy.attackCharacter(this);

                // Check if the battle is over
                if (currentHp <= 0) {
                    die();
                    break;
                } else if (!enemy.isAlive()) {
                    break;
                }
            }
        }
    }

    /**
     * Gets the name of the character.
     *
     * @return The name of the character.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the current HP of the character.
     *
     * @return The current HP of the character.
     */
    public int getCurrentHp() {
        return currentHp;
    }

    /**
     * Gets the effective faith of the character.
     *
     * @return The effective faith of the character.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Gets the effective hit points of the character.
     *
     * @return The effective hit points of the character.
     */
    public int getHp() {
        return hp;
    }

    /**
     * Gets the effective dexterity of the character.
     *
     * @return The effective dexterity of the character.
     */
    public int getDex(){
        return dex;
    }

    /**
     * Gets the effective intelligence of the character.
     *
     * @return The effective intelligence of the character.
     */
    public int getInte() {
        return inte;
    }

    /**
     * Gets the effective endurance of the character.
     *
     * @return The effective endurance of the character.
     */
    public int getEnd() {
        return end;
    }

    /**
     * Gets the effective strength of the character.
     *
     * @return The effective strength of the character.
     */
    public int getStr() {
        return str;
    }

    /**
     * Gets the effective faith of the character.
     *
     * @return The effective faith of the character.
     */
    public int getFth() {
        return fth;
    }

    public int getLevelReq(){
        return (this.level * 100) / 2;
    }


    /**
     * Checks if the character has selected dodge.
     *
     * @return True if dodge is selected, otherwise false.
     */
    public boolean isSelectedDodge() {
        return selectedDodge;
    }

    /**
     * Gets the index of the current tile.
     *
     * @return The index of the current tile.
     */
    public int getCurrentTileIndex() {
        return currentTileIndex;
    }

    /**
     * Gets the index of the current area.
     *
     * @return The index of the current area.
     */
    public int getCurrentAreaIndex() {
        return currentAreaIndex;
    }

    /**
     * Gets the number of runes the character currently has.
     *
     * @return The number of runes the character currently has.
     */
    public int getRunes() {
        return runes;
    }

    /**
     * Gets the character's equiped weapon.
     *
     * @return The character's equiped weapon.
     */
    public Weapon getEquiped() {
        return equiped;
    }

    /**
     * Gets the character's inventory.
     *
     * @return The character's inventory.
     */
    public ArrayList<Weapon> getInventory() {
        return inventory;
    }


    /**
     * Gets the character's areas.
     *
     * @return The character's area.
     */
    public ArrayList<Area> getAreas() {
        return areas;
    }
}
