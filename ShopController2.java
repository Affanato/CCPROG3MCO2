import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShopController2 {
    private ShopView2 shopView2;
    private int i;
    public ShopController2(ShopModel2 shopModel2, Character character, Shop shop) {
        this.shopView2 = new ShopView2(character, shop);

        for(this.i = 0; this.i < 8; this.i++) {
            final int index = this.i;
            shopView2.addButtonActionListener(index, new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(shopView2.getCanPurchase(index,character,shop)) {
                        shopView2.disposeFrame();
                        shopModel2.buyWeapon(character, index, shop);
                    } else {
                        shopView2.setFeedbackLabel("You don't have enough runes to buy this weapon");
                    }
                }
            });
        }
        shopView2.addPage1ActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                shopView2.disposeFrame();
                shopModel2.goToPage1(character);
            }
        });

        shopView2.addExitButtonActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                shopView2.disposeFrame();
                shopModel2.backToLobby(character);
            }
        });
    }
}
