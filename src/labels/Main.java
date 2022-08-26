package labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JLabel  = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("images\\logo_gs.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);

        JLabel label = new JLabel(); // create a label
        label.setText("Bro, do you even code!"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, RİGHT, CENTER  of image icon
        label.setVerticalTextPosition(JLabel.CENTER); //set text TOP, CENTER, BOTTOM of image icon
        label.setForeground(new Color(0x00FF00)); //set text font color
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); //set text font
        label.setIconTextGap(-25); //set gap of text to image
        label.setBackground(Color.BLACK); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border); //set border
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position icon+text within label
        //label.setBounds(100,100,250,250); //set x,y position within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); //run after frame.add(label)
    }
}
