public class BattleScreenModel {
    private BattleScreenController battleScreenController;

    public BattleScreenModel(Character character, Enemy enemy) {
        this.battleScreenController = new BattleScreenController(this, character, enemy);
    }
    public void attackEnemy(Character character, Enemy enemy, int attackType) {
        character.attackEnemy(enemy, attackType);
        enemy.attackCharacter(character);

        if(character.getCurrentHp() <= 0) {
            character.die();
            GameLobbyModel gameLobbyModel = new GameLobbyModel(character);
        } else if (enemy.getEnemyActualHealth() <= 0) {
            enemy.die();
            enemy.dropRunes(character);
            AreaScreenModel areaScreenModel = new AreaScreenModel(character);
        } else {
            BattleScreenModel battleScreenModel = new BattleScreenModel(character, enemy);
        }
    }
    public void dodgeEnemy(Character character, Enemy enemy){
        character.dodge(enemy);
        enemy.attackCharacter(character);

        if(character.getCurrentHp() <= 0) {
            character.die();
            GameLobbyModel gameLobbyModel = new GameLobbyModel(character);
        } else if (enemy.getEnemyActualHealth() <= 0) {
            enemy.die();
            enemy.dropRunes(character);
            AreaScreenModel areaScreenModel = new AreaScreenModel(character);
        } else {
            BattleScreenModel battleScreenModel = new BattleScreenModel(character, enemy);
        }
    }
}
