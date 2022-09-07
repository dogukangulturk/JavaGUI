package JOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //JOptionPane =     pop up a standard dialog box that prompts users for a value
        //                  or informs them of something

        //! showMessageDialog
        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Here is more useless info :D", "title",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"really?", "title",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"You are computer has a virus!!!", "title",JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Call tech support now!!!", "title",JOptionPane.ERROR_MESSAGE);

        //! showConfirmDialog
        //JOptionPane.showConfirmDialog(null,"do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        //System.out.println(JOptionPane.showConfirmDialog(null,"do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION));
        //int answer = JOptionPane.showConfirmDialog(null,"do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);

        //! showInputDialog
        //String name = JOptionPane.showInputDialog("What's your name?");
        //System.out.println(name);

        //! showOptionDialog
        ImageIcon icon = new ImageIcon("images\\thumbsup.png");
        String[] responses = {"Yes", "No", "Thanks"};
        JOptionPane.showOptionDialog(null,
                "You are awesome",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);
    }
}
