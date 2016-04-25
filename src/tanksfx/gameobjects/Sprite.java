package tanksfx.gameobjects;

import javafx.scene.image.Image;

/**
 * Created by ppetrov on 4/25/16.
 */
public class Sprite {
    protected int posX = 0;
    protected int posY = 0;
    protected int velocityX = 0;
    protected int velocityY = 0;
    protected Image spriteImg;


    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    public Image getSpriteImg() {
        return spriteImg;
    }

    public void setSpriteImg(Image spriteImg) {
        this.spriteImg = spriteImg;
    }
}
