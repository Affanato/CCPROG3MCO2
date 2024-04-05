import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattleScreenController {
    public BattleScreenView battleScreenView;
    public BattleScreenController(BattleScreenModel battleScreenModel, Character character, Enemy enemy){
        this.battleScreenView = new BattleScreenView(character, enemy);

        battleScreenView.addPhysicalAttackButtonActionListener(new ActionListener (){
           public void actionPerformed(ActionEvent e) {
               battleScreenView.disposeFrame();
               battleScreenModel.attackEnemy(character, enemy, 1);
           }
        });

        battleScreenView.addSorceryAttackButtonActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                battleScreenView.disposeFrame();
                battleScreenModel.attackEnemy(character, enemy, 2);
            }
        });

        battleScreenView.addIncantationAttackButtonActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                battleScreenView.disposeFrame();
                battleScreenModel.attackEnemy(character, enemy, 3);
            }
        });

        battleScreenView.addDodgeButtonActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                battleScreenView.disposeFrame();
                battleScreenModel.dodgeEnemy(character, enemy);
            }
        });
    }
}
