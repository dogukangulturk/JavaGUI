package frames;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("JFrame title goes here"); //setss title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevent frame from being resize
        this.setSize(420,420); //set x- dimension, and y- dimension of frame
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("images\\logo_gs.png"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(123,50,250)); //change color of background
    }
}
