import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AreaScreenView {
    private JButton W;
    private JButton A;
    private JButton S;
    private JButton D;
    private JLabel feedbackLabel;
    public AreaScreenView(Character character){
        String areaName = character.getAreas().get(character.getCurrentAreaIndex()).getName();
        int floorHeight = character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getHeight();
        int floorWidth = character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getWidth();
        int currentTileIndex = character.getCurrentTileIndex();
        ArrayList<Tile> floorTiles = character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles();

        JLabel areaNameText = new JLabel(areaName);
        areaNameText.setForeground(Color.ORANGE);
        areaNameText.setBounds(20,20,500,100);
        areaNameText.setFont(new Font("Garamond", Font.BOLD,50));

        int initialX = 0;
        int initialY = 0;
        int yAdder = 0;
        for(int i = 0; i < floorHeight; i++) {
            for (int j = 0; j < floorWidth; j++) {
                int tileIndex = i * floorWidth + j;

                if (character.getCurrentTileIndex() == tileIndex) {

                } else {
                    if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.RegularTile) {
                        System.out.print(" _____ ");
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.SpawnTile) {
                        System.out.print(" ***** ");
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.BossTile) {
                        System.out.print(" ^^^^^ ");
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.DoorTile) {
                        System.out.print(" ##### ");
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.FastTravelTile) {
                        System.out.print(" ~~~~~ ");
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.CreditsTile) {
                        System.out.print(" ..... ");
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.OutOfBounds) {
                        System.out.print("       ");
                    }
                }
            }


            }
        }
    }

}
