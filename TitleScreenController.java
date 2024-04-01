import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleScreenController {

    private int startToggle;
    private TitleScreenView titleScreenView;
    private TitleScreenModel titleScreenModel;

    public TitleScreenController(TitleScreenModel titleScreenModel) {
        this.titleScreenModel = titleScreenModel;
        titleScreenView = new TitleScreenView();
        titleScreenView.addStartButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startToggle = 1; //Proceeds to character creation
                titleScreenView.disposeFrame();
                titleScreenModel.gameStarter(startToggle);
            }
        });
        titleScreenView.addExitButtonListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                startToggle = 0; // Closes the game
                titleScreenModel.gameStarter(startToggle);
            }
        });
    }

public void showTitleScreen ()
{
    titleScreenView = new TitleScreenView();
    titleScreenView.addStartButtonListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            startToggle = 1; //
            titleScreenView.disposeFrame();
            titleScreenModel.gameStarter(startToggle);
        }
    });
    titleScreenView.addExitButtonListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            startToggle = 0;
            titleScreenModel.gameStarter(startToggle);
        }
    });
}

}
