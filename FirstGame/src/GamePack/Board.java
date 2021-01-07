package GamePack;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;




public class Board extends JPanel implements ActionListener  {

    private final int ISHIP_X=40;
    private final int ISHIP_Y=60;
    private Timer timer;
    private SpaceShip spaceShip;
    private final int DELAY =10;




    public Board()
    {
    initBoard();
    }

    private void initBoard() {
        addKeyListener(new TAdapter());
        setBackground(Color.BLACK);
        setFocusable(true);
        SpaceShip spaceShip=new SpaceShip(ISHIP_X,ISHIP_Y);
       Timer timer=new Timer(DELAY,this); //timer makes duration of actions
         timer.start();
    }

  //override class
    public void paintComponent(Graphics g) {
        super.paint(g);
        //g.fillOval(10,10,100,100);
        doDrawing(g);
    Toolkit.getDefaultToolkit().sync();
    }

    public void doDrawing(Graphics g) {

        Graphics2D g2d =(Graphics2D) g;

        g2d.drawImage(spaceShip.getImage(),spaceShip.getX(),spaceShip.getY(), this);

        java.util.List<Missile>missiles=spaceShip.getMissiles();

        for (Missile missile:missiles) {

            g2d.drawImage(missile.getImage(),missile.getX(),missile.getY(),this); //missiles made in the screen

        }


    }


    public void actionPerformed(ActiveEvent e)
    {
        ShootMissiles();
        updateShip();
        repaint();
    }

    private void updateShip() {
        spaceShip.move();

    }

    private void ShootMissiles() {

        java.util.List<Missile> missiles=spaceShip.getMissiles();

        for (int i=0;i<missiles.size();i++)
        {
            Missile missile=missiles.get(i);

            if(missile.isVisible())
            {
                missile.move();
            }
            else
            {
                missile.remove();
            }
        }

    }


    public void actionPerformed(ActionEvent e) {

        step();
    }

    public void step()
    {

        spaceShip.move();

        repaint(spaceShip.getX()-1,spaceShip.getY()-1,spaceShip.getHeight()+2,spaceShip.getWidth()+2);

    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            spaceShip.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            spaceShip.keyPressed(e);
        }
    }





}






