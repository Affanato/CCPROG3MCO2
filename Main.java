public class Main {
    public static void main(String[] args) {
        Character baby = new Character("Affanato",2);
        Enemy enemy = new Enemy(1);

        BattleScreenModel battleScreenModel = new BattleScreenModel(baby, enemy);

        //TitleScreenModel titleScreenModel = new TitleScreenModel();
    }
}
