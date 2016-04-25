package tanksfx.gameobjects.tanks;

import javafx.scene.image.Image;

/**
 * Created by ppetrov on 4/25/16.
 */
public class BasicTank extends BaseTank {
    private static final String IMAGE_PATH = "res/images/tanks/tank_enemy_base";
    private static final int ARMOR = 1;
    private static final int SPEED = 1;
    private static final int BULLET_SPEED = 1;
    private static final int POINTS = 100;

    public BasicTank(int posX, int posY) {
        super(ARMOR, SPEED, BULLET_SPEED, POINTS, new Image(IMAGE_PATH));
        this.posX = posX;
        this.posY = posY;
    }
}
