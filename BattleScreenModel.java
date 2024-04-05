public class BattleScreenModel {
    private BattleScreenController battleScreenController;

    public BattleScreenModel(Character character, Enemy enemy) {
        this.battleScreenController = new BattleScreenController(this, character, enemy);
    }

}
