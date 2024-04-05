public class AreaScreenController {
    public AreaScreenView areaScreenView;

    public AreaScreenController(AreaScreenModel areaScreenModel, Character character){
        areaScreenView = new AreaScreenView(character);
    }
}
