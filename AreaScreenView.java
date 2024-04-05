import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AreaScreenView {
    private JFrame mainFrame = new JFrame("Elden Rouge: CCPROG3 MCO Cosing & Tujan");
    private JButton W;
    private JButton A;
    private JButton S;
    private JButton D;
    private JButton interact;
    private JLabel feedbackLabel;
    public AreaScreenView(Character character){
        String areaName = character.getAreas().get(character.getCurrentAreaIndex()).getName();
        int floorHeight = character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getHeight();
        int floorWidth = character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getWidth();
        int currentTileIndex = character.getCurrentTileIndex();
        ArrayList<Tile> floorTiles = character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles();

        Container contentPane = mainFrame.getContentPane();
        contentPane.setBackground(Color.BLACK);

        mainFrame.setLayout(null);
        mainFrame.setSize(800,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);

        JLabel areaNameText = new JLabel(areaName);
        areaNameText.setForeground(Color.ORANGE);
        areaNameText.setBounds(20,-20,500,100);
        areaNameText.setFont(new Font("Garamond", Font.BOLD,30));

        W = new JButton("W");
        W.setFocusPainted(false);
        W.setBounds(570,150,50,50);
        W.setFont(new Font("Garamond", Font.BOLD,20));
        W.setBorder(BorderFactory.createEtchedBorder());

        A = new JButton("A");
        A.setFocusPainted(false);
        A.setBounds(520,200,50,50);
        A.setFont(new Font("Garamond", Font.BOLD,20));
        A.setBorder(BorderFactory.createEtchedBorder());

        S = new JButton("S");
        S.setFocusPainted(false);
        S.setBounds(570,200,50,50);
        S.setFont(new Font("Garamond", Font.BOLD,20));
        S.setBorder(BorderFactory.createEtchedBorder());

        D = new JButton("D");
        D.setFocusPainted(false);
        D.setBounds(620,200,50,50);
        D.setFont(new Font("Garamond", Font.BOLD,20));
        D.setBorder(BorderFactory.createEtchedBorder());

        interact = new JButton("Interact");
        interact.setFocusPainted(false);
        interact.setBounds(520,300,150,30);
        interact.setFont(new Font("Garamond", Font.BOLD,20));
        interact.setBorder(BorderFactory.createEtchedBorder());

        int initialX = 40;
        int initialY = 50;
        int yAdder = 0;
        for(int i = 0; i < floorHeight; i++) {
            int xAdder = 0;
            for (int j = 0; j < floorWidth; j++) {
                int tileIndex = i * floorWidth + j;
                if (currentTileIndex == tileIndex) {
                    if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.RegularTile) {
                        ColoredSquare regularTile1 = new ColoredSquare(initialX + xAdder,initialY + yAdder, 45, 45, Color.GRAY,"@");
                        regularTile1.setBounds(initialX + xAdder,initialY + yAdder, 45, 45);
                        mainFrame.add(regularTile1);
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.SpawnTile) {
                        ColoredSquare spawnTile1 = new ColoredSquare(initialX + xAdder,initialY + yAdder, 45, 45, Color.BLUE,"@");
                        spawnTile1.setBounds(initialX + xAdder,initialY + yAdder, 45, 45);
                        mainFrame.add(spawnTile1);
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.BossTile) {
                        ColoredSquare spawnBoss1 = new ColoredSquare(initialX + xAdder,initialY + yAdder, 45, 45, Color.RED,"@");
                        spawnBoss1.setBounds(initialX + xAdder,initialY + yAdder, 45, 45);
                        mainFrame.add(spawnBoss1);
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.DoorTile) {
                        ColoredSquare doorTile1 = new ColoredSquare(initialX + xAdder,initialY + yAdder, 45, 45, Color.ORANGE,"@");
                        doorTile1.setBounds(initialX + xAdder,initialY + yAdder, 45, 45);
                        mainFrame.add(doorTile1);
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.FastTravelTile) {
                        ColoredSquare fastTravelTile1 = new ColoredSquare(initialX + xAdder,initialY + yAdder, 45, 45, Color.GREEN,"@");
                        fastTravelTile1.setBounds(initialX + xAdder,initialY + yAdder, 45, 45);
                        mainFrame.add(fastTravelTile1);
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.CreditsTile) {
                        ColoredSquare creditsTile1 = new ColoredSquare(initialX + xAdder,initialY + yAdder, 45, 45, Color.magenta,"@");
                        creditsTile1.setBounds(initialX + xAdder,initialY + yAdder, 45, 45);
                        mainFrame.add(creditsTile1);
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.OutOfBounds) {
                        ColoredSquare outofBounds1 = new ColoredSquare(initialX + xAdder,initialY + yAdder, 45, 45, Color.black,"@");
                        outofBounds1.setBounds(initialX + xAdder,initialY + yAdder, 45, 45);
                        mainFrame.add(outofBounds1);
                    }
                } else {
                    if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.RegularTile) {
                        ColoredSquare regularTile2 = new ColoredSquare(initialX + xAdder,initialY + yAdder, 45, 45, Color.GRAY,"");
                        regularTile2.setBounds(initialX + xAdder,initialY + yAdder, 45, 45);
                        mainFrame.add(regularTile2);
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.SpawnTile) {
                        ColoredSquare spawnTile2 = new ColoredSquare(initialX + xAdder,initialY + yAdder, 45, 45, Color.BLUE,"");
                        spawnTile2.setBounds(initialX + xAdder,initialY + yAdder, 45, 45);
                        mainFrame.add(spawnTile2);
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.BossTile) {
                        ColoredSquare spawnBoss2 = new ColoredSquare(initialX + xAdder,initialY + yAdder, 45, 45, Color.RED,"");
                        spawnBoss2.setBounds(initialX + xAdder,initialY + yAdder, 45, 45);
                        mainFrame.add(spawnBoss2);
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.DoorTile) {
                        ColoredSquare doorTile2 = new ColoredSquare(initialX + xAdder,initialY + yAdder, 45, 45, Color.ORANGE,"");
                        doorTile2.setBounds(initialX + xAdder,initialY + yAdder, 45, 45);
                        mainFrame.add(doorTile2);
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.FastTravelTile) {
                        ColoredSquare fastTravelTile2 = new ColoredSquare(initialX + xAdder,initialY + yAdder, 45, 45, Color.GREEN,"");
                        fastTravelTile2.setBounds(initialX + xAdder,initialY + yAdder, 45, 45);
                        mainFrame.add(fastTravelTile2);
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.CreditsTile) {
                        ColoredSquare creditsTile2 = new ColoredSquare(initialX + xAdder,initialY + yAdder, 45, 45, Color.magenta,"");
                        creditsTile2.setBounds(initialX + xAdder,initialY + yAdder, 45, 45);
                        mainFrame.add(creditsTile2);
                    } else if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(tileIndex).getTileType() == Tile.TileType.OutOfBounds) {
                        ColoredSquare outofBounds2 = new ColoredSquare(initialX + xAdder,initialY + yAdder, 45, 45, Color.black,"");
                        outofBounds2.setBounds(initialX + xAdder,initialY + yAdder, 45, 45);
                        mainFrame.add(outofBounds2);
                    }
                }
                xAdder = xAdder + 45;
            }
            yAdder = yAdder + 45;
        }

        JLabel HP = new JLabel("HP: " + character.getCurrentHp() + "/" + character.getMaxHp());
        HP.setForeground(Color.WHITE);
        HP.setBounds(500,40,500,30);
        HP.setFont(new Font("Garamond", Font.BOLD,30));

        JLabel runes = new JLabel("Runes: " + character.getRunes());
        runes.setForeground(Color.WHITE);
        runes.setBounds(500,70,500,30);
        runes.setFont(new Font("Garamond", Font.BOLD,30));

        this.feedbackLabel = new JLabel();
        this.feedbackLabel.setForeground(Color.RED);
        this.feedbackLabel.setBounds(530,225,200,100);
        this.feedbackLabel.setFont(new Font("Garamond", Font.BOLD, 15));

        mainFrame.add(areaNameText);
        mainFrame.add(W);
        mainFrame.add(A);
        mainFrame.add(S);
        mainFrame.add(D);
        mainFrame.add(interact);
        mainFrame.add(feedbackLabel);
        mainFrame.add(runes);
        mainFrame.add(HP);

        mainFrame.setVisible(true);
    }
    public void setFeedbackLabel(String text) {
        feedbackLabel.setText(text);
    }
    public void addWActionListener(ActionListener listener){
        W.addActionListener(listener);
    }
    public void addAActionListener(ActionListener listener){
        A.addActionListener(listener);
    }
    public void addSActionListener(ActionListener listener){
        S.addActionListener(listener);
    }
    public void addDActionListener(ActionListener listener){
        D.addActionListener(listener);
    }
    public void addInteractAddActionListener(ActionListener listener){
        interact.addActionListener(listener);
    }
    public Tile.TileType getCurrentTileType(Character character){
        return character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(character.getCurrentTileIndex()).getTileType();
    }
    public boolean canMoveUp(Character character){
        int movingTo = character.getCurrentTileIndex() - character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getWidth();
        if (movingTo < 0 || character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(movingTo).getTileType() == Tile.TileType.OutOfBounds) {
            return false;
        } else {
            return true;
        }
    }
    public boolean canMoveLeft(Character character){
        int currentTileIndex = character.getCurrentTileIndex();
        int movingTo = currentTileIndex - 1;

        if (currentTileIndex % character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getWidth() == 0 || movingTo < 0 || character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(movingTo).getTileType() == Tile.TileType.OutOfBounds) {
            return false;
        } else {
            return true;
        }
    }
    public boolean canMoveDown(Character character){
        int movingTo = character.getCurrentTileIndex() + character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getWidth();
        if((movingTo >= character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTilesSize()) || character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(movingTo).getTileType() == Tile.TileType.OutOfBounds) {
            return false;
        } else {
            return true;
        }
    }
    public boolean canMoveRight(Character character){
        if (character.getCurrentTileIndex() % character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getWidth() != character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getWidth() - 1) {
            int movingTo = character.getCurrentTileIndex() + 1;
            if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(movingTo).getTileType() == Tile.TileType.OutOfBounds) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public void dispose(){
        mainFrame.dispose();
    }
}
