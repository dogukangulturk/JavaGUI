package buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("images\\pointfinger.png");
        ImageIcon labelIcon = new ImageIcon("images\\thumbsup.png");

        label = new JLabel();
        label.setIcon(labelIcon);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(this);
        button.setText("I'm a button!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-5);
        button.setForeground(Color.CYAN); // ! Change the text color of button
        button.setBackground(Color.lightGray); // ! Change background color
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.addActionListener(e -> System.out.println("poo")); // Lambda expressions version
        //button.setEnabled(false); //! Disable the button

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            //System.out.println("poo");
            //button.setEnabled(false); //Make the button one time clickable
            label.setVisible(!label.isVisible());
        }
    }
}
