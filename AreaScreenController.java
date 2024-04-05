import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaScreenController {
    public AreaScreenView areaScreenView;

    public AreaScreenController(AreaScreenModel areaScreenModel, Character character){
        areaScreenView = new AreaScreenView(character);

        areaScreenView.addWActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(areaScreenView.canMoveUp(character)) {
                    areaScreenView.dispose();
                    areaScreenModel.moveCharacter(character, 'w');
                } else {
                    areaScreenView.setFeedbackLabel("Can't move up");
                }
            }
        });

        areaScreenView.addAActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(areaScreenView.canMoveLeft(character)) {
                    areaScreenView.dispose();
                    areaScreenModel.moveCharacter(character, 'a');
                } else {
                    areaScreenView.setFeedbackLabel("Can't move left");
                }
            }
        });

        areaScreenView.addSActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(areaScreenView.canMoveDown(character)) {
                    areaScreenView.dispose();
                    areaScreenModel.moveCharacter(character, 's');
                } else {
                    areaScreenView.setFeedbackLabel("Can't move down");
                }
            }
        });

        areaScreenView.addDActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(areaScreenView.canMoveRight(character)) {
                    areaScreenView.dispose();
                    areaScreenModel.moveCharacter(character, 'd');
                } else {
                    areaScreenView.setFeedbackLabel("Can't move right");
                }
            }
        });




    }

}
