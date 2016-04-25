package tanksfx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import tanksfx.gameobjects.Sprite;
import tanksfx.gameobjects.tiles.Brick;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {

    private static final String PWD = System.getProperty("user.dir");

    private static final int CONTAINER_RECT_X = 600;
    private static final int CONTAINER_RECT_Y = 600;
    private static final int RECT_X = 600;
    private static final int RECT_Y = 600;
    private static final int TILE_SIZE_SQUARE = 30;

    ArrayList<Sprite> tiles;

    @Override
    public void start(Stage primaryStage) throws Exception{
        tiles = new ArrayList<>();
        Group root = new Group();
        primaryStage.setTitle("TanksFX");
        //game UI container
        Scene scene = new Scene(root, CONTAINER_RECT_X, CONTAINER_RECT_Y);

        //TODO: Implement score and display in on different canvas
        //gameplay canvas
        Canvas canvas = new Canvas(RECT_X, RECT_Y);
        root.getChildren().add(canvas);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        initializeLevel();
        drawLevel(graphicsContext);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private void initializeLevel() {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(PWD.concat("/src/res/levels/level1")))) {
            int y = 0;
            String line;
            while ((line = fileReader.readLine()) != null) {
                for(int i = 0; i < line.length(); i++) {
                    //see TileTypes enum for the tile codes
                    switch (line.charAt(i)) {
                        case 0x30: { //empty tile, do nothing
                        }
                        break;
                        case 0x31: { //bricks
                            tiles.add(new Brick(i * TILE_SIZE_SQUARE, y));
                        }
                        break;
                        case 0x32: { //concrete

                        }
                        break;
                        case 0x33: { //grass

                        }
                        break;
                        case 0x34: { //base

                        }
                        break;
                        case 0x35: { //enemy spawn point

                        }
                        break;
                        case 0x36: { //player 1 spawn point

                        }
                        break;
                        case 0x37: { //player 2 spawn point

                        }
                        break;
                        case 0x38: {

                        }
                        break;
                        default: {
                            //no such tile
                        }
                    }
                }
                //increment x to draw next line on the next cycle
                y+= TILE_SIZE_SQUARE;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void drawLevel(GraphicsContext context) {
        for (Sprite tile : tiles) {
            context.drawImage(tile.getSpriteImg(), tile.getPosX(), tile.getPosY());
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
