import java.util.ArrayList;

/**
 * The Area class represents different areas in the game world.
 * Each area may contain multiple floors.
 */
public class Area {
    private String name;
    private int index;
    private ArrayList<Floor> floors = new ArrayList<Floor>();

    /**
     * Constructs an Area object with the specified index.
     *
     * @param index the index of the area
     */
    public Area(int index) {
        if (0 <= index & index <= 3) {
            this.index = index;

            switch (index) {
                case 0:
                    this.name = "Game Lobby";
                    break;
                case 1:
                    this.name = "Stormveil Castle";
                    for (int i = 0; i < 3; i++) {
                        floors.add(new Floor(index, 1 + i));
                    }
                    break;
                case 2:
                    this.name = "Raya Lucaria Academy";
                    for (int i = 0; i < 5; i++) {
                        floors.add(new Floor(index, 1 + i));
                    }
                    break;
                case 3:
                    this.name = "The Elden Throne";
                    for (int i = 0; i < 3; i++) {
                        floors.add(new Floor(index, 1 + i));
                    }
                    break;
            }
        }
    }

    /**
     * Retrieves the floors associated with this area.
     *
     * @return the list of floors in the area
     */
    public ArrayList<Floor> getFloors() {
        return floors;
    }
}
