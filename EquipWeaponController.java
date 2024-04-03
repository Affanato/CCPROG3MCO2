import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EquipWeaponController {
    private EquipWeaponView equipWeaponView;
    private int i;
    public EquipWeaponController(EquipWeaponModel equipWeaponModel, Character character) {
        this.equipWeaponView = new EquipWeaponView(character);

        for(this.i = 0; this.i < character.getInventory().size(); this.i++) {
            final int index = this.i;
            equipWeaponView.addButtonActionListener(index, new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(equipWeaponView.getMetDexReq(index,character)) {
                        equipWeaponView.disposeFrame();
                        equipWeaponModel.equipWeapon(character, index);
                    } else {
                        equipWeaponView.setFeedbackLabel("You don't have enough DEX to equip this weapon");
                    }
                }
            });
        }
        equipWeaponView.addExitButtonActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                equipWeaponView.disposeFrame();
                equipWeaponModel.backToLobby(character);
            }
        });
    }
}
