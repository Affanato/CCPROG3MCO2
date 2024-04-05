import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FastTravelController {
    private FastTravelView fastTravelView;

    public FastTravelController(FastTravelModel fastTravelModel, Character character) {
        this.fastTravelView = new FastTravelView(character);

        fastTravelView.addArea1TP1ActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e) {
               fastTravelView.disposeFrame();
               fastTravelModel.travelArea1TP1(character);
           }
        });
        fastTravelView.addArea1TP2ActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(fastTravelView.isA1TP2Active(character)){
                    fastTravelModel.travelArea1TP2(character);
                } else {
                    fastTravelView.setFeedbackLabel("You cannot travel to Area 1 Warp Tile 2 yet");
                }
            }
        });
        fastTravelView.addArea2TP1ActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                fastTravelModel.travelArea2TP1(character);
            }
        });
        fastTravelView.addArea2TP2ActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(fastTravelView.isA2TP2Active(character)){
                    fastTravelModel.travelArea2TP2(character);
                } else {
                    fastTravelView.setFeedbackLabel("You cannot travel to Area 2 Warp Tile 2 yet");
                }
            }
        });
        fastTravelView.addArea3TP1ActionListner(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(fastTravelView.isA3TP1Active(character)){
                    fastTravelModel.travelArea3TP1(character);
                } else {
                    fastTravelView.setFeedbackLabel("You cannot travel to Area 3 yet");
                }
            }
        });
        fastTravelView.addGoBackActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fastTravelView.disposeFrame();
                fastTravelModel.backToGameLobby(character);
            }
        });
    }
}
