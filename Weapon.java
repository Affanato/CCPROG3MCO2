/**
 * The Weapon class represents different types of weapons available in the game.
 */
public class Weapon {
    private String name;
    private int cost;
    private int hp;
    private int inte;
    private int end;
    private int str;
    private int fth;
    private int dexReq;

    /**
     * Constructs a Weapon object based on the weapon type and index.
     *
     * @param weaponType  The type of weapon.
     * @param weaponIndex The index of the weapon.
     */
    public Weapon(int weaponType, int weaponIndex) {
        if ((1 <= weaponType && weaponType <= 6) && (1 <= weaponIndex && weaponIndex <= 4)) {
            switch (weaponType) {
                case 1: // Sword
                    switch (weaponIndex) {
                        case 1:
                            this.name = "Short Sword";
                            this.cost = 1000;
                            this.hp = 0;
                            this.inte = 15;
                            this.end = 15;
                            this.str = 15;
                            this.fth = 15;
                            this.dexReq = 13;
                            break;
                        case 2:
                            this.name = "Rogier's Rapier";
                            this.cost = 2000;
                            this.hp = 10;
                            this.inte = 35;
                            this.end = 25;
                            this.str = 35;
                            this.fth = 35;
                            this.dexReq = 18;
                            break;
                        case 3:
                            this.name = "Coded Sword";
                            this.cost = 4000;
                            this.hp = 20;
                            this.inte = 40;
                            this.end = 35;
                            this.str = 40;
                            this.fth = 40;
                            this.dexReq = 21;
                            break;
                        case 4:
                            this.name = "Sword of Night and Flame";
                            this.cost = 8000;
                            this.hp = 30;
                            this.inte = 55;
                            this.end = 45;
                            this.str = 55;
                            this.fth = 55;
                            this.dexReq = 25;
                            break;
                    }
                    break;
                case 2: // Katanas
                    switch (weaponIndex) {
                        case 1:
                            this.name = "Uchigatana";
                            this.cost = 1875;
                            this.hp = 20;
                            this.inte = 0;
                            this.end = 35;
                            this.str = 30;
                            this.fth = 0;
                            this.dexReq = 15;
                            break;
                        case 2:
                            this.name = "Moonveil";
                            this.cost = 3750;
                            this.hp = 30;
                            this.inte = 0;
                            this.end = 40;
                            this.str = 45;
                            this.fth = 0;
                            this.dexReq = 20;
                            break;
                        case 3:
                            this.name = "Rivers of Blood";
                            this.cost = 7500;
                            this.hp = 40;
                            this.inte = 0;
                            this.end = 45;
                            this.str = 60;
                            this.fth = 0;
                            this.dexReq = 25;
                            break;
                        case 4:
                            this.name = "Hand of Malenia";
                            this.cost = 15000;
                            this.hp = 50;
                            this.inte = 0;
                            this.end = 50;
                            this.str = 75;
                            this.fth = 0;
                            this.dexReq = 30;
                            break;
                    }
                    break;
                case 3: // Whips
                    switch (weaponIndex) {
                        case 1:
                            this.name = "Whip";
                            this.cost = 1500;
                            this.hp = 15;
                            this.inte = 0;
                            this.end = 60;
                            this.str = 20;
                            this.fth = 0;
                            this.dexReq = 20;
                            break;
                        case 2:
                            this.name = "Urumi";
                            this.cost = 3000;
                            this.hp = 20;
                            this.inte = 10;
                            this.end = 70;
                            this.str = 40;
                            this.fth = 0;
                            this.dexReq = 25;
                            break;
                        case 3:
                            this.name = "Thorned Whip";
                            this.cost = 5000;
                            this.hp = 30;
                            this.inte = 0;
                            this.end = 80;
                            this.str = 50;
                            this.fth = 40;
                            this.dexReq = 30;
                            break;
                        case 4:
                            this.name = "Hoslow's Petal Whip";
                            this.cost = 10000;
                            this.hp = 35;
                            this.inte = 20;
                            this.end = 90;
                            this.str = 55;
                            this.fth = 20;
                            this.dexReq = 35;
                            break;
                    }
                    break;
                case 4: // Greatswords
                    switch (weaponIndex) {
                        case 1:
                            this.name = "Claymore";
                            this.cost = 3000;
                            this.hp = 15;
                            this.inte = 0;
                            this.end = 10;
                            this.str = 20;
                            this.fth = 0;
                            this.dexReq = 9;
                            break;
                        case 2:
                            this.name = "Starscourge Greatsword";
                            this.cost = 6000;
                            this.hp = 20;
                            this.inte = 0;
                            this.end = 15;
                            this.str = 40;
                            this.fth = 20;
                            this.dexReq = 14;
                            break;
                        case 3:
                            this.name = "Inseparable Sword";
                            this.cost = 12000;
                            this.hp = 25;
                            this.inte = 60;
                            this.end = 20;
                            this.str = 70;
                            this.fth = 60;
                            this.dexReq = 19;
                            break;
                        case 4:
                            this.name = "Maliketh's Black Blade";
                            this.cost = 24000;
                            this.hp = 30;
                            this.inte = 40;
                            this.end = 25;
                            this.str = 80;
                            this.fth = 60;
                            this.dexReq = 24;
                            break;
                    }
                    break;
                case 5: // Staves
                    switch (weaponIndex) {
                        case 1:
                            this.name = "Astrologer's Staff";
                            this.cost = 2000;
                            this.hp = 5;
                            this.inte = 25;
                            this.end = 20;
                            this.str = 5;
                            this.fth = 15;
                            this.dexReq = 12;
                            break;
                        case 2:
                            this.name = "Albinauric Staff";
                            this.cost = 4000;
                            this.hp = 10;
                            this.inte = 45;
                            this.end = 30;
                            this.str = 10;
                            this.fth = 35;
                            this.dexReq = 14;
                            break;
                        case 3:
                            this.name = "Staff of the Guilty";
                            this.cost = 8000;
                            this.hp = 15;
                            this.inte = 65;
                            this.end = 40;
                            this.str = 15;
                            this.fth = 60;
                            this.dexReq = 16;
                            break;
                        case 4:
                            this.name = "Carian Regal Scepter";
                            this.cost = 16000;
                            this.hp = 25;
                            this.inte = 85;
                            this.end = 50;
                            this.str = 20;
                            this.fth = 75;
                            this.dexReq = 18;
                            break;
                    }
                    break;
                case 6: // Seals
                    switch (weaponIndex) {
                        case 1:
                            this.name = "Finger Seal";
                            this.cost = 2500;
                            this.hp = 10;
                            this.inte = 15;
                            this.end = 45;
                            this.str = 0;
                            this.fth = 20;
                            this.dexReq = 10;
                            break;
                        case 2:
                            this.name = "Godslayer's Seal";
                            this.cost = 5000;
                            this.hp = 15;
                            this.inte = 35;
                            this.end = 50;
                            this.str = 0;
                            this.fth = 40;
                            this.dexReq = 12;
                            break;
                        case 3:
                            this.name = "Golden Order Seal";
                            this.cost = 10000;
                            this.hp = 20;
                            this.inte = 65;
                            this.end = 55;
                            this.str = 0;
                            this.fth = 65;
                            this.dexReq = 14;
                            break;
                        case 4:
                            this.name = "Dragon Communion Seal";
                            this.cost = 15000;
                            this.hp = 25;
                            this.inte = 75;
                            this.end = 60;
                            this.str = 0;
                            this.fth = 80;
                            this.dexReq = 18;
                            break;
                    }
                    break;
            }
        } else {
            System.out.println("Invalid index for weapon");
        }
    }

    /**
     * Retrieves the name of the weapon.
     *
     * @return The name of the weapon.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the cost of the weapon.
     *
     * @return The cost of the weapon.
     */
    public int getCost() {
        return cost;
    }

    /**
     * Retrieves the hit points (HP) of the weapon.
     *
     * @return The hit points (HP) of the weapon.
     */
    public int getHp() {
        return hp;
    }

    /**
     * Retrieves the intelligence (INT) of the weapon.
     *
     * @return The intelligence (INT) of the weapon.
     */
    public int getInte() {
        return inte;
    }

    /**
     * Retrieves the endurance (END) of the weapon.
     *
     * @return The endurance (END) of the weapon.
     */
    public int getEnd() {
        return end;
    }

    /**
     * Retrieves the strength (STR) of the weapon.
     *
     * @return The strength (STR) of the weapon.
     */
    public int getStr() {
        return str;
    }

    /**
     * Retrieves the faith (FTH) of the weapon.
     *
     * @return The faith (FTH) of the weapon.
     */
    public int getFth() {
        return fth;
    }

    /**
     * Retrieves the dexterity requirement (DEX) of the weapon.
     *
     * @return The dexterity requirement (DEX) of the weapon.
     */
    public int getDexReq() {
        return dexReq;
    }
}
