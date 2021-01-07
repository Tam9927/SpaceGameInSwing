package GamePack;


import java.awt.*;
import java.awt.image.BufferedImage;

public class Missile extends Sprite {

    private final int BOARD_WIDTH =390;
    private final int MISSILE_SPEED=2;

    public Missile(int x,int y)
    {
        super(x,y);

        initMissile();
    }

    public void initMissile()
    {

        loadImage("src\\resources\\star.png");
        getImageDimensions();

    }


    public Image getImage() {

        return image;

    }




    public void move()
    {
        x+=MISSILE_SPEED;

    }
    public void remove()
    {
        if(x>BOARD_WIDTH)
        {
            setVisible(false);
        }


    }







}
