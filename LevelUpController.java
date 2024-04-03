import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LevelUpController {
    private LevelUpView levelUpView;
    public LevelUpController(Character character, LevelUpModel levelUpModel) {
        this.levelUpView = new LevelUpView(character);

        levelUpView.addLevelUpHPActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(character.getRunes() >= character.getLevelReq()) {
                    levelUpView.disposeFrame();
                    levelUpModel.levelUpHP(character);
                } else {
                    levelUpView.setFeedbackLabel("You do not have enough runes to level up");
                }
            }
        });
        levelUpView.addLevelUpDEXActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(character.getRunes() >= character.getLevelReq()) {
                    levelUpView.disposeFrame();
                    levelUpModel.levelUpDEX(character);
                } else {
                    levelUpView.setFeedbackLabel("You do not have enough runes to level up");
                }
            }
        });
        levelUpView.addLevelUpINTActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(character.getRunes() >= character.getLevelReq()) {
                    levelUpView.disposeFrame();
                    levelUpModel.levelUpINT(character);
                } else {
                    levelUpView.setFeedbackLabel("You do not have enough runes to level up");
                }
            }
        });
        levelUpView.addLevelUpENDActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(character.getRunes() >= character.getLevelReq()) {
                    levelUpView.disposeFrame();
                    levelUpModel.levelUpEND(character);
                } else {
                    levelUpView.setFeedbackLabel("You do not have enough runes to level up");
                }
            }
        });
        levelUpView.addLevelUpSTRActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(character.getRunes() >= character.getLevelReq()) {
                    levelUpView.disposeFrame();
                    levelUpModel.levelUpSTR(character);
                } else {
                    levelUpView.setFeedbackLabel("You do not have enough runes to level up");
                }
            }
        });
        levelUpView.addLevelUpFTHActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(character.getRunes() >= character.getLevelReq()) {
                    levelUpView.disposeFrame();
                    levelUpModel.levelUpFTH(character);
                } else {
                    levelUpView.setFeedbackLabel("You do not have enough runes to level up");
                }
            }
        });

        levelUpView.addBackToGameLobbyListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                levelUpView.disposeFrame();
                levelUpModel.backToGameLobby(character);
            }
        });

    }
}
