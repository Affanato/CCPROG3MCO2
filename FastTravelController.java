public class FastTravelController {
    private FastTravelView fastTravelView;

    public FastTravelController(FastTravelModel fastTravelModel, Character character) {
        this.fastTravelView = new FastTravelView(character);
    }
}
