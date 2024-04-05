import java.util.Random;

/**
 * Represents an enemy in a game.
 */
public class Enemy {
    private String name;
    private int enemyActualHealth;
    private int enemyHealthLow;
    private int enemyHealthHigh;
    private int enemyAttackLow;
    private int enemyAttackHigh;
    private double enemyPhyDef;
    private double enemySocDef;
    private double enemyIncDef;
    private int runesDropped;
    private boolean isAlive = true;
    private boolean isBoss;

    /**
     * Instantiates a boss enemy based on the provided area.
     *
     * @param enemyArea The area in which the boss enemy appears.
     */
    public Enemy(int enemyArea) {
        if (1 <= enemyArea && enemyArea <= 3) {
            this.isBoss = true;
            switch (enemyArea) {
                case 1:
                    System.out.println("Godrick the Grafted appeared!\n");
                    this.name = "Godrick the Grafted";
                    this.enemyActualHealth = 200;
                    this.enemyAttackLow = 150;
                    this.enemyAttackHigh = 300;
                    this.enemyPhyDef = 0.35;
                    this.enemySocDef = 0.20;
                    this.enemyIncDef = 0.15;
                    break;
                case 2:
                    System.out.println("Rennala, Queen of the Full Moon appeared!\n");
                    this.name = "Rennala, Queen of the Full Moon";
                    this.enemyActualHealth = 400;
                    this.enemyAttackLow = 200;
                    this.enemyAttackHigh = 300;
                    this.enemyPhyDef = 0.15;
                    this.enemySocDef = 0.35;
                    this.enemyIncDef = 0.25;
                    break;
                case 3:
                    System.out.println("The Elden Beast appeared!\n");
                    this.name = "The Elden Beast";
                    this.enemyActualHealth = 800;
                    this.enemyAttackLow = 250;
                    this.enemyAttackHigh = 300;
                    this.enemyPhyDef = 0.25;
                    this.enemySocDef = 0.50;
                    this.enemyIncDef = 0.40;
                    break;
            }
            this.runesDropped = this.enemyActualHealth * 5;
        }
    }

    /**
     * Instantiates a regular enemy based on the provided type and area.
     *
     * @param enemyType The type of the regular enemy.
     * @param enemyArea The area in which the regular enemy appears.
     */
    public Enemy(int enemyType, int enemyArea) {
        if ((1 <= enemyType && enemyType <= 3) && (1 <= enemyArea && enemyArea <= 2)) {
            this.isBoss = false;
            switch (enemyType) {
                case 1:
                    if (enemyArea == 1) {
                        System.out.println("A Godrick Soldier appeared!\n");
                        this.name = "Godrick Soldier";
                    } else {
                        System.out.println("A Living Jar appeared!\n");
                        this.name = "Living Jar";
                    }
                    this.enemyHealthLow = 20 * enemyArea;
                    this.enemyHealthHigh = 30 * enemyArea;
                    this.enemyAttackLow = 70 * enemyArea;
                    this.enemyAttackHigh = 80 * enemyArea;
                    this.enemyPhyDef = 0.20 * enemyArea;
                    this.enemySocDef = 0.15 * enemyArea;
                    this.enemyIncDef = 0.10 * enemyArea;
                    break;

                case 2:
                    if (enemyArea == 1) {
                        System.out.println("A Godrick Archer appeared!\n");
                        this.name = "Godrick Archer"; // enemy is from Area 1
                    } else {
                        System.out.println("A Glintstone Sorcerer appeared!\n");
                        this.name = "Glintstone Sorcerer"; // enemy is from Area 2
                    }
                    this.enemyHealthLow = 25 * enemyArea;
                    this.enemyHealthHigh = 35 * enemyArea;
                    this.enemyAttackLow = 110 * enemyArea;
                    this.enemyAttackHigh = 120 * enemyArea;
                    this.enemyPhyDef = 0.50 * enemyArea;
                    this.enemySocDef = 0.15 * enemyArea;
                    this.enemyIncDef = 0.20 * enemyArea;
                    break;

                case 3:
                    if (enemyArea == 1) {
                        System.out.println("A Godrick Knight appeared!\n");
                        this.name = "Godrick Knight"; // Enemy is area 1
                    } else {
                        System.out.println("A Battlemage appeared!\n");
                        this.name = "Battlemage"; // Enemy is area 2
                    }
                    this.enemyHealthLow = 70 * enemyArea;
                    this.enemyHealthHigh = 80 * enemyArea;
                    this.enemyAttackLow = 120 * enemyArea;
                    this.enemyAttackHigh = 130 * enemyArea;
                    this.enemyPhyDef = 0.25 * enemyArea;
                    this.enemySocDef = 0.25 * enemyArea;
                    this.enemyIncDef = 0.20 * enemyArea;
                    break;
            }

            Random random = new Random();
            this.enemyActualHealth = random.nextBoolean() ? this.enemyHealthLow : this.enemyHealthHigh;
            this.runesDropped = this.enemyActualHealth * 2;

        } else {
            System.out.println("enter a valid area or enemy index");
        }
    }

    /**
     * Attacks the provided character.
     *
     * @param character The character being attacked.
     */
    public void attackCharacter(Character character) {
        if (isAlive) {
            if (character.isSelectedDodge()) {

                float dodgeChance;
                if (character.getEquiped() == null) {
                    dodgeChance = (float) (20 + (character.getEnd() / 2)) / 100;
                } else {
                    dodgeChance = (float) (20 + ((character.getEnd() + character.getEquiped().getEnd())/ 2)) / 100;
                }

                int randomValue = new Random().nextInt(99) + 1;
                if (dodgeChance * 100 > randomValue) {
                } else {
                    Random random = new Random();
                    int attackValue = random.nextBoolean() ? enemyAttackLow : enemyAttackHigh;

                    character.takeDamage(attackValue);
                }
            } else {
                Random random = new Random();
                int attackValue = random.nextBoolean() ? enemyAttackLow : enemyAttackHigh;

                character.takeDamage(attackValue);
            }
        }
    }

    /**
     * Takes damage from the specified damage type and value.
     *
     * @param damageType  The type of damage.
     * @param damageValue The amount of damage.
     * @return The actual damage taken.
     */
    public int takeDamage(int damageType, int damageValue) {
        int damageTaken = 0;
        switch (damageType) {
            case 1: // Player does physical damage
                damageTaken = (int) (damageValue * (1 - this.enemyPhyDef));
                if (this.enemyActualHealth <= damageTaken) {
                    this.enemyActualHealth = 0;
                } else {
                    this.enemyActualHealth -= damageTaken;
                }
                break;
            case 2: // Player does sorcery damage
                damageTaken = (int) (damageValue * (1 - this.enemySocDef));
                if (this.enemyActualHealth <= damageTaken) {
                    this.enemyActualHealth = 0;
                } else {
                    this.enemyActualHealth -= damageTaken;
                }
                break;
            case 3: // Player does incantation damage
                damageTaken = (int) (damageValue * (1 - this.enemyIncDef));
                if (this.enemyActualHealth <= damageTaken) {
                    this.enemyActualHealth = 0;
                } else {
                    this.enemyActualHealth -= damageTaken;
                }
                break;
        }
        return damageTaken;
    }

    /**
     * Drops runes for the provided character when the enemy is defeated.
     *
     * @param character The character receiving the runes.
     */
    public void dropRunes(Character character) {
        if (this.enemyActualHealth <= 0) {
            character.receiveRunes(this.runesDropped);
        }
    }

    /**
     * Marks the enemy as dead.
     */
    public void die() {
        this.isAlive = false;
    }

    /**
     * Retrieves the name of the enemy.
     *
     * @return The name of the enemy.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the actual health of the enemy.
     *
     * @return The actual health of the enemy.
     */
    public int getEnemyActualHealth() {
        return enemyActualHealth;
    }

    /**
     * Checks if the enemy is alive.
     *
     * @return True if the enemy is alive, otherwise false.
     */
    public boolean isAlive() {
        return isAlive;
    }

    /**
     * Checks if the enemy is a boss.
     *
     * @return True if the enemy is a boss, otherwise false.
     */
    public boolean isBoss() {
        return isBoss;
    }
}
