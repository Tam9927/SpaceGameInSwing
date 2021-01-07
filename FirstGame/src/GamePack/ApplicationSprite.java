package GamePack;

import javax.swing.*;
import java.awt.*;


public class ApplicationSprite extends JFrame {


    public ApplicationSprite() {

        initUI();
    }


    private void initUI() {


        add(new Board());
        //Board board=new Board();
        //board.setBackground(Color.black);
        //add(board,BorderLayout.CENTER);
        setTitle("Moving Ship");
        setSize(500, 400);



        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {


            ApplicationSprite app = new ApplicationSprite();
            app.setVisible(true);

        });

    }

}











