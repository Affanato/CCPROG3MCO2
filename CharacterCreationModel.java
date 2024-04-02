public class CharacterCreationModel {
    private CharacterCreationController characterCreationController;
    public CharacterCreationModel(){
        this.characterCreationController = new CharacterCreationController(this);
    }

    public Player createPlayer (String name, int classIndex){
        Player player = new Player();
        player.setName(name);
        player.setClassIndex(classIndex);
        return player;
    }


}
