import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShopController1 {
    private ShopView1 shopView1;
    private int i;
    public ShopController1(ShopModel1 shopModel1, Character character, Shop shop) {
        this.shopView1 = new ShopView1(character, shop);

        for(this.i = 0; this.i < 15; this.i++) {
            final int index = this.i;
            shopView1.addButtonActionListener(index, new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(shopView1.getCanPurchase(index,character,shop)) {
                        shopView1.disposeFrame();
                        shopModel1.buyWeapon(character, index, shop);
                    } else {
                        shopView1.setFeedbackLabel("You don't have enough runes to buy this weapon");
                    }
                }
            });
        }
        shopView1.addPage2ActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                shopView1.disposeFrame();
                shopModel1.goToPage2(character);
            }
        });

        shopView1.addExitButtonActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                shopView1.disposeFrame();
                shopModel1.backToLobby(character);
            }
        });
    }
}
