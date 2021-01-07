package GamePack;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Sprite {

    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean visible;
    protected Image image;

    public Sprite(int x,int y){

        this.x=x;
        this.y=y;
        visible=true;

    }

    protected void loadImage(String ImageName){

        ImageIcon li=new ImageIcon(ImageName);
        image=li.getImage();

    }

    protected void getImageDimensions(){

        width=image.getWidth(null);
        height=image.getHeight(null);

    }

    public Image getImage()
    {
       return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisible(){

        return visible;
    }

        public void setVisible(boolean visible) {
            this.visible = visible;
        }

}
