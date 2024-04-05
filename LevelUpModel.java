public class LevelUpModel {

    public LevelUpModel (Character character) {
        LevelUpController levelUpController = new LevelUpController(character, this);
    }

    public void levelUpHP(Character character) {
        character.levelUp(1);
        LevelUpModel levelUpModel = new LevelUpModel(character);
    }

    public void levelUpDEX(Character character) {
        character.levelUp(2);
        LevelUpModel levelUpModel = new LevelUpModel(character);
    }

    public void levelUpINT(Character character) {
        character.levelUp(3);
        LevelUpModel levelUpModel = new LevelUpModel(character);
    }

    public void levelUpEND(Character character) {
        character.levelUp(4);
        LevelUpModel levelUpModel = new LevelUpModel(character);
    }

    public void levelUpSTR(Character character) {
        character.levelUp(5);
        LevelUpModel levelUpModel = new LevelUpModel(character);
    }

    public void levelUpFTH(Character character) {
        character.levelUp(6);
        LevelUpModel levelUpModel = new LevelUpModel(character);
    }

    public void backToGameLobby(Character character) {
        GameLobbyModel gameLobbyModel = new GameLobbyModel(character);
    }
 }
