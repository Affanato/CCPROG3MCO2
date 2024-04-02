public class CharacterCreationModel {
    private CharacterCreationController characterCreationController;
    public CharacterCreationModel(){
        this.characterCreationController = new CharacterCreationController(this);
    }

    public Character createCharacter (String name, int jobIndex){
        Character character = new Character(name, jobIndex);
        return character;
    }


}
