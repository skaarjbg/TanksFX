package tanksfx.gameobjects.tanks;

import javafx.scene.image.Image;

/**
 * Created by ppetrov on 4/25/16.
 */
public class FastTank extends BaseTank {
    private static final String IMAGE_PATH = "res/images/tanks/tank_enemy_fast";
    private static final int ARMOR = 1;
    private static final int SPEED = 3;
    private static final int BULLET_SPEED = 2;
    private static final int POINTS = 200;

    public FastTank(int posX, int posY) {
        super(ARMOR, SPEED, BULLET_SPEED, POINTS, new Image(IMAGE_PATH));
        this.posX = posX;
        this.posY = posY;
    }
}
