package GamePack;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class SpaceShip extends Sprite {

    private int dx;
    private int dy;
    private int x=40;
    private int y=60;
    private int w;
    private int h;
    private Image image;
    private List<Missile> missiles;


    public SpaceShip(int x,int y){

        super(x,y);
        initSpaceShip();
        loadImage(" src/resources/star.png");

    }


    public void initSpaceShip()
    {

        missiles=new ArrayList<>();
        getImage();
       getImageDimensions();

    }


    public void move() {

        x+=dx;
        y+=dy;

    }

    public List <Missile> getMissiles(){

        return missiles;
    }

    public int getX() {

        return x;

    }

    public int getY(){

        return y;
    }

    public int getWidth()
    {
        return w;

    }


    public int getHeight(){

        return h;
    }

    public Image getImage() {

        return image;

    }

    public void keyPressed(KeyEvent e){

        int key =e.getKeyCode();

        if(key==KeyEvent.VK_SPACE)
        {
            load();
        }

        if(key==KeyEvent.VK_LEFT){

            dx=-2;
        }

        if(key==KeyEvent.VK_RIGHT){

            dx=2;
        }

        if(key==KeyEvent.VK_UP){

            dy=-2;
        }

        if(key==KeyEvent.VK_DOWN)
        {
            dy=2;
        }

    }

    public void load()
    {
        missiles.add(new Missile(x+width,y+height/2));
    }



    public void keyReleased(KeyEvent e) {

        int key =e.getKeyCode();

        if(key==KeyEvent.VK_LEFT){

            dx=-2;
        }

        if(key==KeyEvent.VK_RIGHT){

            dx=2;
        }

        if(key==KeyEvent.VK_UP){

            dy=-2;
        }

        if(key==KeyEvent.VK_DOWN)
        {
            dy=2;
        }

    }

}

