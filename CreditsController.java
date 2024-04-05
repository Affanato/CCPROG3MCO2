import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CreditsController {
    private CreditsView creditsView;
    public CreditsController(CreditsModel creditsModel){
        this.creditsView = new CreditsView();

        creditsView.addReturnToTitleActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                creditsView.disposeFrame();
                creditsModel.returnToTitle();
            }
        });
    }
}
