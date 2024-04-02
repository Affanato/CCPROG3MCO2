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
                    // To implement floor generator
                    break;
                case 3:
                    this.name = "The Elden Throne";
                    // To implement floor generator
                    break;
            }
        } else {
            System.out.println("Not a valid area index.\n");
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
