public class BattleScreenController {
    public BattleScreenView battleScreenView;
    public BattleScreenController(BattleScreenModel battleScreenModel, Character character, Enemy enemy){
        this.battleScreenView = new BattleScreenView(character, enemy);
    }
}
